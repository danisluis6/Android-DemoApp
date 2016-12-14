package com.example.enclaveit.puzzleintent.ui.activities;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;

import com.example.enclaveit.puzzleintent.R;
import com.example.enclaveit.puzzleintent.algorithm.InterfaceReversePolishNotation;
import com.example.enclaveit.puzzleintent.lib.IntefacePriority;
import com.example.enclaveit.puzzleintent.utils.CustomFonts;

import java.util.Stack;

public class MainActivity extends Activity implements IntefacePriority,InterfaceReversePolishNotation {

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
    private String result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        configuras();
        setContentView(R.layout.activity_main);
        initComponents();
        addOnListener();
    }

    private void configuras() {
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
    }

    private void initComponents(){
        showEnter = (EditText) this.findViewById(R.id.enterNumber);
        showEnter.setTypeface(new CustomFonts(MainActivity.this).setFont("Roboto-Medium"));

        showOperator = (EditText)this.findViewById(R.id.showNumber);
        showOperator.setTypeface(new CustomFonts(MainActivity.this).setFont("Roboto-Black"));

        btC = (Button)this.findViewById(R.id.btC);
        btCC = (Button)this.findViewById(R.id.btCC);
        btCCC = (Button)this.findViewById(R.id.btCCC);

        btAdd = (Button)this.findViewById(R.id.btAdd);
        btSub = (Button)this.findViewById(R.id.btSub);
        btMul = (Button)this.findViewById(R.id.btMul);
        btDiv = (Button)this.findViewById(R.id.btDiv);

        btZero = (Button)this.findViewById(R.id.btZero);
        btOne = (Button)this.findViewById(R.id.btOne);
        btTwo = (Button)this.findViewById(R.id.btTwo);
        btThree = (Button)this.findViewById(R.id.btThree);
        btFour = (Button)this.findViewById(R.id.btFour);
        btFive = (Button)this.findViewById(R.id.btFive);
        btSix = (Button)this.findViewById(R.id.btSix);
        btSeven = (Button)this.findViewById(R.id.btSeven);
        btEight = (Button)this.findViewById(R.id.btEight);
        btNine = (Button)this.findViewById(R.id.btNine);

        btDot = (Button)this.findViewById(R.id.btDot);
        btResult = (Button)this.findViewById(R.id.btResult);
    }
    private void addOnListener(){
        // Add event for button
        btZero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                text += String.valueOf(btZero.getText());
                showEnter.setText(String.valueOf(text));
            }
        });
        btOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                text += String.valueOf(btOne.getText());
                showEnter.setText(String.valueOf(text));
            }
        });
        btTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                text += String.valueOf(btTwo.getText());
                showEnter.setText(String.valueOf(text));
            }
        });
        btThree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                text += String.valueOf(btThree.getText());
                showEnter.setText(String.valueOf(text));
            }
        });
        btFour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                text += String.valueOf(btFour.getText());
                showEnter.setText(String.valueOf(text));
            }
        });
        btFive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                text += String.valueOf(btFive.getText());
                showEnter.setText(String.valueOf(text));
            }
        });
        btSix.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                text += String.valueOf(btSix.getText());
                showEnter.setText(String.valueOf(text));
            }
        });
        btSeven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                text += String.valueOf(btSeven.getText());
                showEnter.setText(String.valueOf(text));
            }
        });
        btEight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                text += String.valueOf(btEight.getText());
                showEnter.setText(String.valueOf(text));
            }
        });
        btNine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                text += String.valueOf(btNine.getText());
                showEnter.setText(String.valueOf(text));
            }
        });
        // Add event for other function button
        btAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                text += String.valueOf(btAdd.getText());
                showEnter.setText(String.valueOf(text));
            }
        });
        btSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                text += String.valueOf(btSub.getText());
                showEnter.setText(String.valueOf(text));
            }
        });
        btMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                text += String.valueOf(btMul.getText());
                showEnter.setText(String.valueOf(text));
            }
        });
        btDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                text += String.valueOf(btDiv.getText());
                showEnter.setText(String.valueOf(text));
            }
        });
        // Add event for other button
        btDot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                text += String.valueOf(btDot.getText());
                showEnter.setText(String.valueOf(text));
            }
        });
        // btResult.setOnClickListener(new ExplicitEvent(enterNumber,showNumber));
        btC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        btCC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        btCCC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        btResult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
    }

    @Override
    public int priority(char c) {
        int temp = 0;
        if(c == '+' || c == '-'){
            temp = 1;
        }
        if(c == '*' || c == ':'){
            temp = 2;
        }
        return temp;
    }

    @Override
    public String convert() {
        String result;
        Stack<String> operator = new Stack<String>();
        return null;
    }
}