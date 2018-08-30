package com.example.android.musicalstructure;

class Songs {
    
    private String songName;
    private String artistName;
    private int mImageResourceId;
    
    public Songs(String songName, String artistName, int imageResourceId) {
        this.songName = songName;
        this.artistName = artistName;
        mImageResourceId = imageResourceId;
    }

    
    public String getSongName() {
        return songName;
    }

    
    public String getArtistName() {
        return artistName;
    }
    

    public int getImageResourceId() {
        return mImageResourceId;
    }

}

