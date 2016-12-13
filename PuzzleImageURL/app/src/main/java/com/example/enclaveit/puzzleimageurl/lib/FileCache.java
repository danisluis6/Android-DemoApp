package com.example.enclaveit.puzzleimageurl.lib;

import com.example.enclaveit.puzzleimageurl.technicals.UtilsFile;

import java.io.File;

/**
 * Created by enclaveit on 13/12/2016.
 */

public class FileCache implements UtilsFile{

    private File cacheDir;

    @Override
    public void description() {
        /**
         * I can get format file of image from internet
         * + INPUT   : url
         * + OUTPUT  : format File
         * String filename=String.valueOf(url.hashCode());
         * File f = new File(new File(), filename);
         */
    }

    public File getFile(String url){
        String filename = String.valueOf(url.hashCode());
        File file = new File(cacheDir,filename);
        return file;
    }
}
