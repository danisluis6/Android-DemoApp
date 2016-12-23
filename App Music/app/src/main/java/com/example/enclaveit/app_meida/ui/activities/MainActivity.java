package com.example.enclaveit.app_meida.ui.activities;

import android.app.Activity;
import android.content.ContentUris;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Bundle;
import android.os.ParcelFileDescriptor;
import android.provider.MediaStore;
import android.support.design.widget.NavigationView;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import com.example.enclaveit.app_meida.R;
import com.example.enclaveit.app_meida.lib.ConfiguraAlert;
import com.example.enclaveit.app_meida.lib.ConfiguraToast;
import com.example.enclaveit.app_meida.models.bean.Song;
import com.example.enclaveit.app_meida.models.bean.SongLibrary;
import com.example.enclaveit.app_meida.models.dao.ModelSong;
import com.example.enclaveit.app_meida.test.TestReadMusicRoot;
import com.example.enclaveit.app_meida.test.TestSQLiteActivity;
import com.example.enclaveit.app_meida.ui.adapters.AdapterSong;

import java.io.FileDescriptor;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private ListView listSong;
    private Toolbar toolbar;
    private DrawerLayout mDrawer;
    private NavigationView nvDrawer;

    private List<Song> alSong;
    private List<SongLibrary> alSongLib;

    private AdapterSong adapterSong;
    private ModelSong modelSong;

    private Context context = this;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initToolBar();
        initComponents();
        // this.startActivity(new Intent(MainActivity.this,TestReadMusicRoot.class));
        initVarDatabase();
        getDatabaseFromModel();
        setDataForListViewByAdapter();

        /**
         * Add event for onclick listview
         */
        addListenerListView();
    }

    private void initToolBar() {
        toolbar = (Toolbar)this.findViewById(R.id.toolbar);
        this.setSupportActionBar(toolbar);

        toolbar.setNavigationIcon(R.drawable.toolbar_ic_menu);
        toolbar.setNavigationOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                ConfiguraAlert.onCreateDialog((Activity)context,"How to way Manage fragment layout by screen size","fsdf",context).show();
            }
        });
    }

    private void initComponents(){
        listSong = (ListView)this.findViewById(R.id.listSong);
        modelSong = new ModelSong(MainActivity.this);
    }

    private void initVarDatabase(){
        alSongLib = new ArrayList<SongLibrary>();
    }

    private void getDatabaseFromModel(){
        /**
         * @author: Lorence
         * READ MUSIC FROM LIBRRARY RAW
         */
        // modelSong.open();
        // alSong = modelSong.getList();

        /**
         * @author: Lorence
         * READ MUSIC FROM LIBRARY ANDROID
         */

        Uri mediaContentUri = MediaStore.Audio.Media.EXTERNAL_CONTENT_URI;
        String[] projection = new String[] { MediaStore.Audio.Media._ID, MediaStore.Audio.Media.ARTIST, MediaStore.Audio.Media.TITLE, MediaStore.Audio.Media.ALBUM,
                MediaStore.Audio.Media.DURATION, MediaStore.Audio.Media.DATA, MediaStore.Audio.Media.ALBUM_ID};
//        String selection = MediaStore.Audio.Media._ID + "=?";
//        String[] selectionArgs = new String[] {"" + id};

        Cursor mediaCursor = getContentResolver().query(mediaContentUri, projection, null, null, null);

        int index = 0;
        while (index < mediaCursor.getCount()) {
            mediaCursor.moveToPosition(index);

            String id = mediaCursor.getString(mediaCursor.getColumnIndex(MediaStore.Audio.Media._ID));
            String title = mediaCursor.getString(mediaCursor.getColumnIndex(MediaStore.Audio.Media.TITLE));
            String album = mediaCursor.getString(mediaCursor.getColumnIndex(MediaStore.Audio.Media.ALBUM));
            String artist = mediaCursor.getString(mediaCursor.getColumnIndex(MediaStore.Audio.Media.ARTIST));
            long duration = mediaCursor.getLong(mediaCursor.getColumnIndex(MediaStore.Audio.Media.DURATION));
            long album_id = mediaCursor.getLong(mediaCursor.getColumnIndex(MediaStore.Audio.Media.ALBUM_ID));
            Bitmap bitmap = getAlbumart(album_id);
            String path = mediaCursor.getString(mediaCursor.getColumnIndex(MediaStore.Audio.Media.DATA));
            alSongLib.add(new SongLibrary(id,title,album,artist, (int) duration,String.valueOf(bitmap),path,album_id));
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

    private void setDataForListViewByAdapter(){
//        adapterSong = new AdapterSong(this,alSong);
//        listSong.setAdapter(adapterSong);
        adapterSong = new AdapterSong(this,alSongLib);
        listSong.setAdapter(adapterSong);
    }

    private void addListenerListView(){
        listSong.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                SongLibrary song = (SongLibrary) adapterView.getItemAtPosition(position);
                /**
                 * @author: Lorence
                 * set data to send from this activity to that activity
                 */
                Bundle bundle = new Bundle();
                bundle.putString("id",String.valueOf(song.getId()));
                bundle.putString("title",String.valueOf(song.getTitle()));
                bundle.putString("album",String.valueOf(song.getTitle()));
                bundle.putString("artist",String.valueOf(song.getArtist()));
                bundle.putString("duration",String.valueOf(song.getDuration()));
                bundle.putString("path",String.valueOf(song.getPath()));
                bundle.putString("album_id",String.valueOf(song.getAlbum_id()));
                /**
                 * @author Lorence
                 * call startActivity to send intent
                 */
                Intent intent = new Intent(MainActivity.this,PlayMusic.class);
                intent.putExtra("SONG",bundle);
                startActivity(intent);
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.menu_toolbar,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public void onClick(View view) {

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
}
