package com.example.android.musicalstructure;

public class Albums {
    private String album;
    private int albumArt;

    public Albums(String album, int albumArt) {
        this.album = album;
        this.albumArt = albumArt;
    }

    public String getAlbum(){
        return album;
    }

    public int getAlbumArt(){
        return albumArt;
    }
}
