package com.example.android.musicalstructure;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.SeekBar;
import android.widget.TextView;

public class NowPlayingActivity extends AppCompatActivity {
    Button playBtn;
    SeekBar progressBar;
    TextView startTimeLabel;
    TextView endTimeLabel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_now_playing);

        getSupportActionBar().setTitle("NowPlayingActivity");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        playBtn = (Button) findViewById(R.id.playBtn);
        startTimeLabel = (TextView) findViewById(R.id.startTimeLabel);
        endTimeLabel = (TextView) findViewById(R.id.endTimeLabel);

        progressBar = (SeekBar) findViewById(R.id.progressBar);
    }
}
