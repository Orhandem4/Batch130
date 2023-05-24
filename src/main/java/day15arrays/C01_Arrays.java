package day15arrays;

import java.util.Arrays;
import java.util.Scanner;

public class C01_Arrays {

    public static void main(String[] args) {

        //Bir öğretmenin okulundaki öğrencilerin isimlerini applicationa yuklemesini sağlayan kodu yazınız

        Scanner input = new Scanner(System.in);
        System.out.println("kaç öğrenci ismi gireceksiniz");
        int numOfStd = input.nextInt();
        String[] names = new String[numOfStd];

        System.out.println("cikmak istiyorsaniz lutfen Q harfine basiniz");
        for (int i = 1; i <= numOfStd ; i++) {
            System.out.println("lutfen "+i+". öğrencinin ismini giriniz");

            String stdName = input.next();
            if (stdName.equalsIgnoreCase("Q")){
                break;
            }
            names[i-1] = stdName;
        }
        System.out.println(Arrays.toString(names));

    }
}
