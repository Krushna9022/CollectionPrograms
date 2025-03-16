package r55;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class WordsCountInString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Map<String ,Integer> wfreq=new HashMap<>();
        System.out.println("enter the Line");
        String line=sc.nextLine();
        String s[]=line.split(" ");
        for(String str:s)
        {
             Integer i=wfreq.get(str);
             if(i==null)
             {
                 i=0;
             }
             i++;
             wfreq.put(str,i);
        }
      //  System.out.println(wfreq);
        for(Map.Entry<String,Integer> m:wfreq.entrySet())
        {
            System.out.println(m.getKey()+"======>"+m.getValue());
        }

    }
}
