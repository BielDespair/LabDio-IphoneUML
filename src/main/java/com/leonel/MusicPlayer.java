package com.leonel;

import com.leonel.model.Song;

import java.util.ArrayList;
import java.util.List;

public class MusicPlayer {
    private Song currentSong;
    private final Playlist playlist = new Playlist();


    public void play(Song song) {
        currentSong = song;
        System.out.println("Now playing: " + song.title());
    }

    public void playNext() {
        Song next = playlist.getNextSong();
        play(next);
    }

    public void pause() {
        System.out.println("Paused");
    }

    public void resume() {
        System.out.println("Resuming " + currentSong.title());
    }

    public void addToPlaylist(Song song) {
        playlist.addSong(song);
        System.out.println("Added to playlist: " + song.title());
    }

    public void removeFromPlaylist(Song song) {
        playlist.removeSong(song);
    }
}
