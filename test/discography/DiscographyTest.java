package discography;

import junit.framework.TestCase;
import org.junit.Test;

import java.time.Duration;
import java.time.LocalDate;
import java.util.ArrayList;


public class DiscographyTest extends TestCase {

    @Test
    public void testCreateEmptyDiscography() {

        final String name = "Future Artist";
        final int recordCount = 0;

        Discography discography = new Discography(name, recordCount);

        assertEquals(name, discography.getName());
        assertEquals(recordCount, discography.getRecordCount());
        assertEquals(name + "\n" + recordCount + " records", discography.toString());


    }

    @Test
    public void testCreateDiscography() {

        final String name = "Yes";
        final int recordCount = 1;
        final ArrayList<Track> tracks = new ArrayList<>();
        final String title = "Close to the Edge";
        final LocalDate releaseDate = LocalDate.of(1972, 9, 13);
        final Duration playTime = Duration.ofMinutes(14).plusSeconds(20);
        final int trackCount = 2;
        final Record.Type type = Record.Type.ALBUM;

        tracks.add(new Track("And You and I", 10, 8));
        tracks.add(new Track("America", 4, 12, true));

        Record record = new Record(title, releaseDate, playTime, trackCount, type, tracks);

        final ArrayList<Record> records = new ArrayList<>();
        records.add(record);

        Discography discography = new Discography(name, recordCount,records);

        final String display = name + "\n" + recordCount + " records\n[1] " + record.toString();

        assertEquals(name, discography.getName());
        assertEquals(recordCount, discography.getRecordCount());
        System.out.println(display);
        assertEquals(display, discography.toString());


    }


}
