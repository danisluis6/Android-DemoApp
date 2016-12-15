package com.example.enclaveit.appdemo.ui.fragment;

import android.app.Activity;
import android.app.Fragment;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.enclaveit.appcontacts.R;

/**
 * Copyright © 2015 AsianTech inc.
 * Created by Binc on 11/04/2016.
 */
public class Fragment1 extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment1, null);
        Log.i("TAG", "onCreateView");
        return view;
    }

    @Deprecated
    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        Log.d("TAG", "onAttach");
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d("TAG", "onCreate");
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        Log.d("TAG", "onActivityCreated");
    }

    @Override
    public void onStart() {
        super.onStart();
        Log.d("TAG", "onStart");
    }

    @Override
    public void onResume() {
        super.onResume();
        Log.d("TAG", "onResume");
    }

    @Override
    public void onPause() {
        super.onPause();
        Log.d("TAG", "onPause");
    }

    @Override
    public void onStop() {
        super.onStop();
        Log.d("TAG", "onStop");
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        Log.d("TAG", "onDestroyView");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.d("TAG", "onDestroy");
    }

    @Override
    public void onDetach() {
        super.onDetach();
        Log.d("TAG", "onDetach");
    }
}
