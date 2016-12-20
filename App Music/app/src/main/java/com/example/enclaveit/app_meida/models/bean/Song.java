package com.example.enclaveit.app_meida.models.bean;

/**
 * Created by enclaveit on 20/12/2016.
 */

public class Song {
    private int id;
    private String name;
    private String author;
    private String singer;
    private String lyric;
    public Song(){
    }

    public Song(int id, String name, String author, String singer, String lyric) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.singer = singer;
        this.lyric = lyric;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public String getSinger() {
        return singer;
    }

    public String getLyric() {
        return lyric;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setSinger(String singer) {
        this.singer = singer;
    }

    public void setLyric(String lyric) {
        this.lyric = lyric;
    }
}
