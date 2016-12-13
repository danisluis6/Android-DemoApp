package com.example.enclaveit.puzzleanimation.utils;

import android.content.Context;
import android.graphics.Color;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

import com.example.enclaveit.puzzleanimation.R;

/**
 * Created by enclaveit on 13/12/2016.
 */

public class ExplicitListener implements View.OnClickListener,View.OnLongClickListener{

    private Animation fadein;
    private Context context;

    public ExplicitListener(Context context){
        this.context = context;
        fadein = AnimationUtils.loadAnimation(this.context.getApplicationContext(),R.anim.fade);
    }

    @Override
    public void onClick(View view) {
        if(view.getId() == R.id.fadeindemo){
            view.startAnimation(fadein);
        }
    }

    @Override
    public boolean onLongClick(View view) {
        if (view.getId() == R.id.fadein){
            if(view instanceof TextView){
                TextView textView = (TextView) view;
                textView.setBackgroundColor(Color.parseColor("#FFFFFF"));
                textView.setTextColor(Color.parseColor("#1AB188"));
                textView.setText("Fade In");;
            }
        }
        return false;
    }
}
