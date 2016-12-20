package com.example.enclaveit.app_meida.models.dao;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;

import com.example.enclaveit.app_meida.helpers.OpenHelper;
import com.example.enclaveit.app_meida.models.bean.Song;

import java.util.ArrayList;

/**
 * Created by enclaveit on 20/12/2016.
 */

public class ModelSong {

    private Context context;
    private static SQLiteDatabase db;

    private static final String TABLE_SONG = "SONG";
    private static final String COLUMN_ID = "id";
    private static final String COLUMN_NAME = "name";
    private static final String COLUMN_AUTHOR = "author";
    private static final String COLUMN_SINGER = "singer";
    private static final String COLUMN_LYRIC = "lyric";

    private OpenHelper mConnect;

    public ModelSong(Context context){
        this.context = context;
    }

    public ModelSong open() throws SQLException{
        mConnect = new OpenHelper(context);
        db = mConnect.getWritableDatabase();
        return this;
    }

    public void close(){
        mConnect.close();
    }

    public long addItem(Song item){
        ContentValues cv = new ContentValues();
        cv.put(COLUMN_NAME, item.getName());
        cv.put(COLUMN_AUTHOR, item.getAuthor());
        cv.put(COLUMN_SINGER, item.getSinger());
        cv.put(COLUMN_LYRIC, item.getLyric());
        return db.insert(TABLE_SONG, null, cv);
    }

    public ArrayList<Song> getList(){
        ArrayList<Song> alSong = new ArrayList<>();
        String[] columns = new String[]{"id,name,author,singer,lyric"};
        Cursor c = db.query(TABLE_SONG,columns,null,null,null,null,null);
        /**
         * Convert COLUMNE_STRING into COLUMN_INDEX
         */
        int iID = c.getColumnIndex(COLUMN_ID);
        int iName = c.getColumnIndex(COLUMN_NAME);
        int iAuthor = c.getColumnIndex(COLUMN_AUTHOR);
        int iSinger = c.getColumnIndex(COLUMN_SINGER);
        int iLyric = c.getColumnIndex(COLUMN_LYRIC);
        /**
         * Add data into ArrayList
         */
        for(c.moveToFirst(); !c.isAfterLast(); c.moveToNext()){
            alSong.add(new Song(c.getInt(iID),c.getString(iName),c.getString(iAuthor),c.getString(iSinger),c.getString(iLyric)));
        }
        c.close();
        return alSong;
    }

    public int delItem(String username) {
        return db.delete(TABLE_SONG, COLUMN_NAME + "='" + username + "'", null);
    }

    public int delAll() {
        return db.delete(TABLE_SONG, null, null);
    }

}
