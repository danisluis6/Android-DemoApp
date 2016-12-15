package com.example.enclaveit.puzzleintent.lib;

import android.content.Context;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;

import com.example.enclaveit.puzzleintent.R;

/**
 * Created by enclaveit on 12/12/2016.
 */

public class AnimationLibrary {

    private Context context;

    public AnimationLibrary(Context context){
        this.context = context;
    }

    public Animation fade(){
        return AnimationUtils.loadAnimation(context.getApplicationContext(), R.anim.fade);
    }

    public Animation alpha(){
        return AnimationUtils.loadAnimation(context.getApplicationContext(), R.anim.alpha);
    }
}
