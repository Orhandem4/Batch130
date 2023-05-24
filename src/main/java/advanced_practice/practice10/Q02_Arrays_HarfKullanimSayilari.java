package advanced_practice.practice10;

public class Q02_Arrays_HarfKullanimSayilari {

    /*
      Girilen String'de hangi harfin kaç kere kullanıldığını yazan bir kod yazınız.
      Input: String str = "Java is so Good";
      Output: String strOutput = "J1 a2 v1 i1 s2 o3 G1 d1";
   */

    public static void main(String[] args) {

        String str = "Java is so Good";
        String[] arr = str.split("");

        int kullanim;
        String sonuc ="";

        for (String w : arr) {
            kullanim = 0;
            for (String s : arr){

                if (w.equals(s)){
                    kullanim++;
                }
            }
            if (!sonuc.contains(w)){
                sonuc+=w+kullanim+" ";
            }
        }
        System.out.println(sonuc);

    }
}
