package r55;

import java.util.HashMap;
import java.util.Map;

public class FequencyUsingMap {
    public static void main(String[] args) {
        Map<Integer,Integer> frequency =new HashMap<>();
        int arr[]=new int []{1,2,2,3,4,4,4,5,5,5,5};
        for(int a:arr)
        {
            Integer i=frequency.get(a);
            if(i==null)
            {
                i=0;
            }
            ++i;
            frequency.put(a,i);
        }
        System.out.println(frequency);
    }
}
