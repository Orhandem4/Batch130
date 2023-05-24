package main.java.advanced_practice.practice03;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q02_List_EkleCikar {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();

        while (true) {
            System.out.println("Ekleme yapmak icin: 'add'\n" +
                    "Element güncellemek icin: 'set'\n" +
                    "Element eilmek icin: 'remove'\n" +
                    "Cıkmak icin: 'break' komutunu giriniz.");

            String komut = input.next();

            if (komut.equalsIgnoreCase("add")) {
                System.out.println("Eklemek istediginiz tamsayıyı giriniz");
                int eklenecekSayi = input.nextInt();
                list.add(eklenecekSayi);

            } else if (komut.equalsIgnoreCase("set")) {
                System.out.println("güncellemek istediginiz indeksi giriniz");
                int guncellenecekIndex = input.nextInt();
                System.out.println("yerine eklemek istediginiz sayıyı giriniz");
                int yeniSayi = input.nextInt();
                list.set(guncellenecekIndex, yeniSayi);

            } else if (komut.equalsIgnoreCase("remove")) {
                System.out.println("silmek istediginiz sayiyi giriniz");
                Integer silinecekSayi = input.nextInt();
                list.remove(silinecekSayi);

            } else if (komut.equalsIgnoreCase("break")) {

                break;

            } else {
                System.out.println("Gecerli bir komut giriniz");
            }
            System.out.println(list);

            //soruyu dinamik yapabilmek icin "while" kullandi
            // "set" methodu
            // "remove" methodu kullanacagiz dedi
            // WHILE 'in icine (true) yazarsan sonsuz calisir
            // onu kiracak bir sey koyman lazim, "break" koymalisin
            // eklemek icin "add"
            // silmek icin "remove"
            //cikmak icin "break"
            //"remove" methodu primitive data olarak yazilirsa "eleman" olarak algilayacak
            // "remove" methodu wrapper class olarak yazilirsa "index" olarak o sayiyi alir ve siler
            // yani o indexteki sayiyi siler
            // silerken de "ILK GORUNMU "alir
            //degistirirkende "ILK GORUNUMU" alir


        }
        System.out.println("güle güle");
        System.out.println("list = " + list);
    }
}