package day12forloopwhileloop;

import java.util.Scanner;

public class ForLoop04 {

    public static void main(String[] args) {

        /*
              Kullanicidan baslangic ve bitis degerlerini alin.
              Baslangic degerinden baslayip bitis degerine kadar aradaki tum cift tamsayilari
              ekrana yazdiriniz
              // 9 - 14 = 10  12  14
        */

        Scanner input = new Scanner(System.in);

        System.out.println("baslangic degerini giriniz...");
        int start = input.nextInt();

        System.out.println("bitis degerini giriniz...");
        int end = input.nextInt();

        if (start>end){
            System.out.println("baslangic degeri bitis degerinden buyuk olamaz...");
        }else{
            for (int i=start ; i<=end ; i++){

                if (i%2==0){
                    System.out.print(i+" ");
                }
            }
        }
    }
}
