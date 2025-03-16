package r55;

import java.util.HashMap;
import java.util.Map;

public class HighestFrequencyElement {
    public static void main(String[] args) {
        int arr[]=new int[]{1,2,3,2,3,3,4,5,6,7};
        Map<Integer,Integer> m=new HashMap<>();
        for(int a:arr)
        {
            Integer i=m.get(a);
            if(i==null)
            {
                i=0;
            }
            i++;
            m.put(a,i);
        }

        int max =0;
        int maxcount=0;
        for(Map.Entry<Integer,Integer> e:m.entrySet())
        {
            int value=e.getValue();
            if(value>maxcount)
            {
                maxcount=value;
                max=e.getKey();
            }
        }
        System.out.println(m);
        System.out.println(max);


    }
}
