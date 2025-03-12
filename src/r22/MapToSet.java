package r22;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class MapToSet {
    public static void main(String[] args) {
        Map<Integer,String> m=new HashMap<>();
        m.put(2,"kkp");
        m.put(3,"kkp");
        m.put(5,"kkp");
        m.put(7,"kkp");
        m.put(1,"kkp");
       Map<Integer,String> sort=new TreeMap(m);
        Set<Integer> key= sort.keySet();
        System.out.println(key);



    }
}
