package orhan_deneme;

import java.util.Scanner;

public class Deneme7 {

    public static void main(String[] args) {

     Scanner input = new Scanner(System.in);
     System.out.println("100 den kucuk bir tam sayi giriniz...");
     byte sayi = input.nextByte();

     if (sayi>0 && sayi<101) {


         for (int i = 1; i < sayi; i++) {
             if (i % 3 == 0 && i % 5 == 0) {
                 System.out.println("java guzeldir");
             } else if (i % 5 == 0) {
                 System.out.println("guzeldir");
             } else if (i % 3 == 0) {
                 System.out.println("java");
             } else System.out.println(i);
         }
     }


    }
}
