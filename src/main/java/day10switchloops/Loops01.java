package day10switchloops;

public class Loops01 {

    public static void main(String[] args) {

        /*
        Code Standarts
        i)Tekrar(Repetition) olmamalidir.
        ii)Dynamic olmalidir.
        iii)Tamir(Fix) ve update kolay yapilabilmelidir.
         */

        //Example 1: Ekrana 5 kere "Hi" yazdiriniz

        //1.Yol: tavsiye edilmez
        System.out.println("Hi");
        System.out.println("Hi");
        System.out.println("Hi");
        System.out.println("Hi");
        System.out.println("Hi");

        //2.Yol:
        //Ayni adimlarr tekrar tekrar yapilmasi gerektiginde "loop" lar kullanilir
        //Dort tane loop var; i)for-loop ii)while-loop iii)do-while-loop iv)for-each-loop

        //i)for-loop
        // Baslangic degeri  loop'un calisma sarti    Increment/Decrement
        for (int i=1       ;    i<6                 ;    i++             ){
            System.out.println("Hi");
        }

        //Example 1: 11'den 44'e kadar tum tamsayilari ekrana yazdran kodu yaziniz

        for (int i=11; i<45; i++){
            System.out.println(i);
        }

        //Example 3: 40'dan 23'e kadar tum cift tamsayilari ekrana yazdiran kodu yaziniz
        for (int i=40; i>22; i--){
            if (i%2==0){
                System.out.println(i);
            }
        }

        //Example 4: 18'dan 56'e kadar tum tek tamsayilari ekrana yazdiran kodu yaziniz

        for (int i=18; i<57; i++){
            if (i%2!=0){
                System.out.print(i+" ");
            }
        }







    }
}
