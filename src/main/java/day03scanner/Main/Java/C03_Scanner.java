package day03scanner.Main.Java;

import java.util.Scanner;

public class C03_Scanner {
    public static void main(String[] args) {

        //EX 1) Kullanicidan sayilari alarak toplama islemi yaptiran kodu yaziniz

        Scanner input = new Scanner(System.in);

        System.out.println("lütfen toplanacak olan ilk sayiyi giriniz");
        double sayi1= input.nextDouble();

        System.out.println("lütfen toplanacak olan ikinici sayıyı giriniz");
        double sayi2= input.nextDouble();

        System.out.println("Toplam=" + (sayi1 +sayi2));


        Scanner scan = new Scanner(System.in);

        System.out.println("lütfen çarpmak istediğiniz ilk sayıyı giriniz");

        double num1 = scan.nextDouble();

        System.out.println("lütfen çarpmak istediğiniz ikinici sayıyı giriniz");

        double num2 = scan.nextDouble();

        System.out.println("toplam="+(num1*num2));


    }
}
