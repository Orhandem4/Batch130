package day19listsvarargs;

public class Varargs01 {

    /*
       Varargs'lar method olusturuken "parametre" sayısında bize esnekli saglar
       Method'un parantezleri icine yazilanlara "parametre" denir.
       Method'u cagirirken kullanilan sayilara da "argument" denir.

       Note: Bir method'da 1 den fazla varargs parametre kullanilamaz cunu ikincisi "Unreachable Code" olur.
       Note: "Varargs", Varargs disindaki parametlerelerle kullabılabilir ama "Varargs" her zaman "son parametre" olmalidir
     */

    public static void main(String[] args) {

        addTwoNumbers(3,5);

        addThreeNumbers(4,7,2);

        add(4,5,6,7,8,9,11);

    }

    //Ikı sayiyi toplayan method olusturunuz
    public static void addTwoNumbers (int a, int b) {
        System.out.println(a + b);
    }

    //Uc sayiyi toplayan method olusturunuz
    public static void addThreeNumbers(int a, int b, int c){
        System.out.println(a+b+c);
    }

    //Istediginiz sayida sayiyi toplamak icin bir method olusturunuz
    public static void add(int...a){

        int sum =0;

        for (int w : a){
            sum=sum + w;
        }
        System.out.println(sum);

    }








}
