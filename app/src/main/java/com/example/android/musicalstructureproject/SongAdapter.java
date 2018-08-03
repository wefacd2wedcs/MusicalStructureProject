package com.example.android.musicalstructureproject;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class SongAdapter extends ArrayAdapter<Song> {

    public SongAdapter(Context context, ArrayList<Song> song) {
        super(context, 0, song);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_album, parent, false);
        }

        // Get the {@link AndroidFlavor} object located at this position in the list
        Song localSong = getItem(position);

        // Find the TextView in the list_albumm.xml layout with the ID version_name
        TextView songTextView = listItemView.findViewById(R.id.track_title);
        // Get the version name from the current AndroidFlavor object and
        // set this text on the name TextView
        songTextView.setText(localSong.getmTrackNumberTitle());


        return listItemView;
    }
}
