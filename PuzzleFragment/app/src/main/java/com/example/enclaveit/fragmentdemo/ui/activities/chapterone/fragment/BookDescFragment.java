package com.example.enclaveit.fragmentdemo.ui.activities.chapterone.fragment;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.enclaveit.fragmentdemo.R;

/**
 * Created by enclaveit on 19/12/2016.
 */

public class BookDescFragment extends Fragment {
    /**
     *
     * @param inflater
     * @param container
     * @param savedInstanceState
     * @return
     * inflater : This is a reference to a LayoutInflater instance that is able to read
     * and expand layout resources within the context of the containing activity
     *
     * container : This is a reference to the ViewGroup instance within the activity's
     * layout where the fragment's view hierarchy is to be attached
     */
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View viewHirerarchy = inflater.inflate(R.layout.fragment_book_desc,container,false);
        return viewHirerarchy;
    }
}
