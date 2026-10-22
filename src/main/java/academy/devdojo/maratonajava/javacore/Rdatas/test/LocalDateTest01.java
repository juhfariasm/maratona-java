package academy.devdojo.maratonajava.javacore.Rdatas.test;

import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoField;
import java.util.Calendar;
import java.util.Date;

public class LocalDateTest01 {
    public static void main(String[] args) {
        System.out.println(new Date());
        System.out.println(Calendar.getInstance());
        System.out.println(Month.JANUARY.getValue());

        LocalDate date = LocalDate.of(2022, Month.JANUARY, 27);
        LocalDate agora = LocalDate.now();
        agora = agora.plusWeeks(4);

        System.out.println("Ano: " +date.getYear());
        System.out.println("Mês: " + date.getMonth());
        System.out.println("Número do mês: " + date.getMonthValue());
        System.out.println("Dia da semana: " + date.getDayOfWeek());
        System.out.println("Dia do mês: " + date.getDayOfMonth());
        System.out.println("Dias totais do mês: " + date.lengthOfMonth());
        System.out.println("Ano bissexto: " + date.isLeapYear());
        System.out.println(date.get(ChronoField.YEAR));
        System.out.println(date.get(ChronoField.DAY_OF_MONTH));
        System.out.println(date);
        System.out.println(agora);
        System.out.println(LocalDate.MAX);
        System.out.println(LocalDate.MIN);
    }
}
