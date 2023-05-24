package main.java.advanced_practice.practice07;

import java.util.Scanner;

public class Q02_TasKagitMakas {

    public static void main(String[] args) {

        /*
          Taş-Kağıt-Makas oyunu yazınız.
          -Oyuncudan tahmin alınız.
          -Bilgisayarın tahmini ile karşılaştırınız.
          -3'e ilk ulaşan kazanır
          -3 farkla kazanan Altın Skor, 2 farkla kazanan Gümüş Skor, 1 farkla kazanan Bronz Skor ile kazanır.
        */

        Scanner input = new Scanner(System.in);
        int oyuncuPuan = 0;
        int bilgisayarPuan = 0;
        int sayac = 0;

        while (oyuncuPuan<3 || bilgisayarPuan<3){
            sayac++;
            System.out.println(sayac+"Seçim: tas / kagit / makas");
            String oyuncuTahmini = input.next().toLowerCase().trim();

            if (!(oyuncuTahmini.equals("tas") || oyuncuTahmini.equals("kagit") || oyuncuTahmini.equals("makas"))){
                System.out.println("gecerli bir tahmin giriniz");
                sayac--;
                continue;
            }

            //Bilgisayarın tahmini
            String[] arrTasKagitMakas = {"tas","kagit", "makas"};
            int rastgeleIndx = (int)(Math.random()*3);
            String bilgisayarTahmini = arrTasKagitMakas[rastgeleIndx];
            System.out.println("bilgisayarTahmini = " + bilgisayarTahmini);

            if (oyuncuTahmini.equals(bilgisayarTahmini)){
                System.out.println("\nBerabere! Skor: "+oyuncuPuan+"=="+bilgisayarPuan);
            }else if (oyuncuTahmini.equals("tas") && bilgisayarTahmini.equals("makas") ||
                    oyuncuTahmini.equals("kagit") && bilgisayarTahmini.equals("tas") ||
                    oyuncuTahmini.equals("makas") && bilgisayarTahmini.equals("kagit")){
                oyuncuPuan++;
                System.out.println("\nKazandınız! Skor: "+oyuncuPuan+"=="+bilgisayarPuan);
            }else {
                bilgisayarPuan++;
                System.out.println("\nBilgisayar kazandı! Skor: "+oyuncuPuan+"=="+bilgisayarPuan);
            }

        }

        System.out.println("===Oyun Bitti===");

        String skor;
        if (oyuncuPuan == 3) {
            if (bilgisayarPuan == 0) {
                skor = "Altın";
            } else if (bilgisayarPuan == 1) {
                skor = "Gümüş";
            } else {
                skor = "Bronz";
            }
            System.out.println(skor + " skor ile kazandınız! TEBRİKLER!!!");
        } else {
            if (oyuncuPuan == 0) {
                skor = "Altın";
            } else if (oyuncuPuan == 1) {
                skor = "Gümüş";
            } else {
                skor = "Bronz";
            }
            System.out.println("Bilgisayar " + skor + " skorla kazandı!!!");
        }








    }
}
