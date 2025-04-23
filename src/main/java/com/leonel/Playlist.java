package com.leonel;

import com.leonel.model.Song;

import java.util.ArrayList;
import java.util.List;

public class Playlist {
    private int currentSongIndex;
    private final List<Song> songList = new ArrayList<>();

    public void addSong(Song song) {
        songList.add(song);
    }

    public void removeSong(Song song) {
        songList.remove(song);
    }

    public Song getNextSong() {
        currentSongIndex = currentSongIndex >= songList.size() - 1 ? 0 : currentSongIndex + 1;
        return songList.get(currentSongIndex);
    }
}
