package r22;

import java.util.*;

public class RemoveDuplicate {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        List <Integer> li=new ArrayList<>();
        System.out.println("ENter the element in the List");
        for(int i=0;i<5;i++)
        {
            int a=sc.nextInt();
            li.add(a);
        }
        Set<Integer> s=new LinkedHashSet(li);
        li.clear();
        for(Integer o:s)
        {
            li.add(o);
        }

    }
}
