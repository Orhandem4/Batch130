package day13whileloopdowhileloop;

import java.util.Scanner;

public class WhileLoop01 {

    public static void main(String[] args) {

        //Example 1: Kullanicinin verdigi sayi icin carpim tablosunu olusturup console'a yazdiran kodu yaziniz
        //           3 ==> 3x1=3 3x2=6 3x3=9 3x4=12 ... 3x10=30

        Scanner input =new Scanner(System.in);
        System.out.println("carpim tablosunu gormek icin bir sayi giriniz");
        double num = input.nextDouble();

        int i = 1;

        while (i<11){

            System.out.println(num + "x" + i + "=" + (num*i));

            i++;
        }

        //Example 2: Verilen bir String'de her harfin sonrasina "*" sembolunu ekleyiniz.
        //           Java ==> J*a*v*a*

        System.out.println("bir kelime giriniz");
        String word = input.next();
        String newWord = "";

        int k = 0;

        while (k<word.length()){

        newWord += word.charAt(k)+"*";

            k++;
        }
        System.out.println(newWord);













    }
}
