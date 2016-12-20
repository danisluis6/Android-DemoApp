package com.example.enclaveit.appdemo.lib;

import android.content.Context;
import android.graphics.Typeface;
import android.view.View;

/**
 * Created by enclaveit on 13/12/2016.
 */

public class CustomFonts {

    private Context context;

    public CustomFonts(Context context){
        this.context = context;
    }

    public Typeface setFont(String fonts){
        Typeface typeface = Typeface.createFromAsset(context.getAssets(),"fonts/"+fonts+".ttf");
        return typeface;
    }
}
