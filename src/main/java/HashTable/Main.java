package HashTable;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

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
         */

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

    }

}
