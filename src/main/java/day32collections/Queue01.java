package day32collections;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Queue01 {

    /*
        "Queue" larda ilk gelen ilk isleme girer. (First In First Out ==> FIFO)
        Bazen de son gelen ilk işleme girer. (Lost In First Out ==> LIFO)
        "Deque" "Double Ended Queue" hem "FIFO" hemde "LIFO" icin kullanilir

        "Queue" bir interface'dir, bu yüzden "constructor"i yoktur dolayısıyla object olustururken "new" keyword'unden sonra kullanilamaz
        Data type'i "Queue" olan bir object olusturmak için "new" keyword'unden sonra i)LinkedList veya ii)PriorityQueue
        Class'lari kullanılabilir.

        "Queue" olustururken constructor olarak "PriorityQueue" kullanirsaniz, elemanlari kendi belirleyeceğiniz kurala göre
        siralama hakkiniz olur.
    */

    public static void main(String[] args) {

        Queue myQueue = new LinkedList();
        myQueue.add("Milk");
        myQueue.add("Butter");
        myQueue.add("Jam");
        myQueue.add("Egg");
        myQueue.add("Luxury water");

        System.out.println(myQueue);//[Milk, Butter, Jam, Egg, Luxury water]

        //Retrieves and removes the "head of this queue", or returns "null" if this queue is empty.
        myQueue.poll();

        //Retrieves and removes the head of this queue.
        //This method differs from poll() only in that it throws an exception if this queue is empty.
        //Returns: the head of this queue
        myQueue.remove();

        //Retrieves, but does not remove, the head of this queue.
        //This method differs from peek only in that it throws an exception if this queue is empty.
        myQueue.element();

        //Retrieves, but does not remove, the head of this queue, or returns null if this queue is empty.
        myQueue.peek();

        /*
            poll() ile remove() ikiside ilk elemanı silip size verir
            poll() bos "Queue lar için "null" verir, remove() ise bos "Queue"lar icin Exception atar.
        */

        /*
            element() ile peek() ikiside ilk elemanı silmeden size verir
            peek() bos "Queue lar için "null" verir, element() ise bos "Queue"lar icin Exception atar.
        */

        //Inserts the specified element into this queue if it is possible to do so immediately without violating capacity restrictions.
        //When using a capacity-restricted queue, this method is generally preferable to add,
        //which can fail to insert an element only by throwing an exception.
        //Returns: true if the element was added to this queue, else false
        //Throws:
        //ClassCastException – if the class of the specified element prevents it from being added to this queue
        //NullPointerException – if the specified element is null and this queue does not permit null elements
        //IllegalArgumentException – if some property of this element prevents it from being added to this queue
        boolean r = myQueue.offer("Avocado");
        System.out.println(r);//true

        System.out.println(myQueue);//[Jam, Egg, Luxury water, Avocado]

        Queue yourQueue = new PriorityQueue();
        yourQueue.add("Milk");
        yourQueue.add("Butter");
        yourQueue.add("Jam");
        yourQueue.add("Egg");
        yourQueue.add("Luxury water");

        System.out.println(yourQueue);//[Butter, Egg, Jam, Milk, Luxury water]








    }
}
