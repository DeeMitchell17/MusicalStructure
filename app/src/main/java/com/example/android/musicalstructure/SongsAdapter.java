package com.example.android.musicalstructure;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class SongsAdapter extends ArrayAdapter<Songs> {

    public SongsAdapter(@NonNull Context context, @NonNull ArrayList<Songs> songs) {
        super(context, 0, songs);
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }


        Songs currentSongs = getItem(position);

        TextView songName = (TextView) listItemView.findViewById(R.id.song_name);
        songName.setText(currentSongs.getSongName());

        TextView artistName = (TextView) listItemView.findViewById(R.id.artist_name);
        artistName.setText(currentSongs.getArtistName());

        ImageView imageView = (ImageView) listItemView.findViewById(R.id.image);
        imageView.setImageResource(currentSongs.getImageResourceId());

        return listItemView;
    }

}
