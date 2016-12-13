package com.example.enclaveit.puzzleimageurl.lib;

import android.content.Context;
import android.graphics.Bitmap;
import android.widget.ImageView;

import com.example.enclaveit.puzzleimageurl.technicals.UtilsBitmap;

import java.io.File;
import java.net.URL;
import java.util.Collections;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.ExecutorService;

/**
 * Created by enclaveit on 13/12/2016.
 */

public class ImageLoader implements UtilsBitmap{
    @Override
    public void description() {

    }

//    private Context context;
//    private FileCache fileCache;
//
//    public ImageLoader(Context context){
//        this.context = context;
//    }
//
//    private Bitmap getBitmap(String url)
//    {
//        File f = fileCache.getFile(url);
//
//        //from SD cache
//        Bitmap b = decodeFile(f);
//        if(b!=null)
//            return b;
//
//        //from web
//        try {
//            Bitmap bitmap=null;
//            URL imageUrl = new URL(url);
//            HttpURLConnection conn = (HttpURLConnection)imageUrl.openConnection();
//            conn.setConnectTimeout(30000);
//            conn.setReadTimeout(30000);
//            conn.setInstanceFollowRedirects(true);
//            InputStream is=conn.getInputStream();
//            OutputStream os = new FileOutputStream(f);
//            Utils.CopyStream(is, os);
//            os.close();
//            bitmap = decodeFile(f);
//            return bitmap;
//        } catch (Exception ex){
//            ex.printStackTrace();
//            return null;
//        }
//    }
}
