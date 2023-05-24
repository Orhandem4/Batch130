package day15arrays;

public class C04_Arrays {

    public static void main(String[] args) {

        //bir array'in icinde  herhangi bir elemanın olup olmadığını kontrol eden
        // ve kaç kere tekrarlandığını gösteren kodu yaziniz

        int arr[] = {5,1,5,-3};

        int eleman = 5;
        int counter = 0;

        for (int w : arr) {

            if (w == eleman){
                counter++;
            }//if
        }//for

        if (counter>0){
            System.out.println(eleman + " arrayde " + counter + " defa var");
        }else {
            System.out.println(eleman + " arrayde yok");
        }












    }
}
