package day16multidimensionalarrays;

import java.util.Arrays;

public class C02_MultidimensionalArrays {

    public static void main(String[] args) {

        //Bir tane integer multidimensional array olusturunuz
        //Bu array'deki tum sayilarin toplamini veren kodu yaziniz.

        int arr[][] = {{2, 5, 1}, {32, 75}};

        int sum = 0;
        System.out.println(Arrays.deepToString(arr));//[[2, 5, 1], [32, 75]]

        for (int[] w : arr) {//[[2, 5, 1], [32, 75]]

            for (int s : w){//s artik array degil arrain icindeki integer deger
                sum = sum+s;
            }
        }
        System.out.println(sum);//115

        //Multidimensional Array'i tek katli Array'e cevirme

        /*
        1)Once multidimensional array'in eleman asyisini bulun
        2) yeni bir array almaliyim yeni olsturdugum bu array'İn buyuklugu
           ilk multidimansional array'in eleman asyisina esit buyuklukte olmalı
         */

        int brr[][] = {{2,5,1},{32,75}};

        int toplam=0;
        System.out.println(Arrays.deepToString(brr));//[[2, 5, 1], [32, 75]]
        for (int[] w : brr) {
            toplam = toplam+ w.length;
        }
        System.out.println(toplam);

        int idx = 0;
        int crr[] = new int[toplam];

        for (int[] w : brr) {

            for (int s : w) {//arrayin icindeki her bir k degerini getir yeni crr arrayinin icine idx'e gore yerlestir

                crr[idx]=s;

                idx++;

            }
        }
        System.out.println(Arrays.toString(crr));











    }
}
