package day27encapsulationabstraction;

public abstract class Courses {

    /*
      Bir method "parent class" da "abstract method" ise;
      Child Class o method'u "override" edip kullanmak zorundadir.
      Bu yuzden her hangi bir fonksiyonu "Child Class" icin mecburi yapmak isterseniz o method'u "abstract" yapmalisiniz.
    */
    /*
      1)Bazen method body'sini yazmak gerekmez, bu durumlarda body'siz method olusturmak gerekir.
        body'si olmayan method'lara "abstract method" lar denir.

      2)"abstract method" lar chil class'lar tarafindan "override" edilmek zorundadirlar.
        bu yuzden, eger bir fonksiyonun chil class'lar tarafindan kullanilmasini mecbur kılmak isterseniz
        o method'u abstract yapmak gerekir

      3)Bir method'un body'sini silmek o method'un abstract olmasi icin yeterli değildir.
        "access modifier" ile "return type" arasinda "abstract" keyword koymak gerekir

      4)"abstract method" lar siradana class'larin(concrete) icine yazilamazlar, "abstract method" larin icine yazildiklari class'lar da
        abstract olmak zorundadirlar

      5)"abstract class" larda hem "abstract method" lar hem de "concrete method" lar kullanabilir

      6)"concrete class" lar "abstract class" larin child'i olabilirler.
        "abstract method" larin override edilme zorunlulugu "concrete class" lar içindir.
     */

    public abstract void math();

    public void art(){
        System.out.println("Painting...");
    }

    //final method'lar ""override" edilemezler, halbuki "abstract method'lar overridek edilmek icin olsuturulurlar.
    //Bu celiskidir, bu yuzden Java abstract method'larin final olmasina musaade etmez.
    //public final abstact void science();

    //Concrete Class'lar final oldugunda Child Class'a sahip olamazlar
    //Ama "abstract class"lar icin Child Class olmalidir, cunku Child Class'lar abstract class'daki abstract method'lari kullanirlar.
    //Bu yuzden "abstract class" larin "final" olmasina musaade etmez.

    //"abstract method'lar "private" olamazlar, cunku Child Class'lar abstract method'lari kullanirlar private yapinca kullanima kapali olur
    //bu celiskidir, bu yuzden Java abstract method'larin "private" olmasina musaade etmez.

    //"abstract method" lar "static" olamazlar, cunku static method'lar override edilemez, halbu ki abstract method'lar override edilmek icin olusturulmustur.
}
