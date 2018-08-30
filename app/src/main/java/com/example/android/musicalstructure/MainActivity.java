package com.example.android.musicalstructure;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        TextView tracks = (TextView) findViewById(R.id.tracks);

        tracks.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                Intent tracksIntent = new Intent(MainActivity.this, TracksActivity.class);
                startActivity(tracksIntent);
            }
        });

        TextView nowPlaying = (TextView) findViewById(R.id.now_playing);

        nowPlaying.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                Intent nowPlayingIntent = new Intent(MainActivity.this, NowPlayingActivity.class);
                startActivity(nowPlayingIntent);
            }
        });
    }
}
