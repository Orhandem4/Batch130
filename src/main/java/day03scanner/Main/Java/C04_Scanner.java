package day03scanner.Main.Java;

import java.util.Scanner;

public class C04_Scanner {
    public static void main(String[] args) {


        //Ex : Kullanicidan alacaginiz 5 basamakli bir sayinin
        // ilk 2 ve son 2 basamagindaki rakamlarin toplamini yazdiran kodu yaziniz


        Scanner input = new Scanner(System.in);
        System.out.println("lütfen 5 basamaklı bir sayi giriniz");

        int num=input.nextInt();
        int ilkIkiRkm= num/1000;
        System.out.println("ilk iki rakam="+ilkIkiRkm);

        int ilkIkiTop=(ilkIkiRkm % 10)+(ilkIkiRkm/10);

        System.out.println("ilkIkiTop = " + ilkIkiTop);

        int sonIkiRkm= num%100;
        System.out.println("son iki rakam="+sonIkiRkm);

        int sonIkiTop=(sonIkiRkm % 10)+(sonIkiRkm/10);
        System.out.println("sonIkiTop = " + sonIkiTop);

        System.out.println("ilk ve son iki sayinin toplami="+(ilkIkiTop+sonIkiTop));
        


    }
}
