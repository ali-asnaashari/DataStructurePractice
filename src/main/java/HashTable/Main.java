package HashTable;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main {

    public static void main(String[] args) {

        /** MyHashTable
         * collisions handle by chains(LinkedList)
         * put()
         * get()
         */

        MyHashTable table = new MyHashTable(5);
        table.put(6,"A");
        table.put(8,"B");
        table.put(11,"C");
        table.put(6,"A+");
        System.out.println(table.get(6));
        System.out.println(table.get(10));



        /** Find First Repeating Char
        CharFinder finder = new CharFinder();
        char ch = finder.findFirstRepeatedChar("hello world");
        System.out.println(ch);
        */


        /** set
         *  set: unique list & just key
         *  Method: add , remove , removeALL , contains , size , clear
         *  iterate over set like iterate over map

        Set<Integer> set = new HashSet<>();
        int[] numbers = {1,2,3,4,2,3,5,1,6};
        for (int item : numbers)
            set.add(item);
        System.out.println(set);
        System.out.println(set.size());

        set.remove(2);
        System.out.println(set);
        System.out.println(set.contains(2));

        Set<Integer> set2 = new HashSet<>();
        set2.add(1);
        set2.add(6);
        set.removeAll(set2);
        System.out.println(set);

        set.clear();
        System.out.println(set);
        System.out.println(set.size());
        */



        /** Find First NonRepeating Char
        CharFinder finder = new CharFinder();
        char ch = finder.findFirstNonRepeatingChar("hello world");
        System.out.println(ch);
        */


        /** Working with HashTables
         * super fast LookUp
         * use for: spell checkers - Building Dictionaries - Compiler - Code editor
         * Java -- > HashMap  javascript --> Object   Python --> Dictionary   c# ---> Dictionary
         * Key - Value
         * insert O(1)
         * delete O(1)
         * Lookup O(1)
         * containsKey O(1)
         * containsValue O(n)
         * keySet() ---> return list of keys --> Iterable
         * entrySet() ---> return list of key value pairs --> Iterable
         * HashMap Accept null keys and value
         * in HashMap we can not have duplicate keys


        // Create HashMap
        Map<Integer,String> map = new HashMap<>();
        map.put(1,"Ali");
        map.put(2,"John");
        map.put(3,"Mary");
        System.out.println(map);

        System.out.println("---------------------------------");

        // HashMap Method
        Map<Integer,String> mapV1 = new HashMap<>();
        mapV1.put(1,"Ali");
        mapV1.put(2,"John");
        mapV1.put(3,"Mary");
        mapV1.put(3,"Ahmad");
        mapV1.put(4,null);
        mapV1.put(null,null);
        System.out.println(mapV1);
        mapV1.remove(null);
        System.out.println(mapV1);
        // get value
        String name = mapV1.get(3);
        System.out.println(name);
        // Check key and value --> return Boolean
        System.out.println(mapV1.containsKey(3));
        System.out.println(mapV1.containsValue("John"));
        System.out.println(mapV1.containsValue("john"));
        // iterate over key and value
        for (Integer item : mapV1.keySet())
            System.out.println(item);

        for (Map.Entry<Integer, String> item: mapV1.entrySet())
            System.out.println(item);

        // getKey() & getValue()
        for (Map.Entry<Integer, String> item: mapV1.entrySet())
            System.out.println(item.getKey());

        for (Map.Entry<Integer, String> item: mapV1.entrySet())
            System.out.println(item.getValue());

         */

    }

}
