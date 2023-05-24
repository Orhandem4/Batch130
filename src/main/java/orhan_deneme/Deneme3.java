package orhan_deneme;

import java.util.Scanner;

public class Deneme3 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("lutfen istediginiz gunu yaziniz");
        String week =input.next();

        char ch1 = week.toUpperCase().charAt(0);
        char ch2 = week.toLowerCase().charAt(1);
        char ch3 = week.toLowerCase().charAt(2);

        if (week.equalsIgnoreCase("Pazartesi") ||
                week.equalsIgnoreCase("Sali") ||
                week.equalsIgnoreCase("Carsamba") ||
                week.equalsIgnoreCase("Persembe") ||
                week.equalsIgnoreCase("Cuma") ||
                week.equalsIgnoreCase("Cumartesi") ||
                week.equalsIgnoreCase("Pazar")){
            System.out.println("1."+ ch1 + "\n2."+ ch2 + "\n3."+ ch3);
        }else System.out.println("gecerli gun giriniz");


    }
}
