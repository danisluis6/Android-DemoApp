package com.example.enclaveit.appdemo.ui.activities;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Toast;

import com.example.enclaveit.appcontacts.R;

public class DemoActivity extends Activity {

    private static final String TAG = "MyDebugMessage";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        intiComponents();
        setContentView(R.layout.demo_activity);
        Log.d(TAG,"onCreate");
        Toast.makeText(DemoActivity.this,"onCreate",Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onStart(){
        super.onStart();
        Log.d(TAG,"onStart");
        Toast.makeText(DemoActivity.this,"onStart",Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onResume(){
        super.onResume();
        Log.d(TAG,"onResume");
        Toast.makeText(DemoActivity.this,"onResume",Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onPause(){
        super.onPause();
        Log.d(TAG,"onPause");
        Toast.makeText(DemoActivity.this,"onPause",Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onStop(){
        super.onStop();
        Log.d(TAG,"onStop");
        Toast.makeText(DemoActivity.this,"onStop",Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onDestroy(){
        super.onDestroy();
        Log.d(TAG,"onDestroy");
        Toast.makeText(DemoActivity.this,"onDestroy",Toast.LENGTH_SHORT).show();
    }

    private void intiComponents() {
        /**
         * Set fullscreen and title
         */
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
    }
}
