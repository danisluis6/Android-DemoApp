package com.example.enclaveit.app_meida.ui.fragments;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.enclaveit.app_meida.R;

/**
 * Created by enclaveit on 20/12/2016.
 */

public class FragmentAnimation extends Fragment{
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View viewHirerarchy = inflater.inflate(R.layout.fr_animation,container,false);
        return viewHirerarchy;
    }
}
