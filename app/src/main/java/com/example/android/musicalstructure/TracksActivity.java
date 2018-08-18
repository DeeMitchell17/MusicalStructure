package com.example.android.musicalstructure;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
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


        ArrayList<String> words = new ArrayList<>();
        words.add("1. Make Luv");
        words.add("2. In This Life");
        words.add("3. Luv 2 U");
        words.add("4. Music Sounds Better With You");
        words.add("5. My Love");
        words.add("6. Show Me Love");
        words.add("7. I Wanna Feel");
        words.add("8. Let You");
        words.add("9. Freak");
        words.add("10. Ghost Voices");


        ArrayAdapter<String> itemsAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, words);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(itemsAdapter);

    }

    public void openNowPlayingActivity() {
        Intent intent = new Intent(this, NowPlayingActivity.class);
        startActivity(intent);
    }
}
