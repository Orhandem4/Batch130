package main.java.advanced_practice.practice07;

public class Q03_Static_Sirket {

        //Basit bir şirket bütçesi kodu yazınız.
        public static void main(String[] args) {
            sirket dep1 = new sirket();
            dep1.kasadanButceyeParaAl(1000);
            dep1.paraKazan(5000);
            System.out.println("dep1.depButcesi = " + dep1.depButcesi);
            System.out.println("Sirket.kasa = " + sirket.kasa);

            dep1.kasadanParaHarca(2500);
            System.out.println("Sirket.kasa = " + sirket.kasa);
            System.out.println("dep1.kasa = " + dep1.kasa);

            dep1.departmanHarcamasi(1000);
            System.out.println("dep1.depButcesi = " + dep1.depButcesi);
            System.out.println("Sirket.kasa = " + sirket.kasa);

            sirket dep2 = new sirket();
            dep2.kasadanButceyeParaAl(1000);
            dep2.kasadanButceyeParaAl(100);
            System.out.println("dep2.depButcesi = " + dep2.depButcesi);
            System.out.println("Sirket.kasa = " + sirket.kasa);
            System.out.println("dep1.depButcesi = " + dep1.depButcesi);//?

        }
}
