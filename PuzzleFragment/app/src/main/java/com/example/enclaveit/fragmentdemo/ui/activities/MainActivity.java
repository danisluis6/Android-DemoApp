package com.example.enclaveit.fragmentdemo.ui.activities;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.RelativeLayout;
import android.widget.Toast;

import com.example.enclaveit.fragmentdemo.R;
import com.example.enclaveit.fragmentdemo.ui.activities.chapterone.BookActivity;
import com.example.enclaveit.fragmentdemo.utils.ExplicitListener;

public class MainActivity extends Activity {

    private RelativeLayout categoria1;
    private RelativeLayout categoria2;
    private RelativeLayout categoria3;
    private RelativeLayout categoria4;
    private RelativeLayout categoria5;
    private RelativeLayout categoria6;
    private RelativeLayout categoria7;
    private RelativeLayout categoria8;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        configuras();
        setContentView(R.layout.activity_main);
        initComponents();
        addOnListenerCall();
    }

    private void configuras(){
        /**
         * Set fullscreen and title
         */
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
    }

    private void initComponents() {
        categoria1 = (RelativeLayout)this.findViewById(R.id.catagoria1);
        categoria2 = (RelativeLayout)this.findViewById(R.id.catagoria2);
        categoria3 = (RelativeLayout)this.findViewById(R.id.catagoria3);
        categoria4 = (RelativeLayout)this.findViewById(R.id.catagoria4);
        categoria5 = (RelativeLayout)this.findViewById(R.id.catagoria5);
        categoria6 = (RelativeLayout)this.findViewById(R.id.catagoria6);
        categoria7 = (RelativeLayout)this.findViewById(R.id.catagoria7);
        categoria8 = (RelativeLayout)this.findViewById(R.id.catagoria8);
    }

    private void addOnListenerCall() {
        categoria1.setOnClickListener(new ExplicitListener(MainActivity.this));
    }
}
