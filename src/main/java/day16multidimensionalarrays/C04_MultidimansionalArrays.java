package day16multidimensionalarrays;

public class C04_MultidimansionalArrays {

    public static void main(String[] args) {

        //Bir multidimansional array deki
        //en buyuk ve en kucuk elemanin
        //toplamini veren kodu yaziniz

        int arr[][] = {{2, 5, 1}, {83, 75}};

        int maxElement  = arr[0][0];
        int minElement  = arr[0][0];

        for (int[] w : arr) {

            for (int s : w) {

                maxElement=Math.max(maxElement,s);
                minElement=Math.min(minElement,s);

            }
        }
        System.out.println("maxElement = " + maxElement);//83
        System.out.println("minElement = " + minElement);//1
        System.out.println("toplam = " + (maxElement+minElement));//84





    }
}
