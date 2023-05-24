package day23datetimestringbuilder;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class C01_DateTime01 {

    public static void main(String[] args) {

        //Example 1. Time'i formatlayiniz

        LocalTime myTime = LocalTime.now();
        System.out.println(myTime);//11:17:09.339540

        //hh ==12 lik saat sistemini kullanir  -  HH==>24 luk saat sistemini kullanir
        //hh kullandiginizda AM veya PM demelisiniz, bunu demek için "a" yazmaniz yeterlidir. yani; "hh:mm:ss a"
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("hh-mm-ss a");

        System.out.println(dtf.format(myTime));//11-22-56 ÖÖ
    }
}
