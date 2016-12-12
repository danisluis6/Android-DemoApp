package com.example.enclaveit.puzzleimage.ui.activities;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.enclaveit.puzzleimage.R;
import com.example.enclaveit.puzzleimage.utils.AnimationLibrary;
import com.example.enclaveit.puzzleimage.utils.DateTimeLibrary;
import com.example.enclaveit.puzzleimage.utils.ImagesLibrary;

import java.util.Calendar;
import java.util.Random;

import static java.lang.Thread.sleep;

public class MainPuzzleImage extends Activity {

    private Button btauto,btnext;
    private ImageView img;
    private TextView txttime;

    private ImagesLibrary itemImages;
    private DateTimeLibrary dateTime;
    private AnimationLibrary animationEffect;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        configuras();
        setContentView(R.layout.main_puzzle_layout);
        initComponents();
    }

    private void configuras(){
        /**
         * Set fullscreen and title
         */
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        itemImages = new ImagesLibrary();
        dateTime = new DateTimeLibrary();
        animationEffect = new AnimationLibrary(MainPuzzleImage.this);
    }

    private void initComponents() {
        btauto = (Button)this.findViewById(R.id.btnauto);
        btnext = (Button)this.findViewById(R.id.btnext);
        img = (ImageView)this.findViewById(R.id.img);
        txttime = (TextView)this.findViewById(R.id.txttime);
    }

    public void autoImageRandom(View v){
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
                                txttime.setText(String.valueOf(calendar.get(Calendar.DATE)+":"+calendar.get(Calendar.MONTH)+":"+calendar.get(Calendar.YEAR)+
                                        " "+calendar.get(Calendar.HOUR)+":"+calendar.get(Calendar.MINUTE)+":"+calendar.get(Calendar.SECOND)
                                ));
                                if(Integer.parseInt(String.valueOf(calendar.get(Calendar.SECOND)))%2 == 0){
                                    img.setAnimation(animationEffect.getList().get(new Random().nextInt(animationEffect.getList().size())));
                                    img.setImageResource(itemImages.randImage());
                                }
                            }
                        });
                    }
                }
            }
        };
        time.start();
    }

    public void nextImageHuman(View v){
        img.setImageResource(itemImages.randImage());
    }
}
