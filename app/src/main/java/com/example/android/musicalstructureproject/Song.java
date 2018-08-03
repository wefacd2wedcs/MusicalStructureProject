package com.example.android.musicalstructureproject;


/**
 * {@link Song} represents a song
 */
public class Song {

    private String mTrackNumberTitle;

    /**
     * Create a new Song object.
     *
     * @param TrackNumber is the number of the track
     * @param TrackTitle  is the song title
     */
    public Song(String TrackNumber, String TrackTitle) {
        String mTrackNumber = TrackNumber;
        String mTrackTitle = TrackTitle;
        mTrackNumberTitle = mTrackNumber + mTrackTitle;
    }


    //get the track number and title combo
    public String getmTrackNumberTitle() {
        return mTrackNumberTitle;
    }
}