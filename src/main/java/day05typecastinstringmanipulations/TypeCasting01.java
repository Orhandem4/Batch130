package day05typecastinstringmanipulations;

public class TypeCasting01 {
    public static void main(String[] args) {

        /*
        Numeric primitive data type'larinin birbirine donusturulmesine "Type Casting" denir.
        Numreic(Sayisal) Data Type'lar bye - short - int - long - float - double


        Note 1: Kucuk data type'larini buyuk data type'larina çevirmeyi Java otomatik olarak yapabilir.
                Bu isleme "Autowidening"(Otomatik Genisletme) denir.

        Note 2: Buyuk data type'larini kucuk data type'larina cevirmek riskli istir. Java bu riskli isi otomatik olarak yapmaz.
                Bu islemi kod yazan'lar yapar.
                Bu islemi "ExplicitNarrowing"(Aciktan daraltma) denir.
         */


        //byte data type'ini int data type'ina ceviriniz

        byte age = 13;

        int ageInt = age;

        //long data type'ini short data type'ina cevirelim

        long weight = 234;

        short weightInt =(short)weight;//Explicit Narrowing

        //int data type'ini float data typeîna ceviriniz

        int siü = 345345;
        System.out.println(siü);

        float siüü2 = siü;
        System.out.println(siüü2);

        //double data type'ini short data type'ina ceviriniz

        double doub = 234.56;
        System.out.println(doub);//234.56

        short shortDoub = (short)doub;
        System.out.println(shortDoub);//234

        //Dikkat!
        //Donusum yaptiginiz sayi(260) donuseceginiz data type'inin sinirlari disinda ise, Java kullandiginiz sayi ile "mod" islemi
        //yapar ve mod isleminin sonucu sizin yeni degeriniz olur
        short  num = 260;
        System.out.println(num);//260

        byte numByte = (byte)num;
        System.out.println(numByte);//4

        //Example 2:

        int numInt = 1023;
        System.out.println(numInt);//1023

        byte nByte =(byte)numInt;
        System.out.println(nByte);//-1


    }
}
