package day19listsvarargs;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Lists01 {

    public static void main(String[] args) {

        //Example 1: verilen bir list'teki elemanlari tekrarsiz olarak yadiriniz
        //           [2,3,2,2,3,5] ==> [2,3,5]

        List<Integer> myList = new ArrayList<>();
        myList.add(2);
        myList.add(3);
        myList.add(2);
        myList.add(2);
        myList.add(3);
        myList.add(5);

        List<Integer> newList = new ArrayList<>();
        for (Integer w : myList) {

            if (!newList.contains(w)){

                newList.add(w);

            }
        }
        System.out.println(newList);

        //Example 2: Musteriden urun ismini alınız
        //           musterinin ismini verdigi urun listede varsa urunun ismini yazdiriniz
        //           musterinin ismini verdigi urun listede yoksa "out of stock" yazdiriniz

        Scanner input = new Scanner(System.in);
        System.out.println("Urun arama sistemimize hosgeldiniz...");
        System.out.println("Urun aramayi sonranldirmak icin Q'ya basiniz...");
        List<String> products = new ArrayList<>();

        products.add("TV");
        products.add("Radio");
        products.add("iPad");
        products.add("PC");
        products.add("Notebook");
        products.add("Mobile Phone");

        /*
           "for loop" kurunuz, products listindeki herbir elemanin
           tum characterlerini "set method" kullanarak kucuk harfe çeviriniz
           Kullanicidan gelen urun isminide kucuk harfe ceviriniz
         */
        do {
            System.out.println("Aradiginiz urunun ismini giriniz...");
            String p = input.nextLine();
            if (p.equalsIgnoreCase("Q")){
                break;
            } else if (products.contains(p)){
                System.out.println(p + "is in stock");
            } else {
                System.out.println(p + "is out of stock!...");
            }
        }while (true);

        System.out.println("sitemizi kullandiğiniz için teşekkür eder, tekrar bekleriz...");
    }
}
