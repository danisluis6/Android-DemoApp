package com.example.enclaveit.app_meida.test;

import android.content.ContentUris;
import android.content.Context;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;

import com.example.enclaveit.app_meida.R;

import java.io.FileDescriptor;

public class TestReadMusicRoot extends AppCompatActivity {

    protected static final int REQUEST_PICK_MUSIC = 1;
    private Context context = this;

    private ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_read_music_root);

        initComponents();

        Uri mediaContentUri = MediaStore.Audio.Media.EXTERNAL_CONTENT_URI;
        String[] projection = new String[] { MediaStore.Audio.Media._ID, MediaStore.Audio.Media.ARTIST, MediaStore.Audio.Media.TITLE, MediaStore.Audio.Media.ALBUM,
                MediaStore.Audio.Media.DURATION, MediaStore.Audio.Media.DATA, MediaStore.Audio.Media.ALBUM_ID};
//        String selection = MediaStore.Audio.Media._ID + "=?";
//        String[] selectionArgs = new String[] {"" + id};

        Cursor mediaCursor = getContentResolver().query(mediaContentUri, projection, null, null, null);

        int index = 0;
        while (index < mediaCursor.getCount()) {
            mediaCursor.moveToPosition(index);

            String title = mediaCursor.getString(mediaCursor.getColumnIndex(MediaStore.Audio.Media.TITLE));
            String album = mediaCursor.getString(mediaCursor.getColumnIndex(MediaStore.Audio.Media.ALBUM));
            String artist = mediaCursor.getString(mediaCursor.getColumnIndex(MediaStore.Audio.Media.ARTIST));
            long duration = mediaCursor.getLong(mediaCursor.getColumnIndex(MediaStore.Audio.Media.DURATION));
            long album_id = mediaCursor.getLong(mediaCursor.getColumnIndex(MediaStore.Audio.Media.ALBUM_ID));
            Bitmap bitmap = getAlbumart(album_id);
            String path = mediaCursor.getString(mediaCursor.getColumnIndex(MediaStore.Audio.Media.DATA));

            /**
             * Print data song of device
             */
            Log.d("AUDIO","TITLE: "+title);
            Log.d("AUDIO","ALBUM: "+album);
            Log.d("AUDIO","ARTIST: "+artist);
            Log.d("AUDIO","DURATION: "+duration);
            Log.d("AUDIO","IMAGE: "+bitmap);
            Log.d("","---------------------------");
            index++;
        }
    }

    public Bitmap getAlbumart(Long album_id)
    {
        Bitmap bm = null;
        try
        {
            final Uri sArtworkUri = Uri.parse("content://media/external/audio/albumart");

            Uri uri = ContentUris.withAppendedId(sArtworkUri, album_id);

            ParcelFileDescriptor pfd = context.getContentResolver()
                    .openFileDescriptor(uri, "r");

            if (pfd != null)
            {
                FileDescriptor fd = pfd.getFileDescriptor();
                bm = BitmapFactory.decodeFileDescriptor(fd);
            }
        } catch (Exception e) {
        }
        return bm;
    }

    private void initComponents(){
        imageView = (ImageView)this.findViewById(R.id.imageView);
    }
}
