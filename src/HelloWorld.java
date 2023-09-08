import java.time.LocalDate;
import java.time.LocalDateTime;

public class HelloWorld {
    public static void main(String[] args){
        System.out.println("Hello World\n"+"Hello dat23D");
        System.out.println("Dette er årstal: 23");
        LocalDate Today = LocalDate.now();

        System.out.println("I dags dato: "+ Today);
        System.out.println("Datoen: "+ LocalDate.now());

        LocalDateTime TodayTime = LocalDateTime.now();

        System.out.println(LocalDateTime.now());
        System.out.println(LocalDateTime.now());

        System.out.println("Hello GitHub");
        System.out.println("Second attempt at commit and push");
    }
}
