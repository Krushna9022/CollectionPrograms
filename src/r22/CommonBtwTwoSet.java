package r22;

import java.util.HashSet;
import java.util.Set;

public class CommonBtwTwoSet {
    public static void main(String[] args) {
        Set<String> str1=new HashSet<>();
        Set<String> str2=new HashSet<>();
        str1.add("Krushna");
        str1.add("mahesh");
        str1.add("ronhna");
        str1.add("Rahul");
        str1.add("Kishor");

        str2.add("abhishek");
        str2.add("Shivam");
        str2.add("Krushna");
        str2.add("Rahul");
        for(String s:str1)
        {
            if(str2.contains(s))
            {
                System.out.println(s);
            }
        }



    }
}
