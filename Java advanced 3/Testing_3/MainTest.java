package Testing_3;

import static org.junit.Assert.assertEquals;
import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

import org.junit.Test;

public class MainTest {
    @Test
    public void testNewFormat() {
        String dateString = "2023-03-01T13:00:00Z";
        OffsetDateTime dateTime = OffsetDateTime.parse(dateString);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd MMMM yyyy", Locale.ITALY);
        //cambiando il Locale.ITALY in per esempio Locale.GERMAN il test non passa
        String formattedDate = dateTime.format(formatter);

        assertEquals("01 marzo 2023", formattedDate);
        //controllo che ritorni effettivamente la data desiderata dall'esercizio
    }
}
