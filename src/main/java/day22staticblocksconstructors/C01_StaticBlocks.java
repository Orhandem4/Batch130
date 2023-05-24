package day22staticblocksconstructors;

public class C01_StaticBlocks {

    //bir variable olusturduğunuzda , degere atamazsanız o variable'i "initialize" etmediniz demektir.
    //static variable'ler static block'lar icinde initialize edilirse o class'in icinde herseyden once hazir hale getirilmis olur
    //Bazen main method calıstırılmadan önce variable'larin hazir hale getirilmesi gerekir bu yuzden static block'lar kullanilir.

    //Note 1; "static block" lar static variable'lari initialize etmek icin kullanilir
    //Note2;  "static block" lar class icinde "herseyden once" calistirilirlar
    static double pi;
    static String shape;

    static {
        pi=3.14;
        System.out.println("static block 1");
    }

    static {
        shape = "circle";
        System.out.println("static block 2");
    }

    public static void main(String[] args) {
        System.out.println(pi);
        System.out.println("main method");
    }





}
