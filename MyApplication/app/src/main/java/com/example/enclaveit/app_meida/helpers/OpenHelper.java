package com.example.enclaveit.app_meida.helpers;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by enclaveit on 20/12/2016.
 */

public class OpenHelper extends SQLiteOpenHelper{

    private static final String DATABASE_NAME =  "DB_MEDIA";
    private static final int DATABASE_VERSION = 1;

    /**
     * Create a table contain information about music
     * @param context
     * @param name
     * @param factory
     * @param version
     */
    private static final String TABLE_SONG = "SONG";
    private static final String COLUMN_ID = "id";
    private static final String COLUMN_NAME = "name";
    private static final String COLUMN_AUTHOR = "author";
    private static final String COLUMN_SINGER = "singer";
    private static final String COLUMN_LYRIC = "lyric";

    private Context context;
    private static SQLiteDatabase db;
    private OpenHelper openHelper;

    public OpenHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        sqLiteDatabase.execSQL("CREATE TABLE "+TABLE_SONG+" ("
        + COLUMN_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, "
        + COLUMN_NAME + " TEXT NOT NULL, "
        + COLUMN_AUTHOR + " TEXT NOT NULL, "
        + COLUMN_SINGER + " TEXT NOT NULL, "
        + COLUMN_LYRIC + " TEXT NOT NULL);");
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
        sqLiteDatabase.execSQL("DROP TABLE IF EXISTS "+TABLE_SONG);
        onCreate(sqLiteDatabase);
    }
}
