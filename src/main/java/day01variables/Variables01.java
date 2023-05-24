package day01variables;

public class Variables01 {

    public static void main(String[] args) {

        //Variable oluşturmak
        //Java cumlesi = Statement
        //Java'da esittir demek "==". Yani Matematik'de "=" , Java'da "=="
        //Java'da "=" "assigment operator" dir. Sagdaki degeri alir soldaki kutuya koyar
        //Access Modifier yazmazsaniz "access modifier" "default" demektir
        //Data Type+ Variable Name ==> Variable Declaration
        //Assigment Operator(Atama Operatoru) + Variable degeri ==> Assigment
        //Eger Variable Declaration yapar, Assigment yapmazsaniz Java kendi degerlerini (default) koyar.
        //Default deerler sayilar icin sifirdir.
        //Data Type'ini yaziniz     Variable ismini yaziniz     Assigment Operator(Atama Operatoru)       Veriable degeri        İngilizce'deki nokta gibi
                 int                        age                         =                                        13                        ;

        //Ornek 1: Ogrenci ismi icin variable olusturup deger olarak Ali Can atayiniz.
        //String'lere verline degerler cift tirnak icinde olmalidir.
        //String'ler icin "default value" "null" dir.
        String studentName = "Ali Can";

        /*
            Java'da iki tip data vardir;
            1)primitive data type:
                 char : Tek karakterler için kullanilir. A, x, ?, 5,(5 tek olduğu için ister int ister char)
                 boolean: boolean'lar sadece iki farkli deger alabilir; true(dgru veya false(yanlis)(1 bit)
                 byte: -128 den +127 e kadar tamsayi degerleri icin kullanilir (1 byte)
                 short: -32768 ile +32767 arasindaki tamsayilar icin kullanilir (2 byte)
                 int: -2,147,484,648 ile 2,147,484,647 arasindaki sayilar icindir (4 byte)
                 long: -9,223,372,036,854,775,808 ile 9,223,372,036,854,775,807 arasindaki sayilar icindir (8byte)
                 float:
                 double:
            2)non-primitive data type

        */

        //Ornek 2: char data type'inda ilk ismin harfi olarak variable olusturunuz ve bir deger atayiniz
        char isminIlkHarf = 'O';

        //Ornek 3: boolean data type'inde emeklimisin icin bir variable olusturun ve false degerini atayin
        boolean emeklimisin = false;

        //Ornek 4: byte data type'inda ogrenci yasi icin bir variable olusturunuz ve deger atayiniz.
        byte studentAge = 23;

        //Ornek 5: Site nufusu icin bir variable olusturup deger atayiniz
        short siteNufusu = 1200;

        //Ornek 6: Ulke nufuslari icin bir variable olusturup deger ataması yapiniz
        int cuntryPopulation = 1864184648;

        //Ornek 7: İnsan vucudundaki hucre sayisi icin variable olusturup deger atamasi yapiniz.
        //Note: Bir deger long ise sonuna "L" veya "l" konulur
        long cellNumberInHumanBody = 87654321356788L;

        //Eger long'a atadiginiz deger int'lerin araligina ise sonuna "L" koymaya gerek yok
        long weightOfSun = 1234567;

        boolean orhanGotOffer = true;

        char firstLetterOfLastName = 'd';











    }
}
