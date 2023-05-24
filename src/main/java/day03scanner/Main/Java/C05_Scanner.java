package day03scanner.Main.Java;

import java.util.Scanner;

public class C05_Scanner {
    public static void main(String[] args) {


        //Kullanicidan bir dikdortgenin en ve boyunu alan ve hesaplaya kodu yaziniz
        //dikdortgenin Alani =en*boy
        //dikdortgenin cevresi = 2*(en+boy)

        Scanner input = new Scanner(System.in);

        System.out.println("lütfen dikdortgenin kısa kenarını giriniz...");
        int en = input.nextInt();

        System.out.println("lütfen dikdortgenin uzun kenarını giriniz...");
        int boy = input.nextInt();

        System.out.println("dikdortgenin alanı="+(en*boy));
        System.out.println("dikdortgenin çevresi="+2*(en*boy));




    }
}
