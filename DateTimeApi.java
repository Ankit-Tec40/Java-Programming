import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DateTimeApi {
    public static void main(String[] args) {
        
        LocalDate d=LocalDate.now();
        System.out.println(d);
        LocalTime t=LocalTime.now();
        System.out.println(t);

        DateTimeFormatter df=DateTimeFormatter.ofPattern("E/dd/MM/yyyy");
        String Mydate=d.format(df);
        System.out.println(Mydate);
    }
    
}
