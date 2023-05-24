package day22staticblocksconstructors;

public class C03_CarRunner {

    public static void main(String[] args) {

        C02_Car c1 = new C02_Car("BMW","M4",2023,false);
        C02_Car c2 = new C02_Car("audi","R8",2022,true);
        C02_Car c3 = new C02_Car("Honda","Civic",1999,false);

        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);

        C02_Car c4 = new C02_Car("Mercedes", "C300");
        System.out.println(c4);



    }
}
