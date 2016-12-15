package com.example.enclaveit.appcontacts.ui.activities;

import android.app.Activity;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Toast;

import com.example.enclaveit.appcontacts.R;

public class PuzzleFragment extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        configuras();
        setContentView(R.layout.activity_main);
        Toast.makeText(PuzzleFragment.this,"Welcome with first application!",Toast.LENGTH_LONG);
    }

    private void configuras(){
        /**
         * Set fullscreen and title
         */
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
    }
}
