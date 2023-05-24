package day27encapsulationabstraction;

public class CoursesRunner {

    public static void main(String[] args) {

        //"abstract class" larin icinde "abstract method" lar vardir.
        //"abstract method" larin body'si olmadigindan bu method'lar yarim method sayilir
        //Dolayisiyla; abstract Class'lar eksigi olan kaliplar gibi dusunulebilir
        //bu yuzden, "abstract class" lardan object uretilemez.

        //"abstract class" larin constructor'i vardir ama bu constructor obje uretemez haldedir

        //Courses obj1 = new Courses();

        EighthGraders obj1 = new EighthGraders();

        obj1.math();

        System.out.println();

        SeventhGraders obj2 = new SeventhGraders();

        obj2.math();
        obj2.art();

        /*
        OOP Principals:
     i)Inheritance +
     ii)Polymorphism: Method Overloading + Method Overriding
     iii)Encapsulation -
     iv)Abstraction -
        */


    }
}
