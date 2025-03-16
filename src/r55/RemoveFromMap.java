package r55;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;

public class RemoveFromMap {
    public static void main(String[] args) {
        Map<Integer,String> m=new HashMap<>();
        m.put(1,"Mango");
        m.put(2,"Apple");
        m.put(3,"grapes");
        m.put(4,"Banana");
        m.put(5,"grapes");
        m.put(6,"Pappaya");
        System.out.println(m);
        System.out.println("enter the value to remove from map");
        String s= new Scanner(System.in).nextLine();
        HashSet<Integer> num=new HashSet<>();
        for(Map.Entry<Integer,String> e:m.entrySet())
        {

            if(e.getValue().equals(s))
            {
                num.add(e.getKey());
            }
        }
        for(Integer i:num)
        {
            m.remove(i);
        }
        System.out.println(m);

    }
}
