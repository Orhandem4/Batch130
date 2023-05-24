package advanced_practice.practice12;

import java.util.HashMap;
import java.util.Map;

public class Q05_Map_AdSoyad {

    /*
      İki farklı Array'de aynı indekste barındırırılan ad ve soyadları örnekteki gibi yazdıran bir kod yazınız.
          input : {"John", "Mark", "Ali"}; {"Doe", "Twain", "Can"};
          output : {John=Doe, Mark=Twain, Ali=Can};
    */

    public static void main(String[] args) {

        String[] arr = {"John", "Mark", "Ali","Orhan"};
        String[] brr = {"Doe", "Twain", "Can","Demir"};

        Map<String, String> adSoyad = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {

            adSoyad.put(arr[i],brr[i]);

        }
        System.out.println(adSoyad);
    }
}
