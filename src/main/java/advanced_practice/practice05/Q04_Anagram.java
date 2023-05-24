package advanced_practice.practice05;

import java.util.Arrays;
import java.util.Scanner;

public class Q04_Anagram {

        /*
           İki kelimenin "Anagram" olup olmadığını kontrol eden bir method oluşturunuz.
           - Anagram, başka bir kelimenin karakterlerinden yeni bir kelime oluşturmaktır. -
           Örn:
           * bahriyeli <> harbiyeli.
           * sızlanma <> anlamsız.
           * asya <> yasa.
           * Bursa Dağı <> su bardağı
           * kan ara <> Ankara.
        */

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        System.out.println("birinici stringi giriniz");
        String birinici = scn.nextLine();
        System.out.println("ikinci stringi giriniz");
        String ikinci = scn.nextLine();

        anagram(birinici,ikinci);

    }

    public static void anagram(String str1,String str2){
        String[] arr1 = str1.toLowerCase().replaceAll(" ","").split("");
        String[] arr2 = str2.toLowerCase().replaceAll(" ","").split("");

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        if (Arrays.equals(arr1,arr2)){
            System.out.println("anagram");
        }else {
            System.out.println("anagram Değil");
        }







    }










}
