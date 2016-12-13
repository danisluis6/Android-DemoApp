package com.example.enclaveit.puzzleactivity.lib;

import com.example.enclaveit.puzzleactivity.R;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by enclaveit on 12/12/2016.
 */

public class BackgroundLibrary {

    private List<Integer> list = new ArrayList<Integer>();

    public BackgroundLibrary(){
        list.add(R.drawable.bg1);
        list.add(R.drawable.bg2);
        list.add(R.drawable.bg3);
        list.add(R.drawable.bg4);
        list.add(R.drawable.bg5);
        list.add(R.drawable.bg6);
        list.add(R.drawable.bg7);
        list.add(R.drawable.bg8);
        list.add(R.drawable.bg9);
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
