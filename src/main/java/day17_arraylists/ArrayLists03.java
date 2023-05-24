package day17_arraylists;

import java.util.ArrayList;
import java.util.List;

public class ArrayLists03 {

    public static void main(String[] args) {

        List<String> cities = new ArrayList<>();
        cities.add("Miami");
        cities.add("Istanbul");
        cities.add("Kayseri");
        cities.add("Almaty");
        cities.add("Kayseri");
        System.out.println(cities);

        //remove() methodu index ile kullanilirsa o index'teki elemani siler
        //remove() methodu index ile kullanilirsa size sildigi elemani verir
        String n = cities.remove(1);
        System.out.println(n);//Istanbul
        System.out.println(cities);

        //remove() methodu eleman ile kullanilirsa ilk gorunumu siler
        //remove() methodu index ile kullanilirsa size o elemani silip silmedigini ifade eden
        //true veya false verir
        //eger eleman list'te var ise o elemani siler vesize true der
        //eger eleman list'te yok ise o elemani silemediginden ve size false der
        boolean p = cities.remove("Kayseri");
        System.out.println(p);//true
        System.out.println(cities);










    }
}
