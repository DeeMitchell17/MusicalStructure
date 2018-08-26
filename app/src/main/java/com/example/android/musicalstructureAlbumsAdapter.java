package com.example.android.musicalstructure;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class AlbumsAdapter extends ArrayAdapter<Albums> {
   
    public CustomGrid(ArrayList<Albums>, String[] album, int[] Imageid) {
       super(0, albums)
    }
    
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

            View grid;
            LayoutInflater inflater = (LayoutInflater) mContext
                    .getSystemService(Context.LAYOUT_INFLATER_SERVICE);

            if (convertView == null) {

                grid = new View(mContext);
                grid = inflater.inflate(R.layout.customgrid_albums, null);
                TextView textView = (TextView) grid.findViewById(R.id.album_text);
                ImageView imageView = (ImageView)grid.findViewById(R.id.album_art);
                textView.setText(album[position]);
                imageView.setImageResource(Imageid[position]);
            } else {
                grid = (View) convertView;
            }

            return grid;
        }
    }
