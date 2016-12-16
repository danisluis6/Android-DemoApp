package com.example.enclaveit.fragmentdemo.utils;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;


import com.example.enclaveit.fragmentdemo.R;
import com.example.enclaveit.fragmentdemo.lib.ConfiguraAlert;

/**
 * Created by enclaveit on 13/12/2016.
 */

public class ExplicitListener implements View.OnClickListener,View.OnLongClickListener{

    private Animation fadein;
    private Animation alpha;

    private Context context;

    public ExplicitListener(Context context){
        this.context = context;
        fadein = AnimationUtils.loadAnimation(this.context.getApplicationContext(), R.anim.fade);
        alpha = AnimationUtils.loadAnimation(this.context.getApplicationContext(), R.anim.alpha);
    }

    @Override
    public void onClick(View view) {
        if(view.getId() == R.id.catagoria1){
            view.startAnimation(fadein);
            /**
             * @author lorence
             * Description about content and process problem
             */
//            final Toast toast = ConfiguraToast.makeToast((Activity) context,"The new thinking – fragment-oriented","The activity-oriented user interface we currently have would be fine if all Android\n" +
//                    "devices had the same form factor. As we've discussed, that's not the case.\n" +
//                    "We need to partition the application user interface so that we can switch to a\n" +
//                    "fragment-oriented approach. With proper partitioning, we can be ready to make\n" +
//                    "some simple enhancements to our application to help it adapt to device differences.\n" +
//                    "Let's look at some simple changes we can make that will partition our user interface.", Toast.LENGTH_LONG);
//            toast.show();
            ConfiguraAlert.onCreateDialog((Activity)context,"The new thinking – fragment-oriented","The activity-oriented user interface we currently have would be fine if all Android\n" +
                    "devices had the same form factor. As we've discussed, that's not the case.\n" +
                    "We need to partition the application user interface so that we can switch to a\n" +
                    "fragment-oriented approach. With proper partitioning, we can be ready to make\n" +
                    "some simple enhancements to our application to help it adapt to device differences.\n" +
                    "Let's look at some simple changes we can make that will partition our user interface.",context).show();
        }
    }

    @Override
    public boolean onLongClick(View view) {
        if (view.getId() == R.id.activity_book){
        }
        return false;
    }
}
