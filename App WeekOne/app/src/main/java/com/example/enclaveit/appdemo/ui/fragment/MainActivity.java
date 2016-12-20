package com.example.enclaveit.appdemo.ui.fragment;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;

import com.example.enclaveit.appcontacts.R;

public class MainActivity extends Activity {

    private Fragment mFragment1;
    private Fragment mFragment2;
    private FrameLayout mFrContain2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        configuras();
        setContentView(R.layout.activity_main);
        initComponents();
        addOnListener();
    }

    private void configuras() {
        /**
         * Set fullscreen and title
         */
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
    }

    private void initComponents(){
        mFragment1 = new Fragment1();
        mFragment2 = new Fragment2();
        mFrContain2 = (FrameLayout) findViewById(R.id.frContain2);
    }

    private void addOnListener(){
        (findViewById(R.id.btnFragment1)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switchFragment(mFragment1, true, R.id.frContain1);
                mFrContain2.setVisibility(View.GONE);
            }
        });

        (findViewById(R.id.btnFragment2)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switchFragment(mFragment2, true, R.id.frContain1);
                mFrContain2.setVisibility(View.GONE);
            }
        });
        (findViewById(R.id.btnFragment3)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mFrContain2.setVisibility(View.VISIBLE);
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    public void switchFragment(Fragment fragment, boolean addToBackStack, int id) {
        FragmentManager fm = getFragmentManager();
        FragmentTransaction fragmentTransaction = fm.beginTransaction();
        fragmentTransaction.replace(id, fragment);
        fragmentTransaction.commit();
    }
}
