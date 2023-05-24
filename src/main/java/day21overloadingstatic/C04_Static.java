package day21overloadingstatic;

public class C04_Static {

    public static void main(String[] args) {

        System.out.println(C03_StaticDepo.okulIsmi);//Emre Okullari

        C03_StaticDepo obj1 = new C03_StaticDepo();
        System.out.println(obj1.ogrenciGul);//Gul Gecer

        C03_StaticDepo.okulIsmi = "Mine Okullari";
        System.out.println("yeni isim = "+C03_StaticDepo.okulIsmi);//yeni isim = Mine Okullari

        C03_StaticDepo obj2 = new C03_StaticDepo();
        obj2.ogrenciGul = "zeynep Karagol";
        System.out.println("yeni öğrenci ismi = "+obj2.ogrenciGul);//yeni öğrenci ismi = zeynep
        System.out.println("yeni öğrenci ismi = "+obj1.ogrenciGul);///yeni öğrenci ismi = Gul Gecer
        //obje değişmediği için hala aynı





    }
}
