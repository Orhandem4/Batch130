package day03scanner.Main.Java;

import java.util.Locale;
import java.util.Scanner;

public class C06_Scanner {
    public static void main(String[] args) {


        //kullanicidan aldiginiz sekil ile asagidaki gibi bir görsel olusturunuz
        /*
          A
         A A
        A A A
        */

        Scanner input = new Scanner(System.in);
        System.out.println("lütfen bir akrakter giriniz");
        char ch = input.next().charAt(0);

        System.out.println("  "+ch+"  ");
        System.out.println(" "+ch+" "+ch+" ");
        System.out.println(ch+" "+ch+" "+ch);

        String s1 = "Java Kolaydır";
        System.out.println(s1.toUpperCase());

        int sayı1 = 5;
        int sayı2 = 2;
        double sonuc = sayı1/sayı2;
        System.out.println(sonuc);













    }
}
