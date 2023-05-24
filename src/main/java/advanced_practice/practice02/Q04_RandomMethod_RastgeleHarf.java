package main.java.advanced_practice.practice02;

public class Q04_RandomMethod_RastgeleHarf {

    public static void main(String[] args) {

        /*
         Rastgele bir harf veren bir method oluşturun ve ardından methodu kullanarak aşağıdakileri yazdırınız.
         ‘A’ ve ‘a’ için “İlk Karakter” yazdırınız.
         ‘B’ ve ‘b’ için “İkinci Karakter” yazdırınız.
         ‘C’ ve ‘c’ için “Üçüncü Karakter” yazdırınız.
         ‘D’ ve ‘d’ için “Dördüncü Karakter” yazdırınız.
         Diğerleri için “Diğer Karakterleri” yazdırınız.
        */

        /*
        System.out.println(rastgeleHarf());

        String x = rastgeleHarf();
        do {

            x = rastgeleHarf();
            System.out.println(x);

        }while ((!x.equals("z")));

         */
      //  System.out.println((int)(Math.random()*101));

        String rastgeleHarf = rastgeleHarf().toLowerCase();

        switch (rastgeleHarf){
            case "a":
                System.out.println("ilk karakter");
                break;
            case "b":
                System.out.println("ikinci karakter");
                break;
            case "c":
                System.out.println("ucuncu karakter");
                break;
            case "d":
                System.out.println("dördüncü karakter");
                break;
            default:
                System.out.println("diğer karakterler");
        }

    }
    public static String rastgeleHarf(){
        String alfabe =  "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
        int maxIndex = alfabe.length();
        int rastgeleIndex = (int)(Math.random()*(maxIndex));

        return alfabe.substring(rastgeleIndex,rastgeleIndex+1);
    }

}
