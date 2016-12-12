package com.example.enclaveit.puzzleimage.ui.activities;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.RelativeLayout;
import android.widget.Toast;

import com.example.enclaveit.puzzleimage.R;

public class PuzzleBGActivity extends Activity {

    private RelativeLayout layoutPuzzle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        configuras();
        setContentView(R.layout.main_activity_background);
        initComponents();
        addBackgroundForApp();
    }

    private void configuras(){
        /**
         * Set fullscreen and no title
         */
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
    }

    private void initComponents(){
        this.layoutPuzzle = (RelativeLayout)this.findViewById(R.id.puzzlelayout);
    }

    private void addBackgroundForApp(){
        layoutPuzzle.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                Toast.makeText(PuzzleBGActivity.this,"OK",Toast.LENGTH_LONG).show();
                return false;
            }
        });
    }
}
