package com.example.enclaveit.appdemo.ui.intent;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;

import com.example.enclaveit.appcontacts.R;

public class DemoExplicitIntent extends Activity {

    private Button btn;
    private EditText edt;
    private final Context context = this;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        configurates();
        setContentView(R.layout.activity_demo_explicit_intent);
        initcomponets();
        addListenerOnButton();
    }

    protected void configurates(){
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
    }

    protected void initcomponets(){
        btn = (Button)findViewById(R.id.chat);
        edt = (EditText)findViewById(R.id.message);
    }

    protected void addListenerOnButton(){
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context.getApplicationContext(),DemoExplicit.class);
                inputMessage(intent);
                startActivity(intent);
            }
        });
    }

    protected void inputMessage(Intent intent){
        Bundle bundle = new Bundle();
        bundle.putString("message",String.valueOf(edt.getText()));
        intent.putExtra("TEST", bundle);
    }
}
