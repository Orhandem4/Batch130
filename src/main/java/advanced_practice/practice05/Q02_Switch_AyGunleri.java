package main.java.advanced_practice.practice05;

import java.util.Scanner;

public class Q02_Switch_AyGunleri {

    public static void main(String[] args) {

        /*
            Girilen yil ve ay numarasına göre ayin kaç gün olduğunu yazdiran bir kod yazınız.
            Girdi yıl: 2000 ay: 2
            Çıktı: 29
        */

        Scanner input = new Scanner(System.in);
        System.out.println("yıl giriniz");
        int yıl = input.nextInt();
        System.out.println("girmek istediğiniz ayın sırasını giriniz");
        int ay = input.nextInt();
        int gunSayisi = 0;

        switch (ay){
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                gunSayisi = 31;
                break;
            case 4: case 6: case 9: case 11:
                gunSayisi = 30;
                break;
            case 2:
                if ((yıl % 400 ==0) || ((yıl % 4 == 0) && !(yıl % 100 == 0))){
                    gunSayisi = 29;
                }else{
                    gunSayisi = 28;
                }
                break;
            default:
                System.out.println("gecerli bir ay giriniz");
                break;
        }
        System.out.println("gunSayisi = " + gunSayisi);


    }
}
