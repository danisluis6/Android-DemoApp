package com.example.enclaveit.fragmentdemo.ui.activities.chapterone;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Window;

import com.example.enclaveit.fragmentdemo.R;

/**
 * @author
 * @author enclaveit  The activity displays a list of five book titles in the top portion of the activity.
 * When the user selects one of those books titles, the description of that book
 * appears in the bottom portion of the activity.
 */
public class BookActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        configuras();
        setContentView(R.layout.activity_book);
    }

    private void configuras(){
        /**
         * Set fullscreen and title
         */
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
    }
}
