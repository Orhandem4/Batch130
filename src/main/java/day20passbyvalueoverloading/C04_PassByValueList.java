package day20passbyvalueoverloading;

import java.util.ArrayList;
import java.util.List;

public class C04_PassByValueList {

    public static void main(String[] args) {

        List<String> harfler = new ArrayList<>();

        harfler.add("A");
        harfler.add("B");
        harfler.add("C");
        harfler.add("D");

        listElamanlariniDegistir(harfler);
        System.out.println("method dan sonra harfler"+harfler);
        //listemizde icindeki eelmanlardan bir yada birkacini degistirdigimizde
        //listeyi degistirmis olmuyoruz.Pass By Value Array ve Listlerde de aynen gecerlidir.
        //ama listenin kendisini degistirmis olmuyoruz

        listSegistir(harfler);
        System.out.println("main içinde harflermethoddan sonra = "+harfler);//[R,B,C,D]

    }

    private static void listSegistir(List<String> harfler) {

        harfler = new ArrayList<>();
        System.out.println("method yeni list harfler = " + harfler);//=[]
    }

    private static void listElamanlariniDegistir(List<String> harfler) {

        harfler.set(0,"R");
        System.out.println("method içi harfler = " + harfler);
    }

}
