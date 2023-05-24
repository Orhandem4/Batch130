package advanced_practice.practice10;

import java.util.Scanner;

public class Q03_Exception_NotOrtalama {

    /*
    vize ve final notlarını alarak ortalama hesaplayan bir kod yazınız
    int v = vize
    int f = final
    Eğer  vize 100 den büyük, veya final 100'den büyük, veya vize 0'dan küçük, veya final 0'dan küçük ise,
    Sistem ArithmeticException hatası versin ve "Notlar 0-100 arasında olmalı" mesajını döndürsün.
    Diğer durumlarda ise,
    vizenin yüzde 40 ını, finalin yüzde 60 ını alsın ve toplasın.
    Ortalama 70'in üzerinde ise "Başarılı" altında ise "Başarısız" yazdırsın
     */

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int vizeNot;
        int finalNot;

        while (true) {
            try {
                System.out.println("vize notunu giriniz");
                vizeNot = input.nextInt();
                if (vizeNot<0 || vizeNot>100){
                    throw new ArithmeticException();
                }else {
                    break;
                }
            }catch (ArithmeticException e){
                System.out.println("Notlar 0-100 arasında olmalıdır");
            }catch (Exception e){
                System.out.println("geçersiz bir giriş yaptınız");
                input.next();
            }
        }
        while (true) {
            try {
                System.out.println("final notunu giriniz");
                finalNot = input.nextInt();
                if (finalNot<0 || finalNot>100){
                    throw new ArithmeticException();
                }else {
                    break;
                }
            }catch (ArithmeticException e){
                System.out.println("Notlar 0-100 arasında olmalıdır");
            }catch (Exception e){
                System.out.println("geçersiz bir giriş yaptınız");
                input.next();
            }
        }


        double ortalama = vizeNot*40/100+finalNot*60/100;

        if (ortalama>69){
            System.out.println("başarılı");
        }else {
            System.out.println("başarısız");
        }

    }
}
