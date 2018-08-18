package com.example.android.musicalstructure;


import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.GridView;

public class AlbumsActivity extends AppCompatActivity {

    private Button button;

    GridView grid;
    String[] album = {
            "Music & You (2003)\n Junior Jack",
            "Love Mysterious (2006)\n Kaskade",
            "Trust It (2004)\n Junior Jack",
            "Music Sounds Better With You (1998)\n Stardust",
            "I Cry When I Laugh (2015)\n Jess Glynne",
            "Show Me Love (1993)\n Robin S.",
            "MistaJam Presents Big Beats (2014)\n Various Artists",
            "Let You EP (2012)\n Apple Bottom",
            "Freak (2013)\n Route 94 & SecondCity",
            "Virtual Self (2017)\n Porter Robinson"


    } ;
    int[] imageId = {
            R.drawable.coverart1,
            R.drawable.coverart2,
            R.drawable.coverart3,
            R.drawable.coverart4,
            R.drawable.coverart5,
            R.drawable.coverart6,
            R.drawable.coverart7,
            R.drawable.coverart8,
            R.drawable.coverart9,
            R.drawable.coverart10

    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_albums);

        getSupportActionBar().setTitle("AlbumsActivity");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openNowPlayingActivity();
            }
        });

        CustomGrid adapter = new CustomGrid(AlbumsActivity.this, album, imageId);
        grid=(GridView)findViewById(R.id.grid);
        grid.setAdapter(adapter);

        }

        public void openNowPlayingActivity() {
            Intent intent = new Intent(this, NowPlayingActivity.class);
            startActivity(intent);
        }
    }

