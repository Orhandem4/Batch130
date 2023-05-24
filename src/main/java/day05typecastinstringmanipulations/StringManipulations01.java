package day05typecastinstringmanipulations;

public class StringManipulations01 {

    //String bir non- primitive data type'dir ve ayni zamanda bir class'dir

    public static void main(String[] args) {

        String s = "Java is easy";

        //Example 1: "s" String'indeki tum character'leri buyuk harf yapiniz.
        String sUpper = s.toUpperCase();
        System.out.println(sUpper);//JAVA IS EASY

        //Example 2: "s" String'indeki tum character'leri kucuk harf yapiniz.
        String sLower = s.toLowerCase();
        System.out.println(sLower);//java is easy

        //Example 3: "s" String'indeki ilk character'i aliniz.
        char firstChar = s.charAt(0);
        System.out.println(firstChar);//J

        //Example 4: "s" String'indeki ikinci ve sonundan ikinici character'i aliniz ve ekrana yanyana yazdiriniz.

        char secondChar = s.charAt(1);//a
        char lastSChar = s.charAt(10);//s

        //1.Yol: Ayni satirda yazdirmak icin
        System.out.print(secondChar);
        System.out.println(lastSChar);

        //2.Yol: Ayni satirda yazdirmak icin
        System.out.println(""+secondChar + lastSChar);

        //Example 5: "s" String'inde kullanilan character sayisini bulunuz.
        int sLenght = s.length();
        System.out.println(sLenght);//12

        //Example 6: "s" String'indeki ilk 4 characteri aliniz.

        //substring(0, 4) ==> "0" yani ilk index dahil, "4" yani ikinci index haric dir.
        String firstFour = s.substring(0, 4);
        System.out.println(firstFour);

        //Example 7: "s" String'indeki "is" kelimesini aliniz.
        String sIs = s.substring(5,7);
        System.out.println(sIs);

        //Example 8: "s" String'indeki "easy" kelimesini aliniz.
        String eIs = s.substring(8, 12);
        System.out.println(eIs);

        //Bir character'den baslayip String'in sonuna kadar almak isterseniz, ikinci index'i yazmayiniz
        //s.substring(8, 12); yerine s.substring(8); yaziniz
        String sub1 = s.substring(8);
        System.out.println(sub1);

        //Example 9: "s" String'indeki "money " kelimesini var olup olmadigini kontrol ediniz.
        boolean mBool1 = s.contains("money");
        System.out.println(mBool1);

        boolean mBool2 = s.contains("easy");
        System.out.println(mBool2);

        /*
        Bir method'u ogrenirken 3 sey mutlaka ogrenin;
        i)Bu method ne ise yapar?
        ii)Bu method'un farkli kullanimlari nasildir?
        iii)Bu method size ne return eder?
         */

        //Example 10: "s" String'inin belli bir harfle baslayip baslamadigini kontrol ediniz.
        boolean isStart = s.startsWith("Java");
        System.out.println(isStart);

        //Example 11: "s" String'inin 6. characterden itibaren belli bir harfle baslayip baslamadiginizi kontrol ediniz.
        boolean sWith = s.startsWith("i", 5);
        System.out.println(sWith);

























    }
}
