package discography;

import junit.framework.TestCase;
import org.junit.Test;

import java.time.Duration;
import java.time.LocalDate;
import java.util.ArrayList;

public class RecordTest extends TestCase {


    @Test
    public void testCreateEmptyRecord() {
        final String title = "Under Production";
        final LocalDate releaseDate = LocalDate.of(2074, 10, 6);
        final Duration playTime = Duration.ofMinutes(0).plusSeconds(0);
        final Record.Type type = Record.Type.SINGLE;

        Record record = new Record(title, releaseDate, playTime, type);

        assertEquals(title, record.getTitle());
        assertEquals(releaseDate, record.getReleaseDate());
        assertEquals(playTime, record.getPlayTime());
        assertEquals(0, record.getTrackCount());
        assertEquals(type, record.getType());
        assertEquals(title + " [" + releaseDate + ", " + playTime + "]", record.toString());

    }

    @Test
    public void testCreateRecord() {
        final String title = "Close to the Edge";
        final LocalDate releaseDate = LocalDate.of(1972, 9, 13);
        final Duration playTime = Duration.ofMinutes(14).plusSeconds(20);
        final int trackCount = 2;
        final Record.Type type = Record.Type.ALBUM;
        final ArrayList<Track> tracks = new ArrayList<>();


        tracks.add(new Track("And You and I", 10, 8));
        tracks.add(new Track("America", 4, 12, true));

        final String output = title + " [" + releaseDate + ", " + playTime + "]\n[1] " +tracks.get(0).toString() + "\n[2] " + tracks.get(1).toString();

        Record record = new Record(title, releaseDate, playTime, trackCount, type, tracks);

        assertEquals(title, record.getTitle());
        assertEquals(releaseDate, record.getReleaseDate());
        assertEquals(playTime, record.getPlayTime());
        assertEquals(0, record.getTrackCount());
        assertEquals(type, record.getType());
        assertEquals(output, record.toString());

    }
}
