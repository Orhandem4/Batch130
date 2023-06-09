package day04memorykullanimwrapperclassascii;

import java.sql.SQLOutput;

public class C02_AsciiDegerleri {
    public static void main(String[] args) {

        /*
        ASCII= Amerikan Standart Kodlama Sistemi uluslararasi kabul gormus degerlerdir.
        Klavyemizde kullandigimiz harf ve sembollerin matematiksel karsiligi char data
        turunde isleme alinirsa o char degerinin Ascii Table'daki karsiligini isleme alir.
        Harf ve sembollere deger atar.
        karakterlerin cebirsel karsiligini bulmak icin ortaya cikmistir.Cunku bilgisayarda
        hersey 0 ve 1 den olusur.Bu yapiya cevirebilmek icin Ascii Table olusturulmustur.
        Buyuk harflerin Ascii degeri kucuk harflerin Ascii degerinden daha kucuktur.
         */

        //Bir  tamsayi ile bir harfi toplayiniz

        int deger= 20;
        char harf= 'a';

        //1. yol
        int sum = deger + harf; //20+97
        System.out.println("bir tam sayi ile harfin toplami="+sum);

        //2.yol
        System.out.println("2.yol toplam"+(deger+harf));//117

        char rakam1 = '1';
        System.out.println("rakam1 = " + rakam1);//1

        char rakam2 = '2';
        System.out.println("rakam2 = " + rakam2);//2

        char rakam3 = '3';
        System.out.println("rakam3 = " + rakam3);//3

        char rakam4 = '4';
        System.out.println("rakam4 = " + rakam4);//4

        System.out.println("rakam1+rakam2+rakam3+rakam4="+rakam1+rakam2+rakam3+rakam4);//1234

        System.out.println("rakam1+rakam2+rakam3+rakam4="+(rakam1+rakam2+rakam3+rakam4));//202

        char kh = 'a';
        char bh = 'A';
        System.out.println("a'nin Ascii degeri="+(kh+0));//97
        System.out.println("A'nin Ascii degeri="+(bh+0));//65

        System.out.println("kh > bh ==>"+(kh>bh));//Karsilastirma islemlerinin sonucu true yada false doner

        // Herhangi bir karakterin Ascii degerini Hesaplatalim

        //1.yol

        char space = ' ';
        System.out.println("space'in Ascii degeri="+(space+0));//32

        //2. yol
        int hrf = 'm';

        // Char data type'larinda Java karaktere int degerde atanabilir
        // Cunku char data type'inin bir resim degeri bir de
        // Ascii'den gelen int degeri vardir.
        // Bu sekilde de Ascii degerini bulabiliriz

        System.out.println("int harf'in Ascii degeri="+(hrf+0));

        /// ******** ASCII degerlerindden yararlanarak Karsilastirma Yapabiliriz ******** \\\

        byte b = 125;
        float f = 2.45648F;
        long l = 45634563345L;
        char ch = 'h';

        System.out.println(l>ch);//true
        System.out.println(b<f);//false
        System.out.println(b<ch);//false



















    }
}
