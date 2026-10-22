package academy.devdojo.maratonajava.javacore.Rdatas.test;

import java.time.LocalDateTime;
import java.time.Month;
import java.time.temporal.ChronoUnit;

public class ChronoUnitTest01 {
    public static void main(String[] args) {
        LocalDateTime aniversario = LocalDateTime.of(1988, Month.AUGUST, 6, 12, 0, 0);
        LocalDateTime now = LocalDateTime.now();
        System.out.println("Dias passados: " + ChronoUnit.DAYS.between(aniversario,now));
        System.out.println("Semanas passadas: " + ChronoUnit.WEEKS.between(aniversario,now));
        System.out.println("Meses passados: " + ChronoUnit.MONTHS.between(aniversario,now));
        System.out.println("Anos passados: " + ChronoUnit.YEARS.between(aniversario,now));
    }
}
