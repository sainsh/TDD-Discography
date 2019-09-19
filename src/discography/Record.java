package discography;

import java.time.Duration;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.GregorianCalendar;

public class Record {


    private final String title;
    private final LocalDate releaseDate;
    private final Duration playTime;
    private Type type;
    private ArrayList<Track> tracks;

    public Record(String title, LocalDate releaseDate, Duration playTime, Type type) {
        this(title, releaseDate, playTime, 0, type, null);
    }

    public Record(String title, LocalDate releaseDate, Duration playTime, int trackCount, Type type, ArrayList<Track> tracks) {
        this.title = title;
        this.releaseDate = releaseDate;
        this.playTime = playTime;
        this.type = type;
        this.tracks = tracks;

    }

    public String getTitle() {
        return title;
    }

    public LocalDate getReleaseDate() {
        return releaseDate;
    }

    public int getTrackCount() {
        return 0;
    }

    public Duration getPlayTime() {
        return playTime;
    }

    public Type getType() {
        return type;
    }

    @Override
    public String toString() {
        String output = title + " [" + releaseDate + ", " + playTime + "]";
        int i = 1;
        if (tracks != null) {
            for (Track track :
                    tracks) {
                output += "\n[" +i+"] "  + track.toString();
                i++;
            }
        }

        return output;
    }

    public enum Type {SINGLE, ALBUM}
}
