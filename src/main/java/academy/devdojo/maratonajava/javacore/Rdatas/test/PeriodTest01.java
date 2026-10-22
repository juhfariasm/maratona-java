package academy.devdojo.maratonajava.javacore.Rdatas.test;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class PeriodTest01 {
    public static void main(String[] args) {
        LocalDate now = LocalDate.now();
        LocalDate nowAfterTwoYears = LocalDate.now().plusYears(2);

        Period p1 = Period.between(now, nowAfterTwoYears).plusDays(7);
        Period p2 = Period.ofDays(10);
        Period p3 = Period.ofWeeks(58);
        Period p4 = Period.ofMonths(3);
        Period p5 = Period.ofYears(3);

        System.out.println("Agora até 2 anos: " + p1);
        System.out.println("10 dias: " + p2);
        System.out.println("58 semanas: " + p3);
        System.out.println("3 meses: " + p4);
        System.out.println("3 anos: " + p5);

        System.out.println(p3.getMonths());
        System.out.println(Period.between(now, now.plusDays(p3.getDays())).getMonths());
        System.out.println(now.until(now.plusDays(p3.getDays()), ChronoUnit.DAYS));
    }
}
