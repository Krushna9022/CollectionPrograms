package r55;

import javax.xml.transform.Source;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class AnagramByMap {
    public static void main(String[] args) {
        Map<Character,Integer> anagram=new TreeMap<>();
        Map<Character,Integer> anagram2=new TreeMap<>();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the First String");
        String s1=sc.nextLine();
        System.out.println("Enter the First String");
        String s2=sc.nextLine();
        for(int i=0;i<s1.length();i++)
        {
            Integer count=anagram.get(s1.charAt(i));
            {
                if(count==null)
                {
                    count=0;
                }
                ++count;
                anagram.put(s1.charAt(i),count);
            }
        }

        for(int i=0;i<s2.length();i++)
        {
            Integer count=anagram2.get(s2.charAt(i));
            {
                if(count==null)
                {
                    count=0;
                }
                ++count;
                anagram2.put(s2.charAt(i),count);
            }
        }

        if(s1.length()==s2.length())
        {
            boolean flag=true;
            for(Map.Entry<Character,Integer> m1:anagram.entrySet())
            {
                for(Map.Entry<Character,Integer> m2:anagram2.entrySet())
                {
                    if(m1.getKey()!=m2.getKey() && m1.getValue()!=m2.getValue())
                    {
                        //System.out.print(m1.getKey()+"\t"+m1.getValue());
                        //System.out.print("\t\t\t"+m2.getKey()+"\t"+m2.getValue());
                       // System.out.println();
                      flag=false;
                    }

                }
            }
            System.out.println(flag);
        }
        else {
            System.out.println(false);
        }

    }
}
