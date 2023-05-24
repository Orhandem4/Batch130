package day12forloopwhileloop;

public class ForLoop05 {

    public static void main(String[] args) {

        //Hic sayi kullanmadan 1 den 100 e kadaar olan sayilari konsola yazdiriniz

        for (int i='d'/'d' ; i<='d' ; i++){
            System.out.print(i + " ");
        }

        //Note: Bazi loop'lar hic calismayabilir
        for (int i=1 ; i<0 ; i--){
           System.out.println("Hi!");//Zero execution
        }

        //Note 2: Bazi loop'lar sonsuz defa calisabilir
        //        Bu tarz loop'lara "Infinite (Sonsuz) Loop" denir
        //        "Infinit (Sonsuz) Loop" genellikle "increment/decrement" kisminda yapilan hatadan kaynaklanir.
        for (int i=1 ; i<10 ; i--){
            System.out.println("Java is money...");
        }

        //Note 3: baska bir "infinite (sonsuz) loop"
        //        Loop olusturdugunuzda "ikinci kismi" yazmazsaniz "infinite (sonsuz) loop" olur
        for(int i=1;  ; i++  ){
            System.out.println("Hi!");
        }












    }
}
