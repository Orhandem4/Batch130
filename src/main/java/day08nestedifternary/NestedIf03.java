package day08nestedifternary;

import java.util.Scanner;

public class NestedIf03 {

    public static void main(String[] args) {

        /*
            Password'un ilk harfi buyuk harf ise
            'A' olursa gecerli password yazdirin degilse gecersiz password yazdirin
            Alemci ==> Gecerli

            Passwordun ilk harfi kucuk harf ise
            'z' olursa gecerli passworde yazdirin degilse gecersiz password yazdirin
            zehirli ==> Gecerli
        */

        Scanner input = new Scanner(System.in);
        System.out.println("password'unuzu giriniz...");
        String pwd = input.nextLine();

        if (pwd.charAt(0)>='A' && pwd.charAt(0)<='Z'){

            if (pwd.charAt(0)=='A'){
                System.out.println("Gecerli password");
            }else{
                System.out.println("gecersiz Password buyuk harf ama 'A' degil...");
            }
        }else if (pwd.charAt(0)>='a' && pwd.charAt(0)<='z'){

            if (pwd.charAt(0)=='z'){
                System.out.println("gecerli password");
            }else{
                System.out.println("gecersiz password kucuk harf ama 'z' degil...");
            }
        }else{
            System.out.println("Ilk character harf olmali");
        }







    }
}
