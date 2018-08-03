package com.example.android.musicalstructureproject;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Set the content of the activity to use the activity_main.xml layout file
        setContentView(R.layout.activity_main);

        // Find the View that shows the genic album
        TextView genic = findViewById(R.id.genic);

        // Set a click listener on that View
        genic.setOnClickListener(new OnClickListener() {
            // The code in this method will be executed when the genic album is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link GenicAlbum}
                Intent genicIntent = new Intent(MainActivity.this, GenicAlbum.class);

                // Start the new activity
                startActivity(genicIntent);
            }
        });

        // Find the View that shows the finally album
        TextView finall_y = findViewById(R.id.finall_y);

        // Set a click listener on that View
        finall_y.setOnClickListener(new OnClickListener() {
            // The code in this method will be executed when the finally album is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link FinallyAlbum}
                Intent finallyIntent = new Intent(MainActivity.this, FinallyAlbum.class);

                // Start the new activity
                startActivity(finallyIntent);
            }
        });

        // Find the View that shows the Ballada album
        TextView ballada = findViewById(R.id.ballada);

        // Set a click listener on that View
        ballada.setOnClickListener(new OnClickListener() {
            // The code in this method will be executed when the ballada album is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link BalladaAlbum}
                Intent balladaIntent = new Intent(MainActivity.this, BalladaAlbum.class);

                // Start the new activity
                startActivity(balladaIntent);
            }
        });

        // Find the View that shows the Feel album
        TextView feel = findViewById(R.id.feel);

        // Set a click listener on that View
        feel.setOnClickListener(new OnClickListener() {
            // The code in this method will be executed when the feel album is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link FeelAlbum}
                Intent feelIntent = new Intent(MainActivity.this, FeelAlbum.class);

                // Start the new activity
                startActivity(feelIntent);
            }
        });
    }
}