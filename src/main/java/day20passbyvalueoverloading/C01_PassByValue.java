package day20passbyvalueoverloading;

public class C01_PassByValue {

    public static void main(String[] args) {

        /*
         Pass By Value. Method 'a Value'nun bir kopyasini gonder demektir
         Bu nedenle Pass by Value da orijinal parametre degismez.

         Java Pass By Value kullanir.
         1) Java variable'nin orijinal degerini korumak ister
         2) Java variable'nin icindeki degeri kopyalar ve methodun icine kopya degeri gonderir
         Deger uzerinde yapilan degisiklikler orijinal parametreyi etkilemez.

         Pass By Referance'da ise referans kopyalanir ve method da kullanilir
         Yapilan degisiklik orjinal parametrey etkiler.
         Bu tarz programlar degeri korumak istiyorsa isi developer'a birakmistir.
         Kendisi degeri degistirir

         */

        int gomlek = 100;
        System.out.println(gomlek);

        ogrenciIndirimi(gomlek);
        //System.out.println(gomlek);
        gomlek = ogrenciIndirimi(gomlek);
        System.out.println("yeni gomlek "+gomlek);





    }

    private static int ogrenciIndirimi(int gomlek) {
        int ogrenciGomlegi=gomlek-10;
        System.out.println(ogrenciGomlegi);
        return ogrenciGomlegi;
    }
}
