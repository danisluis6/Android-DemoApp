package com.example.enclaveit.app_meida.ui.fragments;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.Toast;

import com.example.enclaveit.app_meida.R;
import com.example.enclaveit.app_meida.ui.activities.MainActivity;

/**
 * Created by enclaveit on 20/12/2016.
 */

public class FragmentMenuTop extends Fragment implements View.OnClickListener{

    private ImageView menu;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View viewHirerarchy = inflater.inflate(R.layout.fr_menu_top,container,false);
        initComponents(viewHirerarchy);
        return viewHirerarchy;
    }

    public void initComponents(View viewHirerarchy){
        menu = (ImageView)viewHirerarchy.findViewById(R.id.btnMenuTop);
        menu.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if(view.getId() == R.id.btnMenuTop)
            Toast.makeText(getActivity(), "OK", Toast.LENGTH_LONG).show();
    }
}
