package com.example.enclaveit.app_meida.ui.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.EditText;
import android.widget.TextView;

import com.example.enclaveit.app_meida.R;
import com.example.enclaveit.app_meida.lib.EdittextUtils;
import com.example.enclaveit.app_meida.models.bean.Song;
import com.example.enclaveit.app_meida.models.bean.SongLibrary;

import java.util.List;

/**
 * Created by enclaveit on 20/12/2016.
 */

public class AdapterSong extends BaseAdapter{

    // private List<Song> listItems;
    private List<SongLibrary> listItems;
    private LayoutInflater layoutInflater;
    private Context context;


    public AdapterSong(Context context,List<SongLibrary> listItems){
        this.context = context;
        this.listItems = listItems;
        layoutInflater = LayoutInflater.from(context);
    }

    @Override
    public int getCount() {
        if (listItems.isEmpty() || listItems == null) {
            return 0;
        }
        return listItems.size();
    }

    @Override
    public Object getItem(int i) {
        return listItems.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        ViewHolder holder;
        SongLibrary song = (SongLibrary) getItem(i);
        if (view == null) {
            view = layoutInflater.inflate(R.layout.item_listview_song, null);
            holder = new ViewHolder();
            holder.name = (TextView) view.findViewById(R.id.name);
            holder.singer = (TextView) view.findViewById(R.id.singer);

            view.setTag(holder);
        } else {
            holder = (ViewHolder) view.getTag();
        }

        holder.name.setText(song.getTitle());
        holder.singer.setText(song.getArtist());
        return view;
    }

    public static class ViewHolder {
        TextView name;
        TextView singer;
    }
}
