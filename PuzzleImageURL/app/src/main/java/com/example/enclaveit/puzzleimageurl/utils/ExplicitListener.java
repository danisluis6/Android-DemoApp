package com.example.enclaveit.puzzleimageurl.utils;

import android.content.Context;
import android.view.View;
import android.widget.Toast;

import com.example.enclaveit.puzzleimageurl.R;
/**
 * Created by enclaveit on 13/12/2016.
 */

public class ExplicitListener implements View.OnLongClickListener,View.OnClickListener{

    private Context context;

    public ExplicitListener(Context context){
        this.context = context;
    }

    @Override
    public void onClick(View view) {

    }

    @Override
    public boolean onLongClick(View view) {
        if (view.getId() == R.id.urlImage){
            Toast.makeText(context.getApplicationContext(),"OK",Toast.LENGTH_LONG).show();
        }
        return false;
    }
}
