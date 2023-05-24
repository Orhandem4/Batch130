package day25inheritiance;

public class A01_Math extends A04_Lessons{

    public  A01_Math(){
        super("str");
        System.out.println("Math Constructor");
    }

    public A01_Math(int a){
        this();//Ayni class'in icindeki const calismasini sağlar
        System.out.println("parametrekli Math Cons.");
    }
}
