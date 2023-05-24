package day21overloadingstatic;

public class C01_Overloading {


    /*
       1)Method isimleri aynı olmalıdır
       2)Method parametreleri farklı olmalıdır.
           i)Parametre sayıları değiştirilebilir.
           ii)Parametrelerin data tiplerini değiştirebilirsiniz.
           iii)Parametrelerin yerlini değiştirebilirsiniz fakat ancak data tileri farklı ise.
       3)Method ismi + Parametreler = Method Signature olusturur.
       imza sizi diğerlerinden ayirir
       Method Signature dışında ne değiştirirseniz değiştirin
       Java o methodları farklı kabul etmez.
       Java secilmesi gereken methodu göstermek için renklendirir
       */

    public static void main(String[] args) {

         toplama(3,5);
         cikarma(40,10);
         carpma(5,2.8);
    }

    //Overloading Yapma yöntemleri

    //1) Data Type 'larin yerini değiştirerek OverLoading
    private static void carpma(int a, double b) {
        System.out.println("int ile double carpma = "+(a*b));
    }

    private static void carpma(double a, int b) {
        System.out.println("double ile int carpma = "+(a*b));
    }


    //2) Parametrelerin sayısını ddegistirerek overloading
    private static void cikarma(int a, int b) {
        System.out.println("iki int ile çıkarma = "+(a-b));
    }

    private static void cikarma(int a, int b,int c) {
        System.out.println("iki int ile çıkarma = "+(a-b-c));
    }


    //3) parametrelerin DataType'larinin değiştirerek
    private static void toplama(int a, int b) {
        System.out.println("iki int ile toplama = "+(a+b));
    }
    
    public static void toplama(double a,int b){
        System.out.println("Iki int ile toplama = "+(a+b));
    }
    
    public static void toplama(float a,int b){
        System.out.println("Iki int ile toplama = "+(a+b));
    }
    
    //2) Parametrelerin sayısı





}
