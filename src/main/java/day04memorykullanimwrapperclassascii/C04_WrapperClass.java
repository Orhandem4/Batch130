package day04memorykullanimwrapperclassascii;

public class C04_WrapperClass {
    public static void main(String[] args) {

        /*
        Non-Primitive data turleri sadece data barindirmak icin
        degil ayni zamanda methodlarda bulundurur
        Primitive data turleri ise sadece deger saklar.
        Java bu duruma bir cozum uretmistir.
        Her primitive data turunu Non-Primitive olarak
        kullanabilmek için ozel Class'lar olusturmustur.
        Oracle firmasinin urunu olan Java primiitivlere method
        ekleyerek olusturduklari bu yeni yapiya Wrapper
        Class adini vermistir.



            Primitive            Wrapper
              byte      ==>      Byte
              short     ==>      Short
              int       ==>      İnteger ***
              long      ==>      Long
              float     ==>      Float
              double    ==>      Double
              boolean   ==>      Boolean
              char      ==>      Character ***
         */

        byte primitiveByte = 12;//Primitive data type larinda nokta koydugumuzda hicbir method gelmez
        Byte wrapperByte = 12;//Wrapper classlarda nokta koydugumuzda bir cok method kullanabiliriz


        //Ex : byte data type'in en kucuk ve en buyuk degerinin ekrana yazdirin

        System.out.println(wrapperByte.MIN_VALUE);//-128
        System.out.println(wrapperByte.MAX_VALUE);//127

        //Ex ; short , int i long data type'larinin max ve min degerlerini hesaplatan kodu yaziniz

        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);

        System.out.println(Short.MAX_VALUE);
        System.out.println(Short.MIN_VALUE);

        System.out.println(Long.MAX_VALUE);
        System.out.println(Long.MIN_VALUE);

        //*********** Primitive'ler Wrapper Classlara Nasil Cevrilir (Autoboxing)*******

        float f1 = 13.99F;//kucuk kutu primitive

        Float wrapperF1 = f1;

        //*********** Wrapper class'lari primitive data tylarina nasil cevrilir? (Unboxing)*******

        Character w1 ='s';
        char primitiveW1 = w1;
        //Note ; Autoboxing  ve Unboxing Java tarafindan otomatik yapilir
        //Extra kod yazmaya gerek yoktur

        //Ex : Verilen iki String datanin toplamini veren kodu yaziniz

        String str1 = "12345";
        String str2 = "6789";
        System.out.println(str1+str2);//123456789 yan yana yazdirdi

        System.out.println(Integer.valueOf(str1)+Integer.valueOf(str2));
    }
}
