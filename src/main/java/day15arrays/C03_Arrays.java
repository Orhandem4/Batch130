package day15arrays;

import java.util.Arrays;

public class C03_Arrays {

    public static void main(String[] args) {

        //INTERWIEW QUESTIONS
        //[0,2,3,0,12,0]sifirlari sona atiniz [2,3,12,0,0,0]

        int orginal [] = {0,2,3,0,12,0};

        int yeni [] = new int[orginal.length];//[0,0,0,0,0,0]

        int idx = 0;

        for (int i = 0; i <orginal.length ; i++) {

            if (orginal[i]!=0){
                yeni[idx] = orginal[i];

                idx++;
            }
        }
        System.out.println(Arrays.toString(yeni));
    }
}
