package ssg;

import java.util.Random;
import java.util.Scanner;

public class SayiBulmaca {

    public static void main(String[] args) {

        // bilgisayara 1 ile 100 arasinda bir sayi tutturun
        // kullanicidan bu sayiyi tahmin etmesini isteyin
        // girilen her tahminde sayiyi buyut veya kucult diye kullaniciya yol gosterin
        // kullanici sayiyi buldugunda kac tahminde sayiyi buldugunu kullaniciya yazdirin

        Scanner input = new Scanner(System.in);
        System.out.println("tahmininizi giriniz");

        Random rnd = new Random();
        int sayi = rnd.nextInt(100);
        int tahmin = 0;
        int sayac = 1;

        while (sayi!=tahmin){

            tahmin = input.nextInt();

            if (tahmin>sayi){
                System.out.println("daha kucuk bir sayi giriniz");
            } else if (tahmin<sayi) {
                System.out.println("daha buyuk bir sayi giriniz");
            }
            sayac++;
        }
        System.out.println((sayac-1) + " tahminde buldunuz tebrikler");












    }
}
