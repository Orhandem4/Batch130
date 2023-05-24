package day21overloadingstatic;

public class C02_Static {

    static int sayi1;// static variable
    int sayi2;// static olmayan variable = instance

    public static void main(String[] args) {

        System.out.println("sayi1 = " + sayi1);//0

        C02_Static obj1 = new C02_Static();

        System.out.println("sayi2 = "+obj1.sayi2);//0

        sayi1++;
        System.out.println("sayi1 = " + sayi1);

        obj1.sayi2++;
        System.out.println("obj1 = " + obj1.sayi2);

        C02_Static obj2 = new C02_Static();

        System.out.println("obj2 = "+obj2.sayi2);


    }
}
