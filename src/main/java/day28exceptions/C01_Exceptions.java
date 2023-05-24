package day28exceptions;

public class C01_Exceptions {

    //compile Time Error == Kodlarin yazim asamasinda olusan hatalardir
    // Run Time Error == Kodlari calistirdiktan sonra olusan hata tipi

    public static void main(String[] args) {

        /*
        1) NumberFormatException
         */

        //Bir String'i alip int'a ceviren kodu yaziniz

        String str = "123";

        int result = convertStringToInteger(str);//Stringi integer'a cevir
        System.out.println(result+5);

        String st = "123a";//negative scenario
        int result2 = convertStringToInteger(st);
        System.out.println(result2+10);

    }

    private static int convertStringToInteger(String str) {
        //ctrl + alt + t
        int i = 0;

        try {
            i = Integer.valueOf(str);
            System.out.println("burasi try Bolumu");
        } catch (NumberFormatException e) {
            System.out.println("Rakama olmayan karakter içeren String'ler Integer'a cevrilemez ");
        }
        return i;
    }
}
