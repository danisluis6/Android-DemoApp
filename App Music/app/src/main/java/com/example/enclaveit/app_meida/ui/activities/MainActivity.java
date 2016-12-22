package com.example.enclaveit.app_meida.ui.activities;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import com.example.enclaveit.app_meida.R;
import com.example.enclaveit.app_meida.models.bean.Song;
import com.example.enclaveit.app_meida.models.dao.ModelSong;
import com.example.enclaveit.app_meida.test.TestSQLiteActivity;
import com.example.enclaveit.app_meida.ui.adapters.AdapterSong;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private ListView listSong;
    private Toolbar toolbar;
    private DrawerLayout mDrawer;
    private NavigationView nvDrawer;

    private List<Song> alSong;

    private AdapterSong adapterSong;
    private ModelSong modelSong;

    private Context context = this;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initToolBar();
        initComponents();
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
                Toast.makeText(MainActivity.this,"Hello Toolbar",Toast.LENGTH_LONG).show();
            }
        });
    }

    private void initComponents(){
        listSong = (ListView)this.findViewById(R.id.listSong);
        modelSong = new ModelSong(MainActivity.this);
    }

    private void initVarDatabase(){
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
                Bundle bundle = new Bundle();
                bundle.putString("id",String.valueOf(song.getId()));
                bundle.putString("name",String.valueOf(song.getName()));
                bundle.putString("singer",String.valueOf(song.getSinger()));
                bundle.putString("author",String.valueOf(song.getAuthor()));
                bundle.putString("lyric",String.valueOf(song.getLyric()));
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
}
