package main.java.advanced_practice.practice01;

import java.util.Scanner;

public class Q04_Regex_AdSoyad {

    public static void main(String[] args) {

        /*
       Kullanıcıdan tek seferde alacağınız 2 kelimelik ad soyadı 2 ayrı kelimeye ayırınız,
       ad ayrı soyad ayrı sekilde ekrana yazdırınız.
       Örn:
       Ad: Ali
       Soyad: Can
       */

        Scanner input = new Scanner(System.in);
        System.out.println("ad ve soy adinizi aralarında bir bosluk olacak sekilde giriniz");
        // "\\s" bir bosluk "\\s+" bir veya birden fazla bosluk anlamina gelir.
        String adSoy = input.nextLine().replaceAll("[^a-zA-Z ]", " ").replaceAll("\\s+"," ").trim().toLowerCase();

        String ad = adSoy.split(" ")[0];
        String soyad = adSoy.split(" ")[1];

        String adIlkHarf = ad.substring(0,1).toUpperCase();
        String soyadIlkHarf = soyad.substring(0,1).toUpperCase();

        String adFormatli = adIlkHarf+ad.substring(1);
        String soyadFormatli = soyadIlkHarf+soyad.substring(1);

        System.out.println("adFormatli = " + adFormatli);
        System.out.println("soyadFormatli = " + soyadFormatli);
    }
}
