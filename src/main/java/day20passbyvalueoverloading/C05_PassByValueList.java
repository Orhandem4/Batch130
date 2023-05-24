package day20passbyvalueoverloading;

import java.util.ArrayList;
import java.util.List;

public class C05_PassByValueList {

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

        harfler=listSegistir(harfler);
        System.out.println("main içinde harflermethoddan sonra = "+harfler);

    }

    private static List<String> listSegistir(List<String> harfler) {

        harfler = new ArrayList<>();
        System.out.println("method yeni list harfler = " + harfler);//=[]
        return harfler;
    }

    private static void listElamanlariniDegistir(List<String> harfler) {

        harfler.set(0,"R");
        System.out.println("method içi harfler = " + harfler);
    }
}
