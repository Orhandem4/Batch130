package advanced_practice.practice01;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Q01_Variables_FahrenheitToCelcius {

    public static void main(String[] args) {

        // Fahrenheit değeri, Celsius değere çeviren kod yazınız.
        // formül: c = (f-32)*5/9

        Scanner input = new Scanner(System.in);
        System.out.println(" lutfen bir fahrenheit degeri giriniz");
        double fahren = input.nextDouble();

        double celsius = (fahren-32)*5/9;
        System.out.println("celsius ="+ celsius);

        //Ondalık kısmı belirli bir formata dönüştürmek icin:
        //1. yol: DecimalFormat class

        DecimalFormat decimalFormat = new DecimalFormat("0.00");
        String formattedCelsius = decimalFormat.format(celsius);
        System.out.println("formattedCelsius = " + formattedCelsius);

        //2. Yol: printf ile;
        // virgülden sonrasında kaç rakam yazıcağını belirler %.2f = "." dan sonra 2 basamak
        System.out.printf("printf ile: " + "%.2f",celsius);// %=> herhangi bir sayı, 2f=> iki basakmalı format


    }
}
