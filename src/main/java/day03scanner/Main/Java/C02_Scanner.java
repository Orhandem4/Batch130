package day03scanner.Main.Java;

import java.util.Scanner;

public class C02_Scanner {
    //Scanner classi kullanici ile etkikesim kurmamizi saglar.
    //Scanner bir class'tir.Java util kutuphanesinden getirildigi icin import ister

    public static void main(String[] args) {

        //Kullanicidan data almak icin
        //1.Adim Scanner Class'indan Obje olusturun

        Scanner input = new Scanner(System.in);
        //Scanner scan = new Scanner(System.in);

        //2.Adim Kullaniciya ne yapacagini söyle
        System.out.println("Lütfen yaşınızı giriniz");

        //3.Aadim Kullanicidan aldiginiz datayi variable icine koyun
        byte age = input.nextByte();


        //kullaniciya ad, memleket, yas, boy, yasaddigi yeri sevip sevmedigini soran bir program yaziniz

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen isminizi giriniz...");
        String isim = scan.nextLine(); //Kullanicidan String bir deger istedik tum satiri almasi icin nextLine sectik
        System.out.println("Lütfen yasinizi giriniz...");
        byte yas = scan.nextByte();
        System.out.println("Lütfen memleketinizi giriniz...");
        String memleket = scan.next();
        System.out.println("lütfen boyunuzu giriniz...");
        double boy = scan.nextDouble();
        System.out.println("Lütfen yaşadığınız yeri sevip sevmediginizi yaziniz");
        boolean seviyorMu = scan.nextBoolean();
        System.out.println("****************");
        System.out.println("isim = " + isim);
        System.out.println("yas = " + yas);
        System.out.println("memleket = " + memleket);
        System.out.println("boy = " + boy);
        System.out.println("seviyorMu = " + seviyorMu);



    }
}
