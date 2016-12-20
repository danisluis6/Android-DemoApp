package com.example.enclaveit.appdemo.ui.intent;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Toast;

import com.example.enclaveit.appcontacts.R;

public class DemoExplicit extends Activity {

    private final Context context = this;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        configures();
        setContentView(R.layout.activity_demo_explicit);
        getExtrasMessage();
    }

    protected void configures(){
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
    }

    protected void getExtrasMessage(){
        Intent intent = getIntent();
        Bundle bundle = intent.getBundleExtra("TEST");
        Toast.makeText(context.getApplicationContext(),String.valueOf(bundle.getString("message")),Toast.LENGTH_LONG).show();
    }
}
