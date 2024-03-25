package Date_3;

//import java.time.DayOfWeek; da importare per utilizzare DayOfTheWeek
import java.time.OffsetDateTime;
import java.time.ZonedDateTime;
import java.time.format.TextStyle;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        ZonedDateTime data = OffsetDateTime.parse("2023-03-01T13:00:00Z").toZonedDateTime();
        int year = data.getYear();
        int month = data.getMonthValue();
        int day = data.getDayOfMonth();
        String dayOfTheWeek = data.getDayOfWeek().getDisplayName(TextStyle.FULL, Locale.ITALY);
        //DayOfWeek dayOfTheWeek = data.getDayOfWeek(); funzionava allo stesso modo ma non in italiano

        System.out.println("Anno: " + year);
        System.out.println("Mese: " + month);
        System.out.println("Giorno: " + day);
        System.out.println("Giorno: " + dayOfTheWeek);
    }
}
