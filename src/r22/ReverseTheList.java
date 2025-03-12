package r22;

import java.util.ArrayList;
import java.util.ListIterator;

public class ReverseTheList {
    public static void main(String[] args) {
        ArrayList<Integer> i=new ArrayList<>();
        i.add(10);
        i.add(30);
        i.add(40);
        i.add(50);
        i.add(60);
        i.add(30);
        ListIterator listIterator=i.listIterator(i.size());
        while(listIterator.hasPrevious())
        {
            System.out.println(listIterator.previous());
        }
    }
}
