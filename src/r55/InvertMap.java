package r55;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public
class InvertMap {
    public static void main(String[] args) {
        Map<String,Integer> m=new HashMap<>();
        m.put("a",1);
        m.put("b",2);
        m.put("c",1);
        m.put("d",2);
        m.put("f",2);
        Map<Integer, List<String>> invert=new HashMap<>();
        for(Map.Entry<String,Integer> e:m.entrySet())
        {
            String key=e.getKey();
            Integer value=e.getValue();
            if(!invert.containsKey(value))
            {
                invert.put(value,new ArrayList<>());
            }
            List<String> li=invert.get(value);
            li.add(key);

        }
        System.out.println(invert);
    }
}
