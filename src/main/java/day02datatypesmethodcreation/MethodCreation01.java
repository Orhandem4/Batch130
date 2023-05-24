package day02datatypesmethodcreation;

public class MethodCreation01 {

    /*
             Java'da method nasil olusturulur?

             1)main method'un disinda olusturulur
             2)Access Modifier + Return Type + Method Ismi + () + {}

             Olusturulan method'lar nasil kullanilir?
             1)main method'un icinden kullanilir
             2)method'un ismini yazin
             3)islem yapacaginiz sayilari parantezin icine koyun
     */

    public static void main(String[] args) {

        int sonuc = add(30,50);
        System.out.println(sonuc);

        long carpmaSonucu = multiply(3,6);
        System.out.println(carpmaSonucu);

        int ucluSonuc = carpmaToplama(10,5,3);
        System.out.println(ucluSonuc);

        double cube = getCube(5);
        System.out.println(cube);

        int dAlan = rectangularArea(5,15);
        System.out.println(dAlan);

        long dCevre = rectangleCircumference(10,10);
        System.out.println(dCevre);

        double daireAlan = areaOfTheCircle(3.14, 5);
        System.out.println(daireAlan);

        double daireCevre = daire(3.14,5);
        System.out.println(daireCevre);

        double mAlan = dikDortgenAlan(5,10);
        System.out.println(mAlan);

        long math = mathProblem(11, 12, 44, 56);
        System.out.println(math);

        System.out.println("orhan");
        System.out.println("demir");
        System.out.println("18");
        System.out.println('b'> 'B');
        System.out.print("orhan");
        System.out.println("demir");

    }

    public static int add(int a, int b){

        return a+b;
    }

    protected static long multiply(int a, int b){
        return a*b;

    }

    //Ornek 1: Verilen 3 sayidan ilk ikisini carpan ve sonucu ucuncu sayi ile toplana method'u olusturunuz ve kullaniniz

    private static int carpmaToplama(int a, int b,int c){
        return a*b+c;

    }

    //Ornek 2: Verilen bir ondalik sayinin kupunu hesaplayan methodu olusturup kullaniniz.
    //Note: Access Modifier'i default yapmak access modifier'i yazmayiniz

    static double getCube(double a){
        return a*a*a;
    }

    //1)Dikdortgenin alanini hesaplayan methodu olusturunuz ve kullaniniz
    //2)Dikdortgenin cevresini hesaplayan methodu olusturunuz ve kullaniniz
    //3)Dairenin cevresini hesaplayan methodu olusturunuz ve kullaniniz
    //4)Dairenin alanini hesaplayan methodu olusturunuz ve kullaniniz

    private static int rectangularArea(int a, int b){
        return a*b;
    }

    protected static long rectangleCircumference(int a,int b){
        return 2*(a+b);
    }

    static  double areaOfTheCircle(double π,double r){
        return π*r*r;

    }

    public static double daire(double π, double r){
        return 2*π*r;

    }

    public static double dikDortgenAlan(double a, double b){
        return a*b;
    }

    private static long mathProblem(int x, int a, int y, int z){
        return (x*a)/2+(y+z);
    }


}
