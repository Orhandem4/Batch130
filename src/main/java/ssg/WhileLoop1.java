package ssg;

import java.util.Scanner;

public class WhileLoop1 {

    public static void main(String[] args) {

        // kullanicidan toplamak istedigi sayilari alin
        // ve kullanici 0'a basincaya kadar devam edin
        // kullanici 0'a bastiginda
        // girdigi tum sayilarin toplamini yazdirin

        Scanner input = new Scanner(System.in);
        
        int sayi = 1;
        int toplam = 0;
        int sayac = 0;

        while (sayi!=0){
            System.out.println("toplamak istediginiz sayilar giriniz");
            sayi = input.nextInt();
            toplam+=sayi;
            sayac++;
        }
        System.out.println((sayac-1) + " sayi girdiniz ve toplami = " + toplam);









    }
}
