package day22staticblocksconstructors;

/*
       Constructor nedir?
       Class'dan obje uretmemize yarayan code block'laridir,

       Class olusturdugumuzda Java bize otomatik olarka bir constructor verir,
       Ama bu constructor gözle görülmez, gozle görülmeyen otomatik olarak Java tarafindan verilen
       bu constructor'lara "default constructor" denir.

       "default constructor"lar "Car(){ }" seklindedir

       siz kendi constructor'inizi olusturdugunuzda Java default constructur'i siler.

       Bir Class'da farkli parametreler kullanarak istediginiz kadar constructor olusturabilirsiniz

       Farkli constructor'lar sayesinde bir class'dan farkli farkli object'ler olusturabiliriz.

       Interview Sorusu: Method ile Constructor'in farkı varmidir? Varsa neidr?
       Cevap :           Method ile Constructor farkli yapilardir.
                         i)Method'larda "return type" vardir ama "constructor"larda "return type" yoktur.
                         ii)Method'larin ismi yaptilari ise göre developer'lar tarafindan belirlenir
                            Csontructor'larin ismi ise her zaman Class ismi ile olmalidir.
     */

public class C02_Car {

    String make = "Honda";
    String model = "Accord";
    int year = 2023;
    boolean hybrid = true;

    public C02_Car(String make,String model,int year,boolean hybrid){
        this.make=make;
        this.model=model;
        this.year=year;
        this.hybrid=hybrid;
    }

    public C02_Car(String make,String model){
        this.make=make;
        this.model=model;
        if (year==2023){
            this.year=0;
        }
        if (hybrid=true){
            this.hybrid=false;
        }
    }

    public C02_Car(String make, int year) {
        this.make = make;
        this.year = year;
    }

    @Override
    public String toString() {
        return "C02_Car{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", hybrid=" + hybrid +
                '}';
    }
}
