package Testing_2;

import static org.junit.Assert.assertNotEquals;

import java.time.OffsetDateTime;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

import org.junit.Test;

public class MainTest {
    @Test
    public void testFullDatestteTime() {
        ZonedDateTime dateTime = OffsetDateTime.parse("2002-03-01T13:00:00Z").toZonedDateTime();
        String fullDateTime = dateTime.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.FULL));

        assertNotEquals(dateTime, fullDateTime);
        // in questo modo voglio testare che effettivamente il formato è cambiato da
        // dateTime a fullDateTime
    }

    @Test
    public void testMediumDateTime() {
        ZonedDateTime dateTime = OffsetDateTime.parse("2002-03-01T13:00:00Z").toZonedDateTime();
        String mediumDateTime = dateTime.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM));

        assertNotEquals(dateTime, mediumDateTime);
        // in questo modo voglio testare che effettivamente il formato è cambiato da
        // dateTime a mediumDateTime

    }

    @Test
    public void testShortDateTime() {
        ZonedDateTime dateTime = OffsetDateTime.parse("2002-03-01T13:00:00Z").toZonedDateTime();
        String shortDateTime = dateTime.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT));

        assertNotEquals(dateTime, shortDateTime);
        // in questo modo voglio testare che effettivamente il formato è cambiato da
        // dateTime a shortDateTime

    }
}
