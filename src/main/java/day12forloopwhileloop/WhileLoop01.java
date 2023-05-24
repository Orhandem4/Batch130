package day12forloopwhileloop;

public class WhileLoop01 {

    public static void main(String[] args) {

        //Example 1: 3'den 10'a kadar tamsayilari console'a yazdiriniz

        //1.Yol: for-loop
        for (int i=3 ; i<11 ; i++){
            System.out.print(i + " ");
        }

        System.out.println();

        //2.Yol: while -loop
        int i=3;

        while (i<11) {

            System.out.print(i + " ");

            i++;
        }

        System.out.println();

        //Example 2: 23'den 12' ye kadar cift tamsayilari console'a yazdiriniz

        int a= 23;

        while (a>11){

            if (a%2==0){
                System.out.print(a+" ");
            }
            a--;
        }

        System.out.println();

        //Example 3: Verilen bir tamsayinin ramaklari toplamini console'a yazdiran kodu yaziniz

        //1.yol: while-loop
        int sum = 0;
        int say = 578;

        while (say>0){

            sum+= say%10;

            say/=10;
        }
        System.out.println(sum);

        //2.Yol: for-loop
        int b = 684;
        int c = 0;

        for (int j = b ; j>0 ; j/=10){

            c = c + j%10;
        }
        System.out.println(c);//18














    }
}
