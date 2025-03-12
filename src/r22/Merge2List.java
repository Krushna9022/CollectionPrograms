package r22;

import java.sql.SQLOutput;
import java.util.*;

public class Merge2List {
    public static void main(String[] args) {
        List<Integer> l1 = new ArrayList<>();
        List<Integer> l2 = new ArrayList<>();
        Scanner sc=new Scanner(System.in);
        for (int i = 0; i < 5; i++)
        {
            System.out.println("Add the elements");
            int a=sc.nextInt();
            l1.add(a);
        }
        for (int i = 0; i < 5; i++)
        {
            System.out.println("Add the elements");
            int a=sc.nextInt();
            l2.add(a);
        }
        Set<Integer>  s=new HashSet<>();
        l1.forEach(t->s.add(t));
        l2.forEach(t->s.add(t));
        s.forEach(t-> System.out.print(t+" "));


    }
}
