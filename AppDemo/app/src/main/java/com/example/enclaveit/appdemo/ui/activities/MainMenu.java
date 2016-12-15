package com.example.enclaveit.appdemo.ui.activities;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.RelativeLayout;

import com.example.enclaveit.appcontacts.R;
import com.example.enclaveit.appdemo.ui.fragment.MainActivity;
import com.example.enclaveit.appdemo.ui.intent.DemoExplicitIntent;
import com.example.enclaveit.appdemo.ui.intent.DemoImplicitIntent;
import com.example.enclaveit.appdemo.ui.layout.TableLayoutActivity;


public class MainMenu extends Activity{

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
        setContentView(R.layout.ui_main);
        initComponents();
        addOnListenerCall();
    }

    private void configuras() {
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
        categoria1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainMenu.this,DemoActivity.class));
            }
        });

        categoria2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainMenu.this,DemoExplicitIntent.class));
            }
        });

        categoria3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainMenu.this,TableLayoutActivity.class));
            }
        });

        categoria4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainMenu.this,DemoImplicitIntent.class));
            }
        });

        categoria5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainMenu.this,MainActivity.class));
            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent intent) {

    }
}
