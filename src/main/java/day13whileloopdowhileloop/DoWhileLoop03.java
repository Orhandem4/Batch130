package day13whileloopdowhileloop;

import java.util.Scanner;

public class DoWhileLoop03 {

    public static void main(String[] args) {

        /*
        Gecerli Username="admin" ve Password="pwd123" dur.
        kullanicidan username ve password'u alin.
        username ve password dogru ise console'a "hesabiniza hosgeldiniz!" yazdirin.
        username veya password yanlis ise 4 kere "User name ve password'unuzu giriniz" mesaji versin
        username veya password 4. kez yanlis girilirse "hesabiniz bloke olmustur " mesaji vererek islemi tamamlayiniz

         */

        Scanner input =new Scanner(System.in);

        int counter = 0;

        do {
            if (counter ==4){
                System.out.println("hesabiniz bloke olmustur!");
                break;
            }

            System.out.println("Usernam'i giriniz...");
            String username = input.next();

            System.out.println("Password'u giriniz...");
            String password = input.next();

            if (username.equals("admin") && password.equals("pwd123")) {
                System.out.println("Hesabiniza hosgeldiniz!");
                break;
            }
            counter++;
        }while (true);













    }
}
