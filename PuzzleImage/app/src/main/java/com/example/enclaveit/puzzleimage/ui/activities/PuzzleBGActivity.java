package com.example.enclaveit.puzzleimage.ui.activities;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.RelativeLayout;
import android.widget.Toast;

import com.example.enclaveit.puzzleimage.R;
import com.example.enclaveit.puzzleimage.utils.AnimationLibrary;
import com.example.enclaveit.puzzleimage.utils.BackgroundLibrary;

import java.util.Calendar;
import java.util.Random;

import static com.example.enclaveit.puzzleimage.R.id.txttime;

public class PuzzleBGActivity extends Activity {

    private RelativeLayout layoutPuzzle;
    private AnimationLibrary animationEffect;
    private BackgroundLibrary listBG;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        configuras();
        setContentView(R.layout.main_activity_background);
        initComponents();
        addBackgroundForApp();
        autoLoadBackground();

    }

    private void configuras(){
        /**
         * Set fullscreen and no title
         */
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        animationEffect = new AnimationLibrary(PuzzleBGActivity.this);
        listBG = new BackgroundLibrary();
    }

    private void initComponents(){
        this.layoutPuzzle = (RelativeLayout)this.findViewById(R.id.puzzlelayout);
    }

    private void addBackgroundForApp(){
        layoutPuzzle.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                Toast.makeText(PuzzleBGActivity.this,"OK",Toast.LENGTH_LONG).show();
                return false;
            }
        });
    }

    private void autoLoadBackground() {
        Thread time = new Thread() {
            public void run() {
                while (true){
                    synchronized (this){
                        try {
                            wait(1000);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        runOnUiThread(new Runnable() {
                            @Override
                            public void run() {
                                Calendar calendar = Calendar.getInstance();
                                if(Integer.parseInt(String.valueOf(calendar.get(Calendar.SECOND)))%2 == 0){
                                    layoutPuzzle.setAnimation(animationEffect.slide());
                                    layoutPuzzle.setBackgroundResource(listBG.randImage());
                                }
                            }
                        });
                    }
                }
            }
        };
        time.start();
    }
}
