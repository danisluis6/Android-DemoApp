package com.example.enclaveit.puzzleimage.utils;

import com.example.enclaveit.puzzleimage.R;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by enclaveit on 12/12/2016.
 */

public class ImagesLibrary {

    private List<Integer> list = new ArrayList<Integer>();

    public ImagesLibrary(){
        list.add(R.drawable.roses1);
        list.add(R.drawable.roses2);
        list.add(R.drawable.roses3);
        list.add(R.drawable.roses4);
        list.add(R.drawable.roses5);
        list.add(R.drawable.roses6);
        list.add(R.drawable.roses7);
        list.add(R.drawable.roses8);
        list.add(R.drawable.roses9);
        list.add(R.drawable.roses10);
        list.add(R.drawable.roses11);
        list.add(R.drawable.roses12);
        list.add(R.drawable.roses13);
        list.add(R.drawable.roses14);
        list.add(R.drawable.roses15);
    }

    public List<Integer> getList() {
        return list;
    }

    public int size(){
        return list.size();
    }

    public int randImage(){
        return list.get(new Random().nextInt(list.size()));
    }
}
