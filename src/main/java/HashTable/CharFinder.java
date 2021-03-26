package HashTable;

import com.sun.xml.internal.fastinfoset.util.CharArray;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class CharFinder {

    public char findFirstNonRepeatingChar(String str){
        Map<Character,Integer> map = new HashMap<>();

        char[] chars = str.toCharArray();

        for (Character ch:chars) {
            int count = map.containsKey(ch) ? map.get(ch) : 0;
//            int count = map.getOrDefault(ch,0);
            map.put(ch,count+1);
        }

        for (char ch : chars)
            if (map.get(ch) == 1)
                return ch;

        return Character.MAX_VALUE;
    }

    public char findFirstRepeatedChar(String str){
        Set<Character> set = new HashSet<>();

        char[] chars = str.toCharArray();
        for (char ch : chars) {
            if (set.contains(ch))
                return ch;
            set.add(ch);
        }

        return Character.MAX_VALUE;
    }












}
