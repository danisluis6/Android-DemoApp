package com.example.enclaveit.app_meida.ui.activities;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.PopupMenu;
import android.widget.Toast;

import com.example.enclaveit.app_meida.R;
import com.example.enclaveit.app_meida.models.bean.Song;
import com.example.enclaveit.app_meida.models.dao.ModelSong;
import com.example.enclaveit.app_meida.ui.adapters.AdapterSong;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity{

    private ListView listSong;
    private Toolbar toolbar;

    private List<Song> alSong;

    private AdapterSong adapterSong;
    private ModelSong modelSong;

    private Context context = this;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // ScreenUtils.setDisplayNoTitle(MainActivity.this);
        setContentView(R.layout.activity_main);
        initToolBar();
        initComponents();
        initVar();
        getDatabaseFromModel();
        setDataForListViewByAdapter();

        /**
         * Add event for onclick listview
         */
        addListenerListView();

    }

    private void initToolBar() {
        toolbar = (Toolbar)this.findViewById(R.id.toolbar);
        toolbar.setTitle("MUSICAPP");
        this.setSupportActionBar(toolbar);

        toolbar.setNavigationIcon(R.mipmap.ic_toolbar_arrow);
        toolbar.setNavigationOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Toast.makeText(MainActivity.this,"Hello Toolbar",Toast.LENGTH_LONG).show();
            }
        });
    }

    private void initComponents(){
        listSong = (ListView)this.findViewById(R.id.listSong);
        this.setSupportActionBar(toolbar);

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

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.menu_toolbar,menu);
        return super.onCreateOptionsMenu(menu);
    }
}
