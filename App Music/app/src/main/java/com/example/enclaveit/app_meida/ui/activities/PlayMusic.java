package com.example.enclaveit.app_meida.ui.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Window;

import com.example.enclaveit.app_meida.R;

public class PlayMusic extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        configuras();
        setContentView(R.layout.music_play);
        initComponents();
        addOnListener();
    }

    private void configuras(){
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
    }

    private void initComponents(){

    }

    private void addOnListener(){

    }
}
