package advanced_practice.practice05;

public class Q03_ForLoop_UcgenNumara {

    public static void main(String[] args) {

        /*
          Şekli Yazdırınız:
            1 2 3 4 5 6
             2 3 4 5 6
              3 4 5 6
               4 5 6
                5 6
                 6
         */

        for (int i=1; i<7; i++){

            for (int bosluk=1; bosluk<i; bosluk++){
                System.out.print(" ");
            }
            for (int j=i; j<7; j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
