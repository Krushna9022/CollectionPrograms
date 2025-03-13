package r11;

import java.util.*;

public class p6Frequency {
    public static void main(String[] args) {
        int a[]=new int[5];   //1 2 3 4 1 1
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<a.length;i++)
        {
            a[i]=sc.nextInt();
        }
        Map<Integer,Integer> frequency= new HashMap<>();

        for(int i=0;i<a.length;i++)
        {
            Integer count=frequency.get(a[i]);
            if(count==null)
            {
                count = 0;
            }
            ++count;
            frequency.put(a[i],count);
        }
       // Set<Map.Entry<Integer,Integer>> entrySet=frequency.entrySet();
        for(Map.Entry<Integer,Integer> entry:frequency.entrySet())
            System.out.println(entry.getKey()+"\t===>\t"+entry.getValue());
        {

        }
    }
}
