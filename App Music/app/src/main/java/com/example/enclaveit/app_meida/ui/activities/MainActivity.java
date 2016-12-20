package com.example.enclaveit.app_meida.ui.activities;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.Toast;

import com.example.enclaveit.app_meida.R;
import com.example.enclaveit.app_meida.lib.ScreenUtils;
import com.example.enclaveit.app_meida.models.bean.Song;
import com.example.enclaveit.app_meida.models.dao.ModelSong;
import com.example.enclaveit.app_meida.ui.adapters.AdapterSong;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends Activity {

    private ListView listSong;
    private ImageView imageSong;

    private List<Song> alSong;

    private AdapterSong adapterSong;
    private ModelSong modelSong;

    private Context context = this;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ScreenUtils.setDisplayNoTitle(MainActivity.this);
        setContentView(R.layout.activity_main);
        initComponents();
        initVar();
        getDatabaseFromModel();
        setDataForListViewByAdapter();

        /**
         * Add event for onclick listview
         */
        addListenerListView();

    }

    private void initComponents(){
        listSong = (ListView)this.findViewById(R.id.listSong);
        imageSong = (ImageView)this.findViewById(R.id.imageSong);

        modelSong = new ModelSong(MainActivity.this);
    }

    private void initVar(){
        alSong = new ArrayList<Song>();
    }

    private void getDatabaseFromModel(){
        modelSong.open();
        alSong = modelSong.getList();
    }

    private void setDataForListViewByAdapter(){
        adapterSong = new AdapterSong(this,alSong);
        listSong.setAdapter(adapterSong);
    }

    private void addListenerListView(){
        listSong.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                Song song = (Song) adapterView.getItemAtPosition(position);

            }
        });
    }
}
