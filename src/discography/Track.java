package discography;

import java.time.Duration;

public class Track {

    private String title;
    private boolean isBonusTrack = false;
    private final int minutes = 10;
    private final int seconds = 8;
    private Duration playTime;


    public Track(String title, int minutes, int seconds) {
        this(title,minutes,seconds, false);

    }

    public Track(String title, int minutes, int seconds, boolean isBonusTrack) {
        this.title=title;
        playTime = Duration.ofMinutes(minutes).plusSeconds(seconds);
        this.isBonusTrack=isBonusTrack;
    }

    public String getTitle() {
        return title;
    }

    public boolean isBonusTrack() {
        return isBonusTrack;
    }

    public Duration getPlayTime() {
        return playTime;
    }

    @Override
    public String toString() {
        return title + " [" + playTime +"]" ;
    }
}
