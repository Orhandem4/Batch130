package main.java.day07ifstatement;

import java.util.Scanner;

public class C01_IfStatement {

    public static void main(String[] args) {

        // if it rains , I willcancel the picnic
        // eger yagmur yagarsa piknigi iptal edecegim

        //Ex 1) Verilen character buyuk harf ise ekrana "buyuk harf" yazdiran kodu olusturunuz

        char ch = 'S';

        if(ch>='A' && ch<='Z'){
            System.out.println("buyuk harf");
        }

        //Ex 2) Verilen bir sayi cift  sayi ise ekrana cift sayi yazdiran kodu olsturunuz

        int num1 = 20;

        if(num1 % 2 == 0){
            System.out.println("cift sayi");
        }

        //Ex 3) Verilen bir sayi 300 den kucuk veya 1200 den buyuk ise ekrana harika sayi yazdiriniz

        int num2 = 1400;

        if(num2<=300 || num2>=1200){
            System.out.println("harika sayi");
        }

        //Ex 4) kullanicidan alinan sayinin tek mi cift mi oldugunu ekrana ayzdiran kodu yaziniz

        Scanner scn = new Scanner(System.in);

        System.out.println("lutfen sayiyi giriniz");

        int num = scn.nextInt();

        if (num%2 == 0){
            System.out.println("çift sayi");
        }
        if (num%2 == 1){
            System.out.println("tek sayidir");
        }

        //2.yol
        if (num%2 == 0 ){
            System.out.println("cift sayi");
        }else{        //else digeri tum ihtimaller
            //burada conditional yok tek kontrol var
            //busekilde javaya azis yaptirdik
            System.out.println("tek sayi");
        }

        //Ex 5) Verilen bir sayinin negatif, pozitif ya da notr oldugunu soyleyen kodu yaziniz

        int numara = 105;

        if (numara<0){
            System.out.println("negatif sayi");
        }else if(numara == 0){
            System.out.println("notr sayi");
        }else{
            System.out.println("pozitif sayi");
        }




























    }
}
