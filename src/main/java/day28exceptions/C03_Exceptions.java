package day28exceptions;

public class C03_Exceptions {

    /*
    3) ArrrayIndexOutOfBoundExceptions
     */
    /*

    1)"Exception" (istisnai hata) javada kodlarimizi
            calistirirken meydana gelen beklenmedik durumlardir.
    2) Exception lar ile calismanin iki yolu vardir
         a) try-catch block kullanma ve exception
            olussa bile calısmayı devam ettirme
         b) throw exception kullanarak calismayi
            durdurma (mesela yazdigimiz kod geregi bir
            dosya uzerinden okuma yapmamız
            gerekiyor ise bu dosyamız eger silinmis ise java dosyayi bulamaz ve
            application devam etmez)
    3) Eger exception'ı handle etmez isek (sorunu halletmezsek) java calismayi durdurur.
    4) try-catch kullanirken try kodunu bir yada birden fazla catch ile birlikte kullanabiliriz
    5) try ; catch olmadan tek basina kullanilamaz.
    6) Eger yazmis oldugunuz harhangi bir kod satirinda  problem olabiliecegini dusunuyorsaniz
       try-catch block icine koymalisiniz
    7) catch block parantezi icerisine olmasi muhtemel exception class ismi yazilir
    8) e.getmessage(), methodunu kullanarak teknik mesajlar elde edebiliriz.
       System.out.println(); burada yazmis oldugum mesajlar benim teknik olmayan aciklamalarimdir
       e.printStackTrace(); methodu Exception ile ilgili detaylica teknik mesaj verir. kod calismaya devam eder
       System.err.println("burasi renkli"); hata mesajini renkli olarak verir bu sayede cansolda diger mesajlardan ayırmak icin kullaniriz
    9) Eger try body icindeki kod sorunsuz calisirsa catch blok devreye girmez
  */

    //Bir String Arrayden verilen index'deki datayi donduren bir method olusturun

    public static void main(String[] args) {
        String arr[]={"Ali","Can","Tarik","Ayse"};

        getElementFromArray(arr,2);//positiveScenario
        getElementFromArray(arr,0);//Ali
        getElementFromArray(arr,4);



    }//main

    private static void getElementFromArray(String[] arr, int i) {

        try {
            System.out.println(arr[i]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array'in indexinde olmayan data istendi ==> "+e.getMessage());
            e.printStackTrace();
        }

    }//method

}//class