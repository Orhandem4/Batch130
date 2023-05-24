package day05typecastinstringmanipulations;

import java.util.Scanner;

public class StringManipulations03 {

    public static void main(String[] args) {

        /*
        Example 1: Asagidaki kurallara gore kullanicinin girdigi password'u kontrol ediniz.
                    i)En az 8 karakter olsun
                    i)Space Character'i olmasin
                    i)En az bir tane buyuk harf olsun
                    i)En az bir tane kücük harf olsun
                    i)En az bir tane sembol olsun
                    i)En az bir tane rakam olsun
         */

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen password'unuzu giriniz...");
        String pwd = input.nextLine();

        //i)En az 8 character olsun
        boolean first = pwd.length()>7;;

        //Space Character'i olmasin
        boolean second = !pwd.contains(" ");

        //En az bir tane buyuk harf olsun
        //Note: buyuk harf olmayanlari sil,
        //      kalan character sayisina bak
        //      Character sayisi sifir isa buyuk harf yok demektir
        //      sifirdan buyuk ise buyuk harf var demektir

        boolean third = pwd.replaceAll("[^A-Z]","").length()>0;// Method'lari ayni satirda yanyana kullanmaya "method chain" denir.

        //En az bir tane kucuk harf olsun

        boolean fourth = pwd.replaceAll("[^a-z]","").length()>0;

        //En az bir tane sembol olsun

        boolean fifth = pwd.replaceAll("[^a-zA-Z0-9]","").length()>0;

        //En az bir tane rakam olsun

        boolean sixth = pwd.replaceAll("[^0-9]","").length()>0;

        System.out.println(" Passwordd gecerli mi? " + (first && second && third && fourth && fifth && sixth));






















    }
}
