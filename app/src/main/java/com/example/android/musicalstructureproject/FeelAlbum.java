package com.example.android.musicalstructureproject;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class FeelAlbum extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.song_list);

        // Create a list of songs
        ArrayList<Song> songs = new ArrayList<Song>();
        songs.add(new Song("1 - ", "Alive"));
        songs.add(new Song("2 - ", "Rainbow"));
        songs.add(new Song("3 - ", "Can You Feel This Love"));
        songs.add(new Song("4 - ", "Big Boys Cry"));
        songs.add(new Song("5 - ", "Hands on Me"));
        songs.add(new Song("6 - ", "Heaven"));
        songs.add(new Song("7 - ", "Poison"));
        songs.add(new Song("8 - ", "La La La"));
        songs.add(new Song("9 - ", "Supernatural Love"));
        songs.add(new Song("10 - ", "Let Me Let You Go"));
        songs.add(new Song("11 - ", "Contrail"));
        songs.add(new Song("12 - ", "Stardust In My Eyes"));

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