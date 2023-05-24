package day17_arraylists;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class ArrayLists01 {

     /*
         1) ArrayList'ler coklu data depolamak icin kullanilir.
         2) ArrayList'ler non-primitive data type'indaki coklu datalari depolamak icin kullanilir.
         List'ler "non-primitive" data kabul ederler, "Array" ler ise "primitive" data veya reference kabul eder.
         3) ArrayList'leri olusturuken icine koyacaginiz eleman sayisini basta soylemeye gerek yoktur.
            List'ler eleamn sayisinda "flexible" dirlar ama "Array" ler "felxible" degildirleer.
         4) madem "Array" ler eleman sayisinda lexible degil neden Java "Array" leri iptal etmedi?
         i) Eleman sayisi belli olan data'lari depolamnak icin Array'ler tercih edilir
         ii) Array'ler cok hizli calisir
         iii)Array'ler memory'de cok az yer kaplar
     */
    public static void main(String[] args) {

        //List nasil olusturulur?
        ArrayList<Integer> ages = new ArrayList<>();

        System.out.println(ages);// []

        //List'lere eleamn nasil eklenir?
        //List'e eleman eklemek icin add() method'unu kullaniriz
        //add() method'u elemanlari sizin verdiginiz sirada "list"e ekler (Insertion Order)
        ages.add(12);
        ages.add(9);
        ages.add(10);
        ages.add(888);

        ages.add(1,656);
        ages.add(3,777);
        System.out.println(ages);//[12, 656, 9, 777, 10, 888]

        //List' e coklu eleman nasil eklenir?
        //Bir "list" coklu eleman eklemek, o elemanlari once bir list'in icine koymalisiniz
        ArrayList<Integer> newAges = new ArrayList<>();
        newAges.add(8);
        newAges.add(9);
        newAges.add(10);

        ages.addAll(newAges);
        ages.addAll(2, newAges);
        System.out.println(ages);//[12, 656, 8, 9, 10, 9, 777, 10, 888, 8, 9, 10]

        //Bir list'teki tüm elemanlari nasil silebilirim?
 //       ages.clear();
 //       System.out.println(ages);// []

        //Bir elemanin list'te var olup olmadigini nasil kontrol ederiz?
        boolean r = ages.contains(656);
        System.out.println(r);

        //Bir list'in baska bir list ile ayni olup olmadigini nasil kontrol ederiz?
        //İki list'in esit olabilmesi icin ayni ibdex'de ayni elemanlar olmalidir.
        ArrayList<String> names1 = new ArrayList<>();
        names1.add("Tom");
        names1.add("Jim");
        names1.add("Kim");

        ArrayList<String> names2 = new ArrayList<>();
        names2.add("Tom");
        names2.add("Kim");
        names2.add("Jim");

        boolean s = names1.equals(names2);
        System.out.println(s);//false

        //Example 1: Verilen 2 iteger list'te tamamiyla ayni elemanlarin olup olmadigini
        //           kontrol eden kodu yaziniz.

        ArrayList<Integer>nums1 = new ArrayList<>();

        nums1.add(8);
        nums1.add(10);
        nums1.add(9);

        ArrayList<Integer>nums2 = new ArrayList<>();

        nums2.add(8);
        nums2.add(9);
        nums2.add(10);

        Collections.sort(nums1);
        Collections.sort(nums2);

        boolean t = nums1.equals(nums2 );
        System.out.println(t);







    }
}
