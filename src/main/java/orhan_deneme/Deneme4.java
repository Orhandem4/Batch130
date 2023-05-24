package orhan_deneme;

import java.util.Scanner;

public class Deneme4 {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        System.out.println(" iki sayi giriniz");
        int numb1 = scn.nextInt();
        int numb2 = scn.nextInt();

        if (numb1>0 && numb2>0){
            System.out.println("sayilarin toplami=" + (numb1 + numb2));
        }else if (numb1<0 && numb2<0){
            System.out.println("çarpımı="+ (numb1 * numb2));
        }else if ((numb1<0 && numb2>0) || (numb1>0 && numb2<0)){
            System.out.println("farklı isaretlerde sayilarla islem yaplilamaz");
        }else if (numb1==0 || numb2==0){
            System.out.println("sıfır carpmaya gore yutan elemandir");
        }
    }
}
