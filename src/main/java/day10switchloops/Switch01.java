package day10switchloops;

import java.util.Scanner;

public class Switch01 {

    public static void main(String[] args) {

        //Example 1: Ay numarasini soyleyince, numarasi verilen ay'dan baslayip 12. aya kadar tum aylari isimlerini
        //           yazdiran kodu yaziniz
        //           8 ==> august - september - october - november - december

        Scanner input = new Scanner(System.in);
        System.out.println("baslangic ayinin kacinci ay oldugunu giriniz...");
        byte numOfMonth = input.nextByte();

        switch (numOfMonth){

            case 1:
                System.out.println("january");
            case 2:
                System.out.println("february");
            case 3:
                System.out.println("march");
            case 4:
                System.out.println("april");
            case 5:
                System.out.println("may");
            case 6:
                System.out.println("june");
            case 7:
                System.out.println("july");
            case 8:
                System.out.println("august");
            case 9:
                System.out.println("september");
            case 10:
                System.out.println("october");
            case 11:
                System.out.println("november");
            case 12:
                System.out.println("december");
            break;
            default:
                System.out.println("gecerli ay numarasi giriniz");
        }

        /*
             Note: "switch" de i)String, int, byte, short, char kullanilabilir
             Note: "switch" de i)long, boolean, float, double kullanilmaz
         */











    }
}
