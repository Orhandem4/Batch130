package main.java.advanced_practice.practice07;

public class Q04_Constructor_Market {

    //Ürün adı, ürün fiyatı ve (varsa) son kullanma tarihlerini yazdıran bir market programı yazınız.
    //Birim fiyatı 99 lira üzeri olan ürünlere %10 vergi indirimi uygulayınız.

    public static void main(String[] args) {

        Market obj1 = new Market("Çikolata", 20,6);
        System.out.println(obj1);

        Market obj2 = new Market("peynir", 100,3);
        System.out.println(obj2);

        Market obj3 = new Market("Deterjan", 200);
        System.out.println(obj3);

        Market obj4 = new Market();
        System.out.println("obj4 = " + obj4);
    }
}
