package Testing_5;

import static org.junit.Assert.assertTrue;
import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

import org.junit.Test;

public class MainTest {
    @Test
    public void testLocal() {
        OffsetDateTime dateTime = OffsetDateTime.parse("2023-03-01T13:00:00Z");
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy \nHH:mm:ss", Locale.ITALY);
        String formattedDateTime = dateTime.format(formatter);

        assertTrue(formattedDateTime, true);
    }
}