package Date_4;

import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        OffsetDateTime dateTime = OffsetDateTime.parse("2023-03-01T13:00:00Z");

        dateTime = dateTime.plusYears(1);
        dateTime = dateTime.minusMonths(1);
        dateTime = dateTime.plusDays(7);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy \nHH:mm:ss", Locale.ITALY);

        String formattedDateTime = dateTime.format(formatter);
        System.out.println(formattedDateTime);
    }
}
