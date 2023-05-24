package day07ifstatement;

import java.util.Scanner;

public class C04_IfStatement {

    public static void main(String[] args) {

        /*kullanicidan yas degerini alan ve yasin hangi evrede oldugunu
        0-4 ==> bebek
        5-12 ==> cocuk
        13-20 ==> genc
        21-30 ==> yetiskin
        Tanimlanmamis Evre
        Hata mesaji olarak "Gecerli bir yas giriniz" yazdiriniz
         */

        Scanner input = new Scanner(System.in);
        System.out.println("lütfen yasinizi giriniz");
        byte age = input.nextByte();

        if (age>-1 && age<5){
            System.out.println("bebek");
        }else if (age>4 && age <13){
            System.out.println("cocuk");
        }else if (age>11 && age <21){
            System.out.println("genc");
        }else if (age>19 && age <31){
            System.out.println("yetiskin");
        }else if (age>30){
            System.out.println("tanımlanmamis evre");
        }else {
            System.out.println("lütfen gecerli bir yas giriniz");
        }

















    }
}
