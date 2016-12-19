package com.example.enclaveit.fragmentdemo.utils;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Toast;


import com.example.enclaveit.fragmentdemo.R;
import com.example.enclaveit.fragmentdemo.lib.ConfiguraAlert;
import com.example.enclaveit.fragmentdemo.lib.ConfiguraToast;

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
            ConfiguraAlert.onCreateDialog((Activity)context,"The new thinking – fragment-oriented","The activity-oriented user interface we currently have would be fine if all Android\n" +
                    "devices had the same form factor. As we've discussed, that's not the case.\n" +
                    "We need to partition the application user interface so that we can switch to a\n" +
                    "fragment-oriented approach. With proper partitioning, we can be ready to make\n" +
                    "some simple enhancements to our application to help it adapt to device differences.\n" +
                    "Let's look at some simple changes we can make that will partition our user interface.",context).show();
        }else if(view.getId() == R.id.catagoria2){
            view.setAnimation(alpha);
            ConfiguraAlert.onCreateDialog((Activity)context,"How to create UI flexibility ?","We can add support for an alternative layout to our application by creating a\n" +
                    "new resource file with the fragments appropriately arranged. We can now modify the activity_main.xml resource file in the layout-land\n" +
                    "folder to arrange the fragments to render properly when the phone is in landscape\n" +
                    "orientation." +
                    "\"How to step by step to landscape\",\"\" +\n" +
                    "                    \"Step 1: Create a directory layout-land\\n\" +\n" +
                    "                    \"Step 2: Copy a book_activity.xml into folder layout-land\\n\" +\n" +
                    "                    \"Step 3: Ctrll + F11 => Testing\"",context).show();
        }else if(view.getId() == R.id.catagoria3){
            view.setAnimation(alpha);
            ConfiguraAlert.onCreateDialog((Activity)context,"How to way Manage fragment layout by screen size","" +
                    "Step 1: We notice: size screen include normal, smaller and large.\n" +
                    "Step 2: We need create two 2 file main_acitivity.xml and main_activity_wide(large) and remove folder land\n" +
                    "AFTER FINISH: There are two class activity into folder layout.\n\n" +
                    "Step 3: We need to create one folder values-land\n" +
                    "AFTER FINISH: There are one refs.xml in folder values-land.\n\n" +
                    "EXPLAIN: values-land mean: With this file in place, any call to load the layout resource R.layout.activity_main\n" +
                    "will instead load R.layout.activity_main_wide when the application is running\n" +
                    "on a device in landscape orientation.\n" +
                    "",context).show();
            /**
             * values-land
             * <resources>
             * <item type=""layout"" name=""activity_main"">
             * @layout/activity_main_wide
             * </item>
             * </resources>
             */
        }else if(view.getId() == R.id.catagoria4){
            /**
             * Defining the callback interface
             * Purpose: The interface should be focused on application-level actions such as selecting a book rather than
             * implementation-level actions such as tapping on a radio button.
             * Step 1: We'll call our new interface OnSelectedBookChangeListener.
             * Step 2:
             */
            ConfiguraToast.makeToast((Activity)context,"Step 1","Create a new interface",Toast.LENGTH_LONG).show();
            /**
             * How to determine the book index corresponding to the selected radio button such as setting the
             * tag value on each radio button or using a lookup table.
             * SOLVE: Switch case(R.id.demo)
             * {A,B,C,D,E,F} => get A with number
             * => swich case setting 0,1,2,3,4 => translateToBookIndex(EASY)
             */
            ConfiguraToast.makeToast((Activity)context,"Step 2","Writting function: translateIdToIndex",Toast.LENGTH_LONG).show();
            /**
             * Use interface (definition yourself) OnSelectedBookChangeListener and get Parrent Acitivity
             * => Writting message (only this fragment)
             * Message => Notification
             */
            ConfiguraToast.makeToast((Activity)context,"Step 3","Make a notification message",Toast.LENGTH_LONG).show();
        }else if(view.getId() == R.id.catagoria5){
            /**
             * Definition the
             */
        }
    }

    @Override
    public boolean onLongClick(View view) {
        if (view.getId() == R.id.activity_book){

        }
        return false;
    }
}
