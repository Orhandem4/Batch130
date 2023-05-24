package day24accessmodifiersinheritiance;

import day23datetimestringbuilder.Monkey;

public class AnimalRunner {

    /*
         1)"Inheritance" sayesinde
            i)Code tekrarlarindan kurtuluruz
            ii)Code tamiri(maintenance) kolay olur
            iii)Child Class'lari daha atomic yapmis oluruz
         2)Bir Class'i baska bir Class'in Child Class'i yapmak icin
            "extends" keyword kullanilir. Ilk yazilan Class Child, ikinci
             yazilan Class parent olur Parent Class'a super Class da denir
         3)Child Class object'leri Parent Class'dan method ve variable'lari
           kullanabilirler.
         4)Parent Class object'leri Child Class'dan method ve variable'lari
           kullanamazlar.

         5)Object Class her Class'in parent'idir.
           Java da Object Class haric her Class'in parent'i vardir.
           Java'da parent'i olmayan tek Class Object Class dir.
    */
    public static void main(String[] args) {
        Cat miyav = new Cat();
        miyav.eat();
        miyav.drink();
        miyav.breath();
        miyav.meow();

        System.out.println();

        Dog kartopu = new Dog();
        kartopu.eat();
        kartopu.drink();
        kartopu.breath();
        kartopu.bark();

        System.out.println();

        Bird mavis = new Bird();
        mavis.eat();
        mavis.drink();
        mavis.breath();
        mavis.tweett();

        System.out.println();

        Monkey maymuş = new Monkey();//day 23 teki monkey classı
        maymuş.eat();//protected farklı package dan da olsa child class görür
        maymuş.drink();
        maymuş.monkey();

    }//main





}
