package com.example.enclaveit.fragmentdemo.ui.activities.chapterone.fragment;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioGroup;

import com.example.enclaveit.fragmentdemo.R;
import com.example.enclaveit.fragmentdemo.api.OnSelectedBookChangeListener;

/**
 * Created by enclaveit on 19/12/2016.
 */

public class BookListFragment extends Fragment implements RadioGroup.OnCheckedChangeListener{

    /**
     * Declare widget android
     * @param inflater
     * @param container
     * @param savedInstanceState
     * @return
     */
    private RadioGroup group;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View viewHirerarchy = inflater.inflate(R.layout.fragment_book_list,container,false);

        // Connect Listener to the RadioGroup
        group = (RadioGroup)viewHirerarchy.findViewById(R.id.bookSelectGroup);
        group.setOnCheckedChangeListener(this);
        translateIdToIndex(1);

        return viewHirerarchy;
    }

    private int translateIdToIndex(int id) {
        int index = -1;
        switch (id){
            case R.id.dynamicUiBook:
                index = 0;
                break;
            case R.id.android4NewBook:
                index = 1;
                break;
            case R.id.android5NewBook:
                index = 2;
                break;
            case R.id.android6NewBook:
                index = 3;
                break;
            case R.id.android7NewBook:
                index = 4;
                break;
        }
        return index;
    }

    @Override
    public void onCheckedChanged(RadioGroup radioGroup, int id) {
        // Translate radio button to book index
        int bookIndex = translateIdToIndex(id);
        // Get parent Activity and send notification
        OnSelectedBookChangeListener listener = (OnSelectedBookChangeListener) getActivity();
        listener.onSelectedBookChanged(bookIndex);
    }

}
