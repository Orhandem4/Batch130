package orhan_deneme;

import java.util.Scanner;

public class Deneme5 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("bir kelime giriniz");
        String kelime = input.next();
        System.out.println("bir cumle giriniz");
        String cumle = input.nextLine();

        if (cumle.indexOf(kelime)>-1){

            if (cumle.indexOf(kelime) != cumle.lastIndexOf(kelime)){
                System.out.println("girilen kelime cumlede 1 den fazla kullanilmistir");
            }else if (cumle.indexOf(kelime) == cumle.lastIndexOf(kelime)){
                System.out.println("girilen kelime cümlede 1 kere kullanilmistir");
            }else if (cumle.indexOf(kelime)<0){
                System.out.println("girilen kelime cumlede kullanilmistir");
            }
        }


        Scanner scn = new Scanner(System.in);
        System.out.println("lutfen bir cumle ve bir kelime giriniz...");
        String s1 = input.nextLine();
        String s2 = input.next();
        String  result = s1.indexOf(s2)>-1 ? ((s1.indexOf(s2) == s1.lastIndexOf(s2)) ? "Girilen kelime cumlede 1 kere kullanilmis" : "Girilen kelime cumlede 1'den fazla kere kullanilmis") : "Girilen kelime cumlede kullanilmamis";




    }
}
