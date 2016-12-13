package com.example.enclaveit.puzzleimageurl.ui.activities;

import android.app.Activity;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;

import com.example.enclaveit.puzzleimageurl.R;
import com.example.enclaveit.puzzleimageurl.utils.ExplicitListener;

public class MainActivity extends Activity {

    private ImageView imageURL;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        configuras();
        initComponents();
        addOnListener();

        String imageURL = "http://api.androidhive.info/images/sample.jpg";
        /**
         * Structure to coding
         * INPUT: link website when running on browser display image.
         * Writting fragment code process
         * => fragment is same as => Class contain
         * => One or more class work
         * => Let 's start
         */

    }

    private void configuras(){
        /**
         * Set fullscreen and title
         */
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_main);
    }

    private void initComponents(){
        imageURL = (ImageView)this.findViewById(R.id.urlImage);
    }

    private void addOnListener(){
        imageURL.setOnLongClickListener(new ExplicitListener(MainActivity.this));
    }
}
