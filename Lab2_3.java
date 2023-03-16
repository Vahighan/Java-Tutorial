import java.time.LocalDate;
import java.time.DayOfWeek;

public class Weekend2 {
    public static void main(String[] args) {
        // pobierz dzisiejszą datę
        LocalDate today = LocalDate.now();
        // oblicz datę kolejnej soboty
        LocalDate nextSaturday = today.with(DayOfWeek.SATURDAY);

        // oblicz liczbę dni pozostałych do weekendu
        int daysToWeekend = nextSaturday.getDayOfWeek().getValue() - today.getDayOfWeek().getValue();

        // tablica z nazwami dni tygodnia
        String[] daysOfWeek = {"poniedzialek", "wtorek", "sroda", "czwartek", "piatek", "sobota", "niedziela"};

        // wyświetl informację na konsoli
        if (daysToWeekend == 0) {
            System.out.println("Mamy weekend!");
        } else {
            System.out.println("Dzis " + daysOfWeek[today.getDayOfWeek().getValue() - 1] + ", do weekendu pozostało " + daysToWeekend + " " + (daysToWeekend == 1 ? "dzień" : "dni") + ".");
        }
    }
}
