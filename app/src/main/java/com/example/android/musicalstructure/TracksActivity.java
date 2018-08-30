package com.example.android.musicalstructure;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;

public class TracksActivity extends AppCompatActivity {

    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tracks);

        getSupportActionBar().setTitle("TracksActivity");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openNowPlayingActivity();
            }
        });


        ArrayList<Songs> songs = new ArrayList<>();
        songs.add(new Songs("Make Luv (2003)", "Room 5", R.drawable.coverart1));
        songs.add(new Songs("In This Life (2006)", "Kaskade", R.drawable.coverart2));
        songs.add(new Songs("Luv 2 U (2004)", "Junior Jack",R.drawable.coverart3));
        songs.add(new Songs("Music Sounds Better With You (1998)","Stardust", R.drawable.coverart4));
        songs.add(new Songs("My Love (2015)","Route 94 & Jess Glynne", R.drawable.coverart5));
        songs.add(new Songs("Show Me Love (1993)", "Robin S.", R. drawable.coverart6));
        songs.add(new Songs("I Wanna Feel (2014)","SecondCity", R.drawable.coverart7));
        songs.add(new Songs("Let You (2012)","AppleBottom", R.drawable.coverart8));
        songs.add(new Songs("Freak (2013)","Route 94 & SecondCity", R.drawable.coverart9));
        songs.add(new Songs("Ghost Voices (2017)","Virtual Self", R.drawable.coverart10));


        SongsAdapter songsAdapter = new SongsAdapter(this, songs);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(songsAdapter);

    }

    public void openNowPlayingActivity() {
        Intent intent = new Intent(this, NowPlayingActivity.class);
        startActivity(intent);
    }
}
