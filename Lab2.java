import java.util.Calendar;
import java.util.Date;

public class Weekend {
    public static void main(String[] args) {
        // utwórz obiekt kalendarza
        Calendar calendar = Calendar.getInstance();

        // ustaw kalendarz na dzisiejszą datę
        calendar.setTime(new Date());

        // oblicz numer dnia tygodnia (niedziela = 1, sobota = 7)
        int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);

        // oblicz liczbę dni do najbliższego weekendu
        int daysToWeekend = 7 - dayOfWeek;

        // jeśli jest już weekend, oblicz dni do kolejnego weekendu
        if (daysToWeekend <= 0) {
            daysToWeekend += 7;
        }

        // wyświetl informację na konsoli
        System.out.println("Liczba dni do weekendu: " + daysToWeekend);
    }
}
