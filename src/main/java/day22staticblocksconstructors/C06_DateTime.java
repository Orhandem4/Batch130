package day22staticblocksconstructors;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class C06_DateTime {

    public static void main(String[] args) {

        //Date Class
        Date myDate = new Date();
        System.out.println(myDate);//Mon Jan 09 16:51:10 EET 2023
        System.out.println(myDate.getTime());//1673272341996 ==> 1 Ocak 1970 den su ana kadar ki mili saniye miktari

        //icinde bulundugumuz an nasil alinir?
        System.out.println(LocalDate.now());//2023-01-09

        System.out.println(LocalTime.now());//16:56:14.763861500

        System.out.println(LocalDateTime.now());//2023-01-09T16:57:07.319428500

        System.out.println(LocalDateTime.now(ZoneId.of("Europe/Vienna")));//2023-01-09T15:04:13.171809100

        System.out.println(LocalDateTime.now(ZoneId.of("Asia/Tokyo")));//2023-01-09T23:05:03.815185400

        //ileriki bir tarihe nasıl gidilir?
        System.out.println(LocalDate.now().plusYears(7).plusMonths(5).plusDays(35));//2030-07-14

        //eski bir tarihe nasıl gidilir?
        System.out.println(LocalDate.now().minusYears(4).minusMonths(3).minusDays(2));//2018-10-07

        //ileriki bir zamana nasıl gidilir?
        System.out.println(LocalTime.now().plusHours(3));//20:12:08.532177400

        //geriki bir zamana nasıl gidilir?
        System.out.println(LocalTime.now().minusMinutes(45));//16:28:06.051532300

        //Zaman'da belli bir bölümü nasıl alırız?
        System.out.println(LocalTime.now().getHour()+":"+LocalTime.now().getMinute());//17:14

        //Tarih'de belli bir bölümü nasıl alırız?
        System.out.println(LocalDate.now().getMonth()+" "+LocalDate.now().getDayOfMonth());//JANUARY 9
        System.out.println(LocalDate.now().getMonthValue()+":"+LocalDate.now().getDayOfMonth());// 1:9

        //iki tarih nasil karsilastirilir?
        //02/13/2005 - 03/01/2007
        boolean result = LocalDate.of(2005,02,13).isAfter(LocalDate.of(2007,03,01));
        System.out.println(result);//false

        //Tarih'lerin formatlari nasil degistirilir?
        //M-->Tek rakamla ay  no'sunu yazar - MM--> Iki rakamla ay no'sunu yazar
        //MMM-->Ay isminin ilk uc harfini yazar  -  MMMM-->Ay isminin tamamini yazar

        //d-->Tek rakamla gun no'sunu yazar   -   dd-->Iki rakamla gun no'sunu yazar

        //yy-->Yilin son iki rakamini yazar   -   yyyy--> Yilin tamamini yazar
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.println(dtf.format(LocalDate.now()));//09/01/2023














    }
}
