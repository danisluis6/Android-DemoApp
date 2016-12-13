package com.example.enclaveit.puzzleanimation.ui.activities;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import android.widget.TextView;

import com.example.enclaveit.puzzleanimation.R;
import com.example.enclaveit.puzzleanimation.utils.CustomFonts;
import com.example.enclaveit.puzzleanimation.utils.ExplicitListener;

import java.util.ArrayList;
import java.util.List;

public class PuzzleAnimation extends Activity {



    private TextView txttitle;
    private TextView txtdemo;

    private Context context;
    private List<String> titles = new ArrayList<String>();
    private List<String> demos = new ArrayList<String>();

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
        initContents();
        for(int i=0;i<titles.size();i++){
            int resIdTitle = getResources().getIdentifier(titles.get(i), "id", getPackageName());
            txttitle = (TextView)this.findViewById(resIdTitle);
            txttitle.setTypeface(new CustomFonts(context).setFont("Roboto-Light"));

            int resIdDemo = getResources().getIdentifier(demos.get(i), "id", getPackageName());
            txtdemo = (TextView)this.findViewById(resIdDemo);
        }
    }

    private void addOnLongListener(){
        txttitle.setOnLongClickListener(new ExplicitListener(PuzzleAnimation.this));
        txtdemo.setOnClickListener(new ExplicitListener(PuzzleAnimation.this));
    }

    private void initContents(){
        // array contains titles
        titles.add("fadein");
        titles.add("fadeout");
        titles.add("crossfading");
        titles.add("blink");
        titles.add("zoomin");
        titles.add("rotate");
        titles.add("move");
        titles.add("slideup");
        titles.add("slidedown");
        titles.add("bounce");
        titles.add("sequential");
        titles.add("together");

        // array contains demos
        demos.add("fadeindemo");
        demos.add("fadeoutdemo");
        demos.add("crossfadingdemo");
        demos.add("blinkdemo");
        demos.add("zoomindemo");
        demos.add("rotatedemo");
        demos.add("movedemo");
        demos.add("slideupdemo");
        demos.add("slidedowndemo");
        demos.add("bounce");
        demos.add("sequentialdemo");
        demos.add("togetherdemo");
    }
}
