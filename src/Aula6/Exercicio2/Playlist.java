package Aula6.Exercicio2;

import java.sql.Time;
import java.util.ArrayList;

public class Playlist {
    private ArrayList<Music> playlist;
    private int playlistDuration;

    public Playlist() {
        this.playlist = new ArrayList<>();
        this.playlistDuration = playlistDuration;
    }

    public ArrayList<Music> getPlaylist() {
        return playlist;
    }

    public void setPlaylist(ArrayList<Music> playlist) {
        this.playlist = playlist;
    }

    public int getPlaylistDuration() {
        int calculate = 0;
        for (Music song: playlist) {
            calculate += song.getDuration();
        }
        return calculate;
    }

    public void addSong(Music song) {
        playlist.add(song);
    }

    public void removeSong(Music song) {
        playlist.remove(song);
    }
}
