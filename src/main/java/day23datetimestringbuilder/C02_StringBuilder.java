package day23datetimestringbuilder;

public class C02_StringBuilder {

    /*
    Java'da String, "String Class" kullanilarak veya "StringBuilder Class" kullanilarak olusturulabilir.
    "String Class" kullanrak urettiginiz String'ler "Immutable"(Degistirilemez) dir.
    "StringBuilder Class" kullanrak urettiginiz String'ler "Mutable"(Degistirilebilir) dir.
     */
    public static void main(String[] args) {
        //Immutable
        String s =  "Java";
        String t = s + "!";
        String w = t + "?";

        //String'i degistirdikten sonra ayni Stringe assign ederseniz, Java yine yeni bir container olusturur,
        //degismis gederi bu yeni container'in icine koyar ve eski container'i gösteren oki yeni container'a yonlendirir.
        //Dolayısıyla eski container adressiz kalir, "Garbage Collector" adressiz olan container'lari siler
        String a = "Money";
        a = a + " More";
        //Mutable
        //StringBuilder kullanrak String uretmenin 1.Yolu
        StringBuilder sb1 = new StringBuilder("Python");

        sb1.append("!").append("?").append(".");
        System.out.println(sb1);//Python!?.

        //StringBuilder kullanrak String uretmenin 2.Yolu
        StringBuilder sb2 = new StringBuilder();
        System.out.println(sb2.length());//0
        System.out.println(sb2.capacity());//16

        sb2.append("Java");
        System.out.println(sb2.length());//4
        System.out.println(sb2.capacity());//16

        sb2.append("xxxxxxxxxxxxxxx");
        System.out.println(sb2.length());//19
        System.out.println(sb2.capacity());//34 == 16*2+2 var olan kutu sayısının iki katının iki fazlası

        sb2.append("yyyyyyyyyyyyyyyy");
        System.out.println(sb2.length());//35
        System.out.println(sb2.capacity());//70



    }
}
