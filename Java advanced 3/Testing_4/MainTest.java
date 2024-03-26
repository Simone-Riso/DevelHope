package Testing_4;

import static org.junit.Assert.assertEquals;
import java.time.OffsetDateTime;
import java.time.ZonedDateTime;
import java.time.format.TextStyle;
import java.util.Locale;

import org.junit.Test;

public class MainTest {
    @Test
    public void testYear() {
        ZonedDateTime data = OffsetDateTime.parse("2023-03-01T13:00:00Z").toZonedDateTime();
        int year = data.getYear();

        assertEquals(2023, year);
        //controllo che grazie a getYear year ha il valore corretto
    }

    @Test
    public void testMonth() {
        ZonedDateTime data = OffsetDateTime.parse("2023-03-01T13:00:00Z").toZonedDateTime();
        int month = data.getMonthValue();

        assertEquals(3, month);
        //controllo che grazie a getMonthValue month ha il valore corretto
    }

    @Test
    public void testDay() {
        ZonedDateTime data = OffsetDateTime.parse("2023-03-01T13:00:00Z").toZonedDateTime();
        int day = data.getDayOfMonth();

        assertEquals(1, day);
        //controllo che grazie a getDayOfMonth day ha il valore corretto

    }

    @Test
    public void testDayOfTheWeek() {
        ZonedDateTime data = OffsetDateTime.parse("2023-03-01T13:00:00Z").toZonedDateTime();
        String dayOfTheWeek = data.getDayOfWeek().getDisplayName(TextStyle.FULL, Locale.ITALY);

        assertEquals("mercoledì", dayOfTheWeek);
        //controllo che grazie a getDayOfWeek dayOfTheWeek ha il valore corretto

    }
}
