package r44;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FrequencyWords {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       String line="t";
        Map<String,Integer> map=new HashMap<>();
       while(!line.equals("exit")) {
            line = sc.nextLine();
           String word[]=line.split(" ");
           for(int i=0;i<word.length;i++)
           {
               Integer a=map.get(word[i]);
               if(a==null)
               {
                   a=0;
               }
               ++a;
               map.put(word[i],a);
           }
       }
       for(Map.Entry<String,Integer> m:map.entrySet())
       {
           System.out.println(m.getKey()+"\t===>"+m.getValue());
       }
    }
}
