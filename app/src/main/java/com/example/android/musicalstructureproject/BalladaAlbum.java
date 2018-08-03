package com.example.android.musicalstructureproject;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class BalladaAlbum extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.song_list);

        // Create a list of songs
        ArrayList<Song> songs = new ArrayList<Song>();
        songs.add(new Song("1 - ", "Sweet 19 Blues"));
        songs.add(new Song("2 - ", "Can You Celebrate?"));
        songs.add(new Song("3 - ", "Dreaming I Was Dreaming"));
        songs.add(new Song("4 - ", "Never End"));
        songs.add(new Song("5 - ", "Himawari"));
        songs.add(new Song("6 - ", "Think of Me"));
        songs.add(new Song("7 - ", "I Will"));
        songs.add(new Song("8 - ", "Wishing on the Same Star"));
        songs.add(new Song("9 - ", "Four Seasons"));
        songs.add(new Song("10 - ", "All for Your"));
        songs.add(new Song("11 - ", "White Light"));
        songs.add(new Song("12 - ", "The Meaning of Us"));
        songs.add(new Song("13 - ", "Love Story"));
        songs.add(new Song("14 - ", "Let Me Let You Go"));
        songs.add(new Song("15 - ", "Tsuki"));
        songs.add(new Song("16 - ", "Contrail"));

        // Create an {@link SongAdapter}, whose data source is a list of {@link Song}s. The
        // adapter knows how to create list items for each item in the list.
        SongAdapter adapter = new SongAdapter(this, songs);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // song_list.xml file.
        ListView listView = (ListView) findViewById(R.id.list);

        // Make the {@link ListView} use the {@link SongAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Song} in the list.
        listView.setAdapter(adapter);
    }
}