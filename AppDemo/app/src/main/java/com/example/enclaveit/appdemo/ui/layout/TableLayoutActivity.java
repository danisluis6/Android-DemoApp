package com.example.enclaveit.appdemo.ui.layout;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;

import com.example.enclaveit.appcontacts.R;
import com.example.enclaveit.appdemo.lib.AnimationLibrary;
import com.example.enclaveit.appdemo.lib.CustomFonts;

public class TableLayoutActivity extends Activity {

    private EditText showEnter;
    private EditText showOperator;

    private Button btC;
    private Button btCC;
    private Button btCCC;

    private Button btAdd;
    private Button btSub;
    private Button btMul;
    private Button btDiv;

    private Button btZero;
    private Button btOne;
    private Button btTwo;
    private Button btThree;
    private Button btFour;
    private Button btFive;
    private Button btSix;
    private Button btSeven;
    private Button btEight;
    private Button btNine;

    private Button btDot;
    private Button btResult;

    private String text = "";
    private long result = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        configuras();
        setContentView(R.layout.activity_table_layout);
        initComponents();
        addOnListener();
    }

    private void configuras() {
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
    }

    private void initComponents(){
        showEnter = (EditText) this.findViewById(R.id.enterNumber);
        showEnter.setTypeface(new CustomFonts(TableLayoutActivity.this).setFont("Roboto-Medium"));

        showOperator = (EditText)this.findViewById(R.id.showNumber);
        showOperator.setTypeface(new CustomFonts(TableLayoutActivity.this).setFont("Roboto-Black"));

        btC = (Button)this.findViewById(R.id.btC);
        btC.setAnimation(new AnimationLibrary(TableLayoutActivity.this).fade());

        btCC = (Button)this.findViewById(R.id.btCC);
        btCC.setAnimation(new AnimationLibrary(TableLayoutActivity.this).fade());

        btCCC = (Button)this.findViewById(R.id.btCCC);
        btCCC.setAnimation(new AnimationLibrary(TableLayoutActivity.this).fade());

        btAdd = (Button)this.findViewById(R.id.btAdd);
        btAdd.setAnimation(new AnimationLibrary(TableLayoutActivity.this).fade());

        btSub = (Button)this.findViewById(R.id.btSub);
        btSub.setAnimation(new AnimationLibrary(TableLayoutActivity.this).fade());

        btMul = (Button)this.findViewById(R.id.btMul);
        btMul.setAnimation(new AnimationLibrary(TableLayoutActivity.this).fade());

        btDiv = (Button)this.findViewById(R.id.btDiv);
        btDiv.setAnimation(new AnimationLibrary(TableLayoutActivity.this).fade());

        btZero = (Button)this.findViewById(R.id.btZero);
        btZero.setAnimation(new AnimationLibrary(TableLayoutActivity.this).fade());

        btOne = (Button)this.findViewById(R.id.btOne);
        btOne.setAnimation(new AnimationLibrary(TableLayoutActivity.this).fade());

        btTwo = (Button)this.findViewById(R.id.btTwo);
        btTwo.setAnimation(new AnimationLibrary(TableLayoutActivity.this).fade());

        btThree = (Button)this.findViewById(R.id.btThree);
        btThree.setAnimation(new AnimationLibrary(TableLayoutActivity.this).fade());

        btFour = (Button)this.findViewById(R.id.btFour);
        btFour.setAnimation(new AnimationLibrary(TableLayoutActivity.this).fade());

        btFive = (Button)this.findViewById(R.id.btFive);
        btFive.setAnimation(new AnimationLibrary(TableLayoutActivity.this).fade());

        btSix = (Button)this.findViewById(R.id.btSix);
        btSix.setAnimation(new AnimationLibrary(TableLayoutActivity.this).fade());

        btSeven = (Button)this.findViewById(R.id.btSeven);
        btSeven.setAnimation(new AnimationLibrary(TableLayoutActivity.this).fade());

        btEight = (Button)this.findViewById(R.id.btEight);
        btEight.setAnimation(new AnimationLibrary(TableLayoutActivity.this).fade());

        btNine = (Button)this.findViewById(R.id.btNine);
        btNine.setAnimation(new AnimationLibrary(TableLayoutActivity.this).fade());

        btDot = (Button)this.findViewById(R.id.btDot);
        btDot.setAnimation(new AnimationLibrary(TableLayoutActivity.this).fade());

        btResult = (Button)this.findViewById(R.id.btResult);
        btResult.setAnimation(new AnimationLibrary(TableLayoutActivity.this).fade());
    }

    private void addOnListener(){
        // Add event for button
        btZero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btZero.setAnimation(new AnimationLibrary(TableLayoutActivity.this).alpha());
                text += String.valueOf(btZero.getText());
                showEnter.setText(String.valueOf(text));
            }
        });
        btOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btOne.setAnimation(new AnimationLibrary(TableLayoutActivity.this).alpha());
                text += String.valueOf(btOne.getText());
                showEnter.setText(String.valueOf(text));
            }
        });
        btTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btTwo.setAnimation(new AnimationLibrary(TableLayoutActivity.this).alpha());
                text += String.valueOf(btTwo.getText());
                showEnter.setText(String.valueOf(text));
            }
        });
        btThree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btThree.setAnimation(new AnimationLibrary(TableLayoutActivity.this).alpha());
                text += String.valueOf(btThree.getText());
                showEnter.setText(String.valueOf(text));
            }
        });
        btFour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btFour.setAnimation(new AnimationLibrary(TableLayoutActivity.this).alpha());
                text += String.valueOf(btFour.getText());
                showEnter.setText(String.valueOf(text));
            }
        });
        btFive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btFive.setAnimation(new AnimationLibrary(TableLayoutActivity.this).alpha());
                text += String.valueOf(btFive.getText());
                showEnter.setText(String.valueOf(text));
            }
        });
        btSix.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btSix.setAnimation(new AnimationLibrary(TableLayoutActivity.this).alpha());
                text += String.valueOf(btSix.getText());
                showEnter.setText(String.valueOf(text));
            }
        });
        btSeven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btSeven.setAnimation(new AnimationLibrary(TableLayoutActivity.this).alpha());
                text += String.valueOf(btSeven.getText());
                showEnter.setText(String.valueOf(text));
            }
        });
        btEight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btEight.setAnimation(new AnimationLibrary(TableLayoutActivity.this).alpha());
                text += String.valueOf(btEight.getText());
                showEnter.setText(String.valueOf(text));
            }
        });
        btNine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btNine.setAnimation(new AnimationLibrary(TableLayoutActivity.this).alpha());
                text += String.valueOf(btNine.getText());
                showEnter.setText(String.valueOf(text));
            }
        });
        // Add event for other function button
        btAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                /**
                 * Validate if user enter data ** or xx
                 */
                if(!text.isEmpty()){
                    if(text.charAt(text.length()-1) != '+' && text.charAt(text.length()-1) != '-' && text.charAt(text.length()-1) != 'x' && text.charAt(text.length()-1) != ':'){
                        btAdd.setAnimation(new AnimationLibrary(TableLayoutActivity.this).alpha());
                        text += String.valueOf(btAdd.getText());
                        showEnter.setText(String.valueOf(text));
                    }
                }
            }
        });
        btSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!text.isEmpty()){
                    if(text.charAt(text.length()-1) != '+' && text.charAt(text.length()-1) != '-' && text.charAt(text.length()-1) != 'x' && text.charAt(text.length()-1) != ':'){
                        btSub.setAnimation(new AnimationLibrary(TableLayoutActivity.this).alpha());
                        text += String.valueOf(btSub.getText());
                        showEnter.setText(String.valueOf(text));
                    }
                }
            }
        });
        btMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!text.isEmpty()){
                    if(text.charAt(text.length()-1) != '+' && text.charAt(text.length()-1) != '-' && text.charAt(text.length()-1) != 'x' && text.charAt(text.length()-1) != ':'){
                        btMul.setAnimation(new AnimationLibrary(TableLayoutActivity.this).alpha());
                        text += String.valueOf(btMul.getText());
                        showEnter.setText(String.valueOf(text));
                    }
                }
            }
        });
        btDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!text.isEmpty()){
                    if(text.charAt(text.length()-1) != '+' && text.charAt(text.length()-1) != '-' && text.charAt(text.length()-1) != 'x' && text.charAt(text.length()-1) != ':'){
                        btDiv.setAnimation(new AnimationLibrary(TableLayoutActivity.this).alpha());
                        text += String.valueOf(btDiv.getText());
                        showEnter.setText(String.valueOf(text));
                    }
                }

            }
        });
        // Add event for other button
        btDot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btDot.setAnimation(new AnimationLibrary(TableLayoutActivity.this).alpha());
                text += String.valueOf(btDot.getText());
                showEnter.setText(String.valueOf(text));
            }
        });
        // btResult.setOnClickListener(new ExplicitEvent(enterNumber,showNumber));
        btC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btC.setAnimation(new AnimationLibrary(TableLayoutActivity.this).alpha());
                text = "";
                showEnter.setText(text);
            }
        });
        btCC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btCC.setAnimation(new AnimationLibrary(TableLayoutActivity.this).alpha());
            }
        });
        btCCC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btCCC.setAnimation(new AnimationLibrary(TableLayoutActivity.this).alpha());
            }
        });
        btResult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            }
        });
    }
}
