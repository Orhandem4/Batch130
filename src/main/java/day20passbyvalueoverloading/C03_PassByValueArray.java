package day20passbyvalueoverloading;

import java.util.Arrays;

public class C03_PassByValueArray {

    public static void main(String[] args) {

        int sayilar[] = {3,4,5,6};
        elemanDegistir(sayilar);
        System.out.println("main içinde eleman degişince sayilar[] " + Arrays.toString(sayilar));

        //arrayiDegistir(sayilar);
        //System.out.println("main içinde "+Arrays.toString(sayilar));
        sayilar=arrayiDegistir(sayilar);
        System.out.println("main içinde "+Arrays.toString(sayilar));


    }

    private static int[] arrayiDegistir(int[] sayilar) {

        sayilar = new int[6];
        System.out.println("method içinde"+Arrays.toString(sayilar));
        return sayilar;
    }

    private static void elemanDegistir(int[] sayilar) {

        sayilar[0]=10;
        System.out.println("method içinde eleman degişince sayilar[] " + Arrays.toString(sayilar));
    }
}
