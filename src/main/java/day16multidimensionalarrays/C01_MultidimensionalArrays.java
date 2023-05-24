package day16multidimensionalarrays;

import java.util.Arrays;

public class C01_MultidimensionalArrays {

    public static void main(String[] args) {

        /*
        Bir Array'in icindeki data yine bir Array ise buna miltidimensionla Array denir
         */

        //Multidimensionbal arrayler nasıl olusturulur?

        int arr[][]= new int[3][2];//auter array==> 3
        //inner arrey ==> 2 olan bir multidimensional array olusturduk
        //bu yontemle inner arrayler sabit olmak zorunda
        System.out.println(Arrays.toString(arr));//[[I@19dfb72a, [I@17c68925, [I@7e0ea639]
        //Icindeki data non-primitive oldugu icin adresleri gorurum
        System.out.println(Arrays.toString(arr[1]));//[0, 0]
        System.out.println(Arrays.toString(arr[2]));//[0, 0]
        System.out.println(Arrays.deepToString(arr));// MULTIDIMENSIONAL ARREYLER BU SEKILDE YAZDIRILIR
        // [[0, 0], [0, 0], [0, 0]]

        //Arraylere eleman eklemenin 2. yontemi ile
        //hem declare edip hemde deger atama yontemi
        int arr2 [][] = {{2,3},{9},{78,6,4,5}};
        System.out.println("Hem declare hemde deger atamasi ile "+ Arrays.deepToString(arr2));//[[2, 3], [9], [78, 6, 4, 5]]
        System.out.println("Hem declare hemde deger atamasi ile 2.index "+ Arrays.toString(arr2[2]));//[78, 6, 4, 5]
        System.out.println("Hem declare hemde deger atamasi ile 1.index "+ Arrays.toString(arr2[1]));//[9]
        System.out.println("Hem declare hemde deger atamasi ile 0.index "+ Arrays.toString(arr2[0]));//[2, 3]

        //Multidimensional arraylere eleman nasil eklenir?

        arr[0][0] = 3;
        arr[0][1] = -4;
        arr[1][0] = 6;
        arr[1][1] = 18;
        arr[2][0] = -7;
        arr[2][1] = 0;
        System.out.println(Arrays.deepToString(arr));//[[3, -4], [6, 18], [-7, 0]]
        System.out.println(Arrays.toString(arr[1]));//[6, 18]
        System.out.println((arr[1][0]));//6

        //Ex ; String bir multidimensional Array olusturun
        //icersiinde datalarini ekleyin
        //toplam eleman sayisini ekrana yazdirin

        String brr[][] = new String[3][2];

        brr[0][0] ="a";//kat 1 daire 1
        brr[0][1] ="b";//kat 1 daire 2

        brr[1][0] ="c";//kat 2 daire 1
        brr[1][1] ="d";//kat 2 daire 2

        brr[2][0] ="e";//kat 3 daire 1
        brr[2][1] ="f";//kat 3 daire 2
        System.out.println(Arrays.deepToString(brr));//[[a, b], [c, d], [e, f]]

        int sum = 0;//toplam kac daire oldugu bilgisi burada

        for (String[] w : brr) {// w=each(her bir)
            sum = sum+ w.length;

        }//for
        System.out.println(sum);
















    }
}
