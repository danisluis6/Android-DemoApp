package com.example.enclaveit.app_meida.models.bean;

import android.graphics.Bitmap;

/**
 * Created by enclaveit on 23/12/2016.
 */

public class SongLibrary {
    private String id;
    private String title;
    private String album;
    private String artist;
    private int duration;
    private String bitmap;
    private String path;
    private long album_id;

    public SongLibrary() {
    }

    public SongLibrary(String id, String title, String album, String artist, int duration, String bitmap, String path, long album_id) {
        this.id = id;
        this.title = title;
        this.album = album;
        this.artist = artist;
        this.duration = duration;
        this.bitmap = bitmap;
        this.path = path;
        this.album_id = album_id;
    }

    public String getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getAlbum() {
        return album;
    }

    public String getArtist() {
        return artist;
    }

    public int getDuration() {
        return duration;
    }

    public String getBitmap() {
        return bitmap;
    }

    public String getPath() {
        return path;
    }

    public long getAlbum_id() {
        return album_id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public void setBitmap(String bitmap) {
        this.bitmap = bitmap;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public void setAlbum_id(long album_id) {
        this.album_id = album_id;
    }
}
