package discography;

import junit.framework.TestCase;
import org.junit.Test;

import java.time.Duration;

public class TrackTest extends TestCase {
    //time 17:19
    @Test
    public void testCreateTrack() {
         final  String title= "And You and I";

        Track track = new Track(title,  10, 8);


        assertEquals(title, track.getTitle());
        assertFalse(track.isBonusTrack());
        assertEquals(Duration.ofMinutes(10).plusSeconds(8) , track.getPlayTime());
        assertEquals(title +" [PT10M8S]", track.toString());
    }

    @Test
    public void testCreateBonusTrack(){
        final String title = "America";

        Track track = new Track(title, 4,12, true);

        assertEquals(title,track.getTitle());
        assertTrue(track.isBonusTrack());
        assertEquals( Duration.ofMinutes(4).plusSeconds(12) ,track.getPlayTime());
        assertEquals(title + " [PT4M12S]",track.toString());
    }


}
