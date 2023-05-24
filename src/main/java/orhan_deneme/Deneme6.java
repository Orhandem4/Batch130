package orhan_deneme;

import java.util.Scanner;

public class Deneme6 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("lutfen bir karakter giriniz");
        char tek =input.next().charAt(0);

        boolean letter = tek>= 'a'&& tek<='z' || tek>='A' && tek<='Z';

        String result = letter ? "girilen character harf " : "girilen character hard degil...";

        System.out.println(result);

        if (tek>= 'a'&& tek<='z' || tek>='A' && tek<='Z'){
            System.out.println("karakteriniz bir harftir");
        }else{
            System.out.println("karakteriniz bir harf degildir");
        }

        Scanner scan = new Scanner(System.in);
        System.out.println("notunuzu giriniz");
        byte not = scan.nextByte();

        if (not<50 && not>-1){
            System.out.println("D");
        }else if (not>49 && not<60){
            System.out.println("C");
        }else if (not>59 && not<81) {
            System.out.println("B");
        }else if (not>79 && not<101){
            System.out.println("A");
        }else {
            System.out.println("gecerli bir not giriniz");
        }








    }
}
