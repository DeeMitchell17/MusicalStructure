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

public class CustomGrid extends ArrayAdapter<String> {
    private final Context mContext;
    private final String album[];
    private final int[] Imageid;

    public CustomGrid(Context c, String[] album, int[] Imageid) {
        mContext = c;
        this.Imageid = Imageid;
        this.album = album;
    }

    @Override
    public int getCount() {
        return album.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
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