package Aula6.Exercicio2;

import java.sql.Time;
import java.util.ArrayList;

public class Music {
    private String title;
    private int duration;

    ArrayList<Music> playlist = new ArrayList<>();

    public Music(String title, int duration) {
        this.title = title;
        this.duration = duration;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

}
