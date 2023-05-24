package day05typecastinstringmanipulations;

public class StringManipulations02 {

    public static void main(String[] args) {

        String s = "Learn Java earn money";

        //Example 1: "s" String'inin "money" ile bitip bitmedigini kontrol ediniz.

        boolean sEnd = s.endsWith("money");
        System.out.println(sEnd);

        //Example 2: "s" String'indeki "money" ile kelimesini "dollar" kelimesine ceviriniz.

        String moneyToDollar = s.replace("money","dollar");
        System.out.println(moneyToDollar);//Learn Java earn dollar

        //Example 3: "s" String'indeki "earn" ile kelimesini "win" kelimesine ceviriniz.

        String earnToWin = s.replace("earn", "win");
        System.out.println(earnToWin);//Lwin Java win money

        //Example 4: "s" String'indeki "a" harflerini "*" a ceviriniz.
        //Note: replace() method'unda coklu character ile calisirsaniz mecbur cift tirnak kullanicaksniniz.
        // Ama tek character ile calisirsaniz cift tirnak veya tek tirnak kullanabilirsiniz.

        String s1 = s.replace('a','*');
        System.out.println(s1);//Le*rn J*v* e*rn money

        //Note: Ama ya ikisi de cift tirnak olmalidir, ya da ikisi de tek tirnak olmalidir.
        //Example 5: "s" String'indeki "n" harflerini "xxx" a ceviriniz.

        String s2 = s.replace("n","xxx");
        System.out.println(s2);//Learxxx Java earxxx moxxxey

        //Example 6: "s" String'indeki bütün "e" harflerini siliniz.
        //Note: "hicbir sey" char data type'inda yok bu yuzden replace method'u kullanarak silme islemi yaparsaniz mutlaka cift tirnak kullaniniz.

        String s3 = s.replace("e","" );
        System.out.println(s3);//Larn Java arn mony

        String t = "Ali 13 yasindadir!...";

        //Example 7: "t" String'deki tum rakamlari "*" ceviriniz.
        //Note: Bir grup data'yi degistirmek icin replaceAll() kullanilir.
        //Note: Bir grup data'yi ifade etmek icin ""(Regex) kullaniriz.

        String allChange = t.replaceAll("[0-9]","*");
        System.out.println(allChange);//Ali ** yasindadir!...

        /*
                      Meshur Regex'ler
        1) Tum rakamlar ==>[0-9]
        2) Tum kucuk harfler ==> [a-z]
        3) Tum buyuk harfler ==> [A-Z]
        4) Tum kucuk harfler ve buyuk harfler ==> [a-zA-Z]
        5) Tum harfler ve rakamlar ==> [a-zA-Z0-9]
        6) Tum noktalama isaretleri ==> \\p{Punct}
        7) Tum sesli harfler ==> [aeiouAEİOU]
           x, q, w harfleri ==> [xqw]

        8) kucuk harflerden farkli tum character'ler ==>[^a-z]
        9) tüm harflerden farkli tum character'ler ==>[^a-zA-Z]

        10) Space disindaki tüm character'ler ==> \\S
         */

        //Example 8: "t" String'indeki tum rakamlari ve harfleri "!" e ceviriniz.

        String t2 = t.replaceAll("[a-zA-Z0-9]","!");
        System.out.println(t2);//!!! !! !!!!!!!!!!!...

        //Example 9: "t" String'indeki tum sesli harfleri "?" e ceviriniz.

        String t3 = t.replaceAll("[aeiouAEİOU]","?");
        System.out.println(t3);//?l? 13 y?s?nd?d?r!...

        //Example 10: "t" String'indeki kucuk harfler disindaki tum character'leri "<>" ceviriniz.

        String t4 = t.replaceAll("[^a-z]","<>");
        System.out.println(t4);//<>li<><><><>yasindadir<><><><>

        //Example 11: "t" String'indeki tum harfler disindaki character'leri "+" ceviriniz.

        String t5 = t.replaceAll("[a-zA-Z]","+");
        System.out.println(t5);//+++ 13 ++++++++++!...

        //Example 12: "t" String'indeki space'ler disindaki tüm character'leri "$" ceviriniz.

        String t6 = t.replaceAll("[^ ]","TL");
        System.out.println(t6);//TLTLTL TLTL TLTLTLTLTLTLTLTLTLTLTLTLTLTL

        //Example 13: "t" String'indeki sesli harfler disindaki tüm character'leri "&" ceviriniz.

        String t7 = t.replaceAll("[^aeiouAEİOU]","&");
        System.out.println(t7);






























    }
}
