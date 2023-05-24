package day11forLoop;

public class ForLoop04 {

    public static void main(String[] args) {

        //Example 1: 5'den 8'e kadar tam sayilarin toplamini veren kodu yaziniz.
        //           5 + 6 + 7 + 8 ==> 26

        int sum = 0;

        for (int i=5 ; i<9 ; i++ ){

            sum = sum + i;
        }
        System.out.println(sum);

        int sum2 = 1;

        for (int i=7 ; i<10 ; i++){
            sum2 = sum2 * i;
        }
        System.out.println(sum2);







    }
}
