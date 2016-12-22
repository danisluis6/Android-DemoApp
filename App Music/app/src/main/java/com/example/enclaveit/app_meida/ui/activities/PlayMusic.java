package com.example.enclaveit.app_meida.ui.activities;

import android.content.Context;
import android.media.MediaPlayer;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;

import com.example.enclaveit.app_meida.R;
import com.example.enclaveit.app_meida.lib.LibraryString;

public class PlayMusic extends AppCompatActivity implements View.OnClickListener{

    private ImageView btnPlay;
    private ImageView btnRandom;
    private ImageView btnRepeat;
    private TextView timestart;
    private TextView timeend;

    private ProgressBar progressBar;
    private Handler progressBarHandler = new Handler();

    private Context context = this;
    private MediaPlayer mediaPlayer;


    /**
     * Create a variable to loop
     * @param savedInstanceState
     */
    private int activePlay = 1;
    private int activeRepeat = 1;
    private int activeRandom = 1;

    private long fileSize = 0;
    private int progressBarStatus = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        configuras();
        setContentView(R.layout.music_play);
        mediaPlayer = setSongMusic("seeyouagain");
        initComponents();
        addOnListener();
    }

    private MediaPlayer setSongMusic(String song) {
        /**
         * You can change the path, here path is external directory(e.g. sdcard)
         */
        int resId = getResources().getIdentifier(song,"raw", getPackageName());
        MediaPlayer mp = MediaPlayer.create(PlayMusic.this,resId);
        return mp;
    }

    private void configuras(){
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
    }

    private void initComponents(){
        btnPlay = (ImageView)this.findViewById(R.id.btnPlay);
        btnRandom = (ImageView)this.findViewById(R.id.btnRandom);
        btnRepeat = (ImageView)this.findViewById(R.id.btnRepeat);

        /**
         * Time of song
         */
        timestart = (TextView)this.findViewById(R.id.timestart);
        timeend = (TextView)this.findViewById(R.id.timeend);

        /**
         * ProgressBar
         */
        progressBar = (ProgressBar)this.findViewById(R.id.simpleProgressBar);
        progressBar.setProgress(0);
        progressBar.setMax(mediaPlayer.getDuration()/1000);
    }

    private void addOnListener(){
        btnRandom.setOnClickListener(this);
        btnRepeat.setOnClickListener(this);
        btnPlay.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if(view.getId() == R.id.btnPlay){
            if(activePlay == 1){
                if(!mediaPlayer.isPlaying()){
                    view.startAnimation(AnimationUtils.loadAnimation(this,R.anim.alpha));
                    btnPlay.setImageResource(R.drawable.playmusic_ic_pause);
                    mediaPlayer.start();
                    /**
                     * Time to start sing any song
                     * You using settime is 00:00
                     */
                    progressBarStatus = 0;
                    new Thread(new Runnable() {
                        public void run() {
                            while (progressBarStatus < (mediaPlayer.getDuration()/1000)) {
                                // process some tasks
                                progressBarStatus = doSomeTasks();
                                // your computer is too fast, sleep 1 second
                                try {
                                    Thread.sleep(1000);
                                } catch (InterruptedException e) {
                                    e.printStackTrace();
                                }
                                // Update the progress bar
                                progressBarHandler.post(new Runnable() {
                                    public void run() {
                                        progressBar.setProgress(progressBarStatus);
                                        // Update the time
                                        timestart.setText(String.valueOf(LibraryString.convertToTimeMMSS(progressBarStatus)));
                                        timeend.setText(String.valueOf(LibraryString.convertToTimeMMSS(mediaPlayer.getDuration()/1000-progressBarStatus)));
                                    }
                                });
                            }
                            // Ok, Music is playing
                            if (progressBarStatus >= (mediaPlayer.getDuration()/1000)) {
                                // sleep 2 seconds, so that you can see the 100%
                                try {
                                    Thread.sleep(2000);
                                } catch (InterruptedException e) {
                                    e.printStackTrace();
                                }
                            }
                        }
                    }).start();
                }
                activePlay = 0;
            }else if(activePlay == 0){
                if(mediaPlayer.isPlaying()){
                    view.startAnimation(AnimationUtils.loadAnimation(this,R.anim.alpha));
                    btnPlay.setImageResource(R.drawable.playmusic_ic_play);
                    mediaPlayer.pause();
                }
                activePlay = 1;
            }
        }

        if(view.getId() == R.id.btnRepeat){
            if(mediaPlayer.isPlaying()){
                if(activeRepeat == 1){
                    mediaPlayer.setLooping(true);
                    btnRepeat.setAlpha(0.4f);
                    activeRepeat = 0;
                }else if(activeRepeat == 0){
                    mediaPlayer.setLooping(false);
                    btnRepeat.setAlpha(1.0f);
                    activeRepeat = 1;
                }
            }
        }

        if(view.getId() == R.id.btnRandom){
            if(activeRandom == 1){
                mediaPlayer.setLooping(true);
                btnRandom.setAlpha(0.4f);
                activeRandom = 0;
            }else if(activeRandom == 0){
                mediaPlayer.setLooping(false);
                btnRandom.setAlpha(1.0f);
                activeRandom = 1;
            }
        }
    }

    /**
     * file download simulator... a really simple
     */
    public int doSomeTasks() {
        while (fileSize <= (mediaPlayer.getDuration()/1000)){
            fileSize++;
            return (int)fileSize;
        }
        return (mediaPlayer.getDuration()/1000);
    }
}
