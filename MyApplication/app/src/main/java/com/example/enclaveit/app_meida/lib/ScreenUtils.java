package com.example.enclaveit.app_meida.lib;

import android.app.Activity;
import android.view.Window;
import android.view.WindowManager;

/**
 * Created by enclaveit on 20/12/2016.
 */

public class ScreenUtils {
    public static void setDislayFullScreen(Activity activity) {
        activity.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
    }

    public static void setDisplayNoTitle(Activity activity) {
        activity.requestWindowFeature(Window.FEATURE_NO_TITLE);
    }
}
