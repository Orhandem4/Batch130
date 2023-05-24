package day06stringmanipulationsifstatement;

public class StringManipulations01 {

    public static void main(String[] args) {

        //Example 1: Bir strring'in baş ve sonunda space karakteri varsa siliniz.
        //             "   Ali CAN    "      ==>    "Ali Can "

        String s ="  Ali Can  ";
        System.out.println(s);

        //trim() method'u bir Strin'in bas ve sonundaki space character'lerini siler, aradaki space lere dokunmaz
        String sTrimmed = s.trim();
        System.out.println(sTrimmed);

        //Exapmle 2: Asagida fiyatlari verilen urunlerin toplam fiyatini bulunuz.
        //           String tv = "TL456.99";        String laptop = "TL875.99"; ==> 456.99 + 875.99 = 1332.98
        String tv1 = "T456.99";
        String laptop1 = "T875.99";

        String tv2 = tv1.replace("T","");
        System.out.println(tv2);

        String laptop2 = laptop1.replace("T","");
        System.out.println(laptop2);

        Double totalPrice = Double.valueOf(tv2) + Double.valueOf(laptop2);
        System.out.println(totalPrice);

        //Example 3: Verilen ismin ilk isminin ilk harfi ve sony imsinin ilk harfini ekrana yazdiriniz
        //           "Ali Can" ==> AC
        String name = "   ali cAN  ";

        char first = name.trim().toUpperCase().charAt(0);
        System.out.println(first);

        char second = name.trim().toUpperCase().split(" ")[1].charAt(0);
        System.out.println(second);

        System.out.println(""+first + second);

        //Example 4: Bir String'in character icermedigi (bos string) kontrol eden kodu yaziniz
        String str= "";

        //1. yol: lenght() kullan
        boolean resul1 = str.length()==0;
        System.out.println("String bos mu ? " + resul1);

        //2. yol: isEmpty() kullan. Java bir konuda method uretmisse o method'u kullanmak en iyisidir
        boolean result2 = str.isEmpty();
        System.out.println("String bos mu ? " + result2);

        //Example 5: Bir String'in space haric hicbir character icermedigini kontrol eden kodu yapiniz

        String t = "     ";

        //1.yol:
        boolean result3 = t.replace(" ","").length()==0;
        System.out.println("sadece space mi var? " + result3);

        //2.yol:
        boolean result4 = t.replace(" ","").isEmpty();
        System.out.println(result4);

        //3.yol:
        //isBlanK() methodu sadece space iceren String'ler icin true verir, space disinda bir character icerirse flase verir
        //isBlank() methodu bos String'ler icin de true verir
        //isBlank() ==> space + hicbirsey icin true           isEmpty ==> hisbirsey icin true
        boolean result5 = t.isBlank();
        System.out.println(result5);

        //example 6: Bir String'de a, i, e character'^lerinin  ilk görünümlerinin indexleri toplamini ekrana yazdiriniz
        //           "Java is easy to learn" ==> 1 + 5 + 8 = 14
        String r = "Java is easy to learn";

        int idxA = r.indexOf('a');
        System.out.println(idxA);//1

        int idxI = r.indexOf('i');
        System.out.println(idxI);//5

        int idxE = r.indexOf('e');
        System.out.println(idxE);//8

        System.out.println("Index'ler toplami:"+ (idxE+idxA+idxI));//Index'ler toplami:14

        //Example 7: Bir Strind'de "java" kelime'sinin ilk olarak kacinci index'de kullanildigini gosteren kodu yaziniz
        //       "Ah java vah Java sensiz olmuyor Java." ==> 3

        String u = "Ah java vah Java sensiz olmuyor Java.";

        //indexOf("Java") kullaniminda siz "Java" kelimesinin ilk gorunumundeki ilk harfi (yani J nin) index'ini almis olursunuz.
        int idxJava = u.indexOf("java");
        System.out.println(idxJava);

        //indexOf() method'u olmayan character'ler icin kullanilirsa her zaman "-1" verir
        int idxOfZyz = u.indexOf("xyz");
        System.out.println(idxOfZyz);

        //Example 8: Bir String'de a, i, e character'lerinin "son" görünümlerinin indexlerinin toplamini ekrana yazdiriniz.
        //                           "Java is easy to learn" ==> 18 + 5 + 17 = 40
        String v = "Java is easy to learn";

        int idxOfA = v.lastIndexOf('a');
        System.out.println(idxOfA);

        int idxOfI = v.lastIndexOf('i');
        System.out.println(idxOfI);

        int idxOfE = v.lastIndexOf('e');
        System.out.println(idxOfE);

        System.out.println(idxOfA + idxOfI + idxOfE);

        //Note: lastIndexOf() String olmayan bir character icin kullanilirsa her zaman "-1" verir

        //Example 9: Bir String'deki tekrarsiz character'leri ekrana yazdiriniz.
        //          abbccdc ==>  ad

        String y = "abc";

        char ch1 = y.charAt(0);

        if (y.indexOf(ch1)==y.lastIndexOf(ch1)){
            System.out.println(ch1);
        }

        char ch2 = y.charAt(1);
        if (y.indexOf(ch2)==y.lastIndexOf(ch2)){
            System.out.println(ch2);
        }

        char ch3 =y.charAt(2);
        if (y.indexOf(ch3)==y.lastIndexOf(ch3)){
            System.out.println(ch3);
        }

        //Note: Bazi kodlarinb bazi sartlara bagli olarak calismasi gerekir.
        //      Bazi kodlari bazi sartlara göre aktive etmek icin "if statemen" kullanilir
        //      if you study hard, you will learn Java.



        //Example 10: Sayi pozitif ise ekrana pozitif yazdirin
        int num = 12;

        if (num>0){
            System.out.println("Pozitif");
        }

        //Example 11: Sayi -1 ile 10 arasinda ekrana "rakam" yazdirin
        int number = 30;

        if (number> -1 && number<10){
            System.out.println("rakam");
        }

        //Example 12: Sayi uc basamakli ise "Woow!" yazddirin.

        int num1 = -100;

        num1 = Math.abs(num1);

        if (num1>10 && num1<1000){
            System.out.println("Wooow!");
        }

    }
}
