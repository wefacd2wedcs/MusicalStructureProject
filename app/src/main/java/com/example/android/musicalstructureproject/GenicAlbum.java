package com.example.android.musicalstructureproject;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class GenicAlbum extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.song_list);

        // Create a list of songs
        ArrayList<Song> songs = new ArrayList<Song>();
        songs.add(new Song("1 - ", "Photogenic"));
        songs.add(new Song("2 - ", "Time Has Come"));
        songs.add(new Song("3 - ", "Golden Touch"));
        songs.add(new Song("4 - ", "Birthday"));
        songs.add(new Song("5 - ", "It"));
        songs.add(new Song("6 - ", "Scream"));
        songs.add(new Song("7 - ", "Fashionista"));
        songs.add(new Song("8 - ", "Fly"));
        songs.add(new Song("9 - ", "B Who I Want 2 B"));
        songs.add(new Song("10 - ", "Stranger"));
        songs.add(new Song("11 - ", "Every Woman"));
        songs.add(new Song("12 - ", "Space Invader"));
        songs.add(new Song("13 - ", "Anything"));
        songs.add(new Song("14 - ", "What I Did For Love"));

        // Create an {@link SongAdapter}, whose data source is a list of {@link Song}s. The
        // adapter knows how to create list items for each item in the list.
        SongAdapter adapter = new SongAdapter(this, songs);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // word_listyout file.
        ListView listView = (ListView) findViewById(R.id.list);

        // Make the {@link ListView} use the {@link SongAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Song} in the list.
        listView.setAdapter(adapter);
    }
}