package r55;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupStringWithLength {
    public static void main(String[] args) {
        List<String> list=new ArrayList<>();
        list.add("a");
        list.add("md");
        list.add("mnp");
        list.add("kg");
        list.add("kp");
        list.add("pmg");
        Map<Integer,List<String>> m=new HashMap<>();
        for(String s:list)
        {
            Integer i=s.length();
            if(!m.containsKey(i))
            {
                m.put(i,new ArrayList());
            }
            List<String> str=m.get(i);
            str.add(s);
        }
        System.out.println(m);
    }
}
