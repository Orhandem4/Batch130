package advanced_practice.practice03;

import java.util.Arrays;

public class Q04_MultiArray_AyniIndeksToplami {

    public static void main(String[] args) {


     /*
      Aşağıdaki multi dimensional array'lerin iç array'lerinde aynı indexe sahip elamanların
      toplamını yazdıran bir program yazın.
      arr1[]={{1,2},{3,4,5}{6}}
      arr2[]={{7,8,9},{10,11},{12}}
     */

        int arr1[][] = {{1,2},{3,4,5},{6}};
        int arr2[][] = {{7,8,9},{10,11},{12}};
        int toplam = 0;
        int limit = 0;

        for (int i= 0; i< arr1.length; i++){

            limit = arr1[i].length;

            if (limit > arr2[i].length){

                limit = arr2[i].length;

            }
            for (int j=0; j<limit; j++){

                toplam = arr1[i][j] + arr2[i][j];
                System.out.println(toplam);
            }

        }












    }
}
