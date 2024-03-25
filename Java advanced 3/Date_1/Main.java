package Date_1;

import java.time.OffsetDateTime;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class Main {
    public static void main(String[] args) {
        ZonedDateTime dateTime = OffsetDateTime.parse("2002-03-01T13:00:00Z").toZonedDateTime();
        // .toZonedDateTime() serve per far funzionare il FULL/LONG format altrimenti andrebbe in errore
        // .atZoneSimilarLocal(ZoneId.of("Europe/Rome")) per aggiungere il nome della time zone
        System.out.println(dateTime);

        String fullDateTime = dateTime.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.FULL));
        System.out.println("Full format: " + fullDateTime);

        String mediumDateTime = dateTime.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM));
        System.out.println("Medium format: " + mediumDateTime);

        String shortDateTime = dateTime.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT));
        System.out.println("Short format: " + shortDateTime);
    }
}
