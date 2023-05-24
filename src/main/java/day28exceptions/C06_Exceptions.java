package day28exceptions;

public class C06_Exceptions {

    public static void main(String[] args) {

        //String'i Integer'a ceviriniz; Integer'i character sayisina bölünüz

        divideString(null);
    }

    private static double divideString(String str) {

        int uzunluk = str.length();//nullpointerException hatsi
        int uzunluk2 = str.length();//numberFormatException
        int uzunluk3 = str.length();//AritmetikException

        int i = 0;
        double sonuc = 0;
        uzunluk = str.length();
        i = Integer.valueOf(str);
        sonuc = i / uzunluk;
        return sonuc;
    }
}
