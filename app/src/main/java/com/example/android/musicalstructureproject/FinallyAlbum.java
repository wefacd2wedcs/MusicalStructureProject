package com.example.android.musicalstructureproject;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class FinallyAlbum extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.song_list);

        // Create a list of songs
        ArrayList<Song> songs = new ArrayList<Song>();
        songs.add(new Song("1 - ", "Mister U.S.A."));
        songs.add(new Song("2 - ", "Ashite Muscat"));
        songs.add(new Song("3 - ", "Paradise Train"));
        songs.add(new Song("4 - ", "Try Me (Watashi no Shinjeite)"));
        songs.add(new Song("5 - ", "Taiyou no Season"));
        songs.add(new Song("6 - ", "Body Feels Exit"));
        songs.add(new Song("7 - ", "Chase the Chance"));
        songs.add(new Song("8 - ", "Don't Wanna Cry"));
        songs.add(new Song("9 - ", "You're My Sunshine"));
        songs.add(new Song("10 - ", "Sweet 19 Blues"));
        songs.add(new Song("11 - ", "A Walk in the Park"));
        songs.add(new Song("12 - ", "Can You Celebrate"));
        songs.add(new Song("13 - ", "How to be a Girl"));
        songs.add(new Song("14 - ", "I Have Never Seen"));
        songs.add(new Song("15 - ", "Respect the Power of Love"));
        songs.add(new Song("16 - ", "Never End"));

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