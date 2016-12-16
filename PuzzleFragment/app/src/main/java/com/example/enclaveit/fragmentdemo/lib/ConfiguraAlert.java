package com.example.enclaveit.fragmentdemo.lib;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.enclaveit.fragmentdemo.R;
import com.example.enclaveit.fragmentdemo.ui.activities.chapterone.BookActivity;

/**
 * Created by enclaveit on 16/12/2016.
 */

public class ConfiguraAlert {

    public static AlertDialog onCreateDialog(Activity activity,String titlex,String content,final Context context) {
        /**
         * Initial AlertDialog and draw componet concerning inside AlertDialog
         */
        AlertDialog.Builder builder = new AlertDialog.Builder(activity);
        /**
         * Get the layout inflater from user interface graphic
         */
        LayoutInflater inflater = activity.getLayoutInflater();
        View layout = inflater.inflate(R.layout.ui_alert, (ViewGroup) activity.findViewById(R.id.toast_layout_root));
        /**
         * Inflate and set the layout for the dialog
         * Pass null as the parent view because its going in the dialog layout
         */
        builder.setView(layout);

        /// Init components TextView
        ImageView image = (ImageView) layout.findViewById(R.id.alert);
        TextView title = (TextView) layout.findViewById(R.id.title);
        TextView text = (TextView) layout.findViewById(R.id.text);

        // Get data and set
        title.setText(titlex);
        text.setText(content);

        // Add action buttons
        builder.setPositiveButton(R.string.ok, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int id) {
                // user ....
                /**
                 * @author lorence
                 * Running content to discuss
                 */
                context.startActivity(new Intent(context.getApplicationContext(), BookActivity.class));
            }
        });
        builder.setNegativeButton(R.string.cancel, new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int id) {
                dialog.cancel();

            }
        });
        AlertDialog alertDialog = builder.create();
        return alertDialog;
    }

    public static AlertDialog onCreateDialog(Activity activity) {
        /**
         * Initial AlertDialog and draw componet concerning inside AlertDialog
         */
        AlertDialog.Builder builder = new AlertDialog.Builder(activity);
        /**
         * Get the layout inflater from user interface graphic
         */
        LayoutInflater inflater = activity.getLayoutInflater();
        View layout = inflater.inflate(R.layout.ui_alert, (ViewGroup) activity.findViewById(R.id.toast_layout_root));
        /**
         * Inflate and set the layout for the dialog
         * Pass null as the parent view because its going in the dialog layout
         */
        builder.setView(layout);

        /// Init components TextView
        ImageView image = (ImageView) layout.findViewById(R.id.alert);
        TextView title = (TextView) layout.findViewById(R.id.title);
        TextView text = (TextView) layout.findViewById(R.id.text);

        // Get data and set
        title.setText(titlex);
        text.setText(content);

        // Add action buttons
        builder.setPositiveButton(R.string.ok, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int id) {
                // user ....
                /**
                 * @author lorence
                 * Running content to discuss
                 */
                context.startActivity(new Intent(context.getApplicationContext(), BookActivity.class));
            }
        });
        builder.setNegativeButton(R.string.cancel, new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int id) {
                dialog.cancel();

            }
        });
        AlertDialog alertDialog = builder.create();
        return alertDialog;
    }
}
