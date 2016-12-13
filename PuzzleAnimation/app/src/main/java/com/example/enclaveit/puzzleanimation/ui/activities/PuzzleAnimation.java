package com.example.enclaveit.puzzleanimation.ui.activities;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

import com.example.enclaveit.puzzleanimation.R;
import com.example.enclaveit.puzzleanimation.utils.CustomFonts;

public class PuzzleAnimation extends Activity {

    private Animation fadein;
    private TextView txttitle;
    private TextView txtdemo;

    private Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        configuras();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.demo);
        initComponents();
        addOnLongListener();
    }

    private void configuras(){
        /**
         * Set fullscreen and title
         */
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        context = PuzzleAnimation.this;
    }

    private void initComponents(){
        fadein = AnimationUtils.loadAnimation(context.getApplicationContext(),R.anim.fade);
        txttitle = (TextView)this.findViewById(R.id.fadein);
        txttitle.setTypeface(new CustomFonts(PuzzleAnimation.this).setFont("Roboto-Light"));
    }

    private void addOnLongListener(){
        txttitle.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                txttitle.startAnimation(fadein);
                return false;
            }
        });
    }
}
