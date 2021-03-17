package LinkedList;

import java.util.Arrays;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {

        /** Reverse LinkedList */
        MyLinkedList list = new MyLinkedList();
        list.addFirst(10);
        list.addLast(20);
        list.addLast(30);
        list.reverse();
        int[] array = list.toArray();
        System.out.println(Arrays.toString(array));


        /** Part8 - Convert LinkedList to Array
         MyLinkedList list = new MyLinkedList();
        list.addFirst(10);
        list.addLast(20);
        list.addLast(30);
        System.out.println(Arrays.toString(list.toArray()));
         */

        /** Part7 - implement size
         MyLinkedList list = new MyLinkedList();
        System.out.println(list.size());
        list.addFirst(10);
        System.out.println(list.size());
         list.addLast(20);
         list.addLast(30);
        System.out.println(list.size());
        list.removeLast();
        System.out.println(list.size());
         */


        /** Part6 - implement removeLast
       MyLinkedList list = new MyLinkedList();
       list.addFirst(10);
       list.addLast(20);
       list.addLast(30);
       list.removeLast();
        */


        /** Part5 - implement removeFirst
        MyLinkedList list = new MyLinkedList();
        list.addFirst(10);
        list.addLast(20);
        list.addLast(30);
        list.removeFirst();
         */


        /** Part4 - implement contains
         MyLinkedList list = new MyLinkedList();
         list.addFirst(10);
         list.addLast(20);
         list.addLast(30);
        System.out.println(list.contains(20));
        System.out.println(list.contains(40));
         */


        /** Part3 - implement indexOf
        MyLinkedList list = new MyLinkedList();
        list.addFirst(10);
        list.addLast(20);
        list.addLast(30);
        System.out.println(list.indexOf(20));
        System.out.println(list.indexOf(40));
         */


        /** Part3 - implement addFirst
        MyLinkedList list = new MyLinkedList();
        list.addFirst(10);
        list.addLast(20);
        list.addFirst(30);
         */


        /** Part2 - create MyLinkedList & implement addLast
        MyLinkedList list = new MyLinkedList();
        list.addLast(10);
        list.addLast(20);
        list.addLast(30);
         */


        /** Part1 - Working With LinkedList

        // Store bunch of Integer in LinkedList
        LinkedList<Integer> numbers = new LinkedList<>();

        // Store any kind of object in LinkedList
        LinkedList list = new LinkedList();

        list.addFirst(12);
        list.addLast(20);
        list.addFirst(10);
        list.addLast(34);
        System.out.println(list);

        // contains return boolean
        System.out.println(list.contains(20));

        // indexOf return index O.W return -1
        System.out.println(list.indexOf(10));
        System.out.println(list.indexOf(100));

        // size return number of item in LinkedList
        System.out.println(list.size());

        list.removeFirst();
        list.removeLast();
        System.out.println(list);

        // convert LinkedList to Array
        Object[] array = list.toArray();
        System.out.println(Arrays.toString(array));
        */


    }
}
