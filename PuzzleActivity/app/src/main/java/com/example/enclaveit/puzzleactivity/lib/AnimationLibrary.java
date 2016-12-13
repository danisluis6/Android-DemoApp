package com.example.enclaveit.puzzleactivity.lib;

import android.content.Context;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;

import com.example.enclaveit.puzzleactivity.R;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by enclaveit on 12/12/2016.
 */

public class AnimationLibrary {

    private Context context;
    private List<Animation> listEffect;

    public AnimationLibrary(Context context){
        this.context = context;
        listEffect = new ArrayList<Animation>();
    }

    public Animation clockwise(){
        return AnimationUtils.loadAnimation(context.getApplicationContext(), R.anim.clockwise);
    }

    public Animation blink(){
        return AnimationUtils.loadAnimation(context.getApplicationContext(), R.anim.blink);
    }

    public Animation demoanimation(){
        return AnimationUtils.loadAnimation(context.getApplicationContext(), R.anim.demoanimation);
    }

    public Animation fade(){
        return AnimationUtils.loadAnimation(context.getApplicationContext(), R.anim.fade);
    }

    public Animation move(){
        return AnimationUtils.loadAnimation(context.getApplicationContext(), R.anim.move);
    }

    public Animation slide(){
        return AnimationUtils.loadAnimation(context.getApplicationContext(), R.anim.slide);
    }

    public List<Animation> getList(){
        listEffect.add(new AnimationLibrary(context).clockwise());
        listEffect.add(new AnimationLibrary(context).blink());
        listEffect.add(new AnimationLibrary(context).demoanimation());
        listEffect.add(new AnimationLibrary(context).fade());
        listEffect.add(new AnimationLibrary(context).move());
        listEffect.add(new AnimationLibrary(context).slide());
        return listEffect;
    }
}
