package r55;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class MergeTwoMap {
    public static void main(String[] args) {
        Map<Character,Integer> m1=new TreeMap<>();
        m1.put('a',1);
        m1.put('b',3);
        m1.put('c',2);
        m1.put('e',4);
        m1.put('d',4);
        Map<Character,Integer> m2=new TreeMap<>();
        m2.put('f',1);
        m2.put('g',3);
        m2.put('c',2);
        m2.put('g',4);
        m2.put('d',4);
        System.out.println(m1);
        System.out.println(m2);
        Map<Character,Integer> merge=new TreeMap<>();
        for(Map.Entry<Character,Integer> m:m1.entrySet())
        {
            merge.put(m.getKey(),m.getValue());
        }
        for(Map.Entry<Character,Integer> m:m2.entrySet())
        {
            if(merge.containsKey(m.getKey()))
            {
                Integer i=merge.get(m.getKey());
                i+=m.getValue();
                merge.put(m.getKey(),i);
            }
            else
            {
                merge.put(m.getKey(),m.getValue());
            }
        }
        System.out.println(merge);

    }
}
