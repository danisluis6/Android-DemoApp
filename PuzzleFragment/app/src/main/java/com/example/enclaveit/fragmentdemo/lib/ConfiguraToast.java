package com.example.enclaveit.fragmentdemo.lib;

import android.app.Activity;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.enclaveit.fragmentdemo.R;

/**
 * Created by enclaveit on 16/12/2016.
 */

public class ConfiguraToast {

    public static Toast makeToast(Activity activity, String xtitle,String xtest, int duraion ){
        LayoutInflater inflater = activity.getLayoutInflater();
        View layout = inflater.inflate(R.layout.ui_toast, (ViewGroup) activity.findViewById(R.id.toast_layout_root));

        /// Init components TextView
        ImageView image = (ImageView) layout.findViewById(R.id.alert);
        TextView title = (TextView) layout.findViewById(R.id.title);
        TextView text = (TextView) layout.findViewById(R.id.text);

        // Get data and set
        title.setText(xtitle);
        text.setText(xtest);

        Toast toast = new Toast(activity.getApplicationContext());
        toast.setDuration(duraion);
        toast.setView(layout);
        toast.setGravity(Gravity.CENTER, 0, 0);
        return toast;
    }
}
