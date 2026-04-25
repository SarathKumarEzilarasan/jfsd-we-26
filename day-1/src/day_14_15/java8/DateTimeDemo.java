package day_14_15.java8;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class DateTimeDemo {
    public static void main(String[] args) {
//        Date date = new Date();
//        System.out.println(date);
//        Calendar calendar = Calendar.getInstance();
//        System.out.println(calendar.getTime());


        LocalDate localDate = LocalDate.of(2000, 2, 10);
        System.out.println(localDate);

        LocalTime localTime = LocalTime.now();
        System.out.println(localTime);

        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);
    }
}
