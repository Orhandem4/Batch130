package advanced_practice.practice01;

import java.util.Scanner;

public class Q02_Variables_Hipotenus {

    public static void main(String[] args) {

        //hipotenus hesaplayan bir kod yazınız

        Scanner input = new Scanner(System.in);
        System.out.println("1. dik kenar uzunluğunu giriniz");
        double a = input.nextDouble();
        System.out.println("2. dik kenar uzunluğunu giriniz");
        double b = input.nextDouble();

        double c = Math.sqrt(a*a + b*b);
        System.out.println("hipotenus: "+c);
        System.out.printf("%.2f",c);

    }
}
