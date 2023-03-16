import java.util.Calendar;
import java.util.Date;

public class Weekend1 {
    public static void main(String[] args) {
        // utwórz obiekt kalendarza
        Calendar calendar = Calendar.getInstance();

        // ustaw kalendarz na dzisiejszą datę
        calendar.setTime(new Date());

        // oblicz numer dnia tygodnia (niedziela = 1, sobota = 7)
        int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);

        // wyświetl informację na konsoli
        switch (dayOfWeek) {
            case Calendar.MONDAY:
                System.out.println("Dzis jest poniedzialek.");
                break;
            case Calendar.TUESDAY:
                System.out.println("Dzis jest wtorek.");
                break;
            case Calendar.WEDNESDAY:
                System.out.println("Dzis jest sroda.");
                break;
            case Calendar.THURSDAY:
                System.out.println("Dzis jest czwartek.");
                break;
            case Calendar.FRIDAY:
                System.out.println("Dzis jest piątek.");
                break;
            default:
                System.out.println("Jest weekend.");
                break;
        }
    }
}
