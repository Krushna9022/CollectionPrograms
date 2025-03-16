package theory;

import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class StringReverseList {
    public static void main(String[] args) {
        List<String> str= Arrays.asList("krushna","mahesh","kishor","gaurav");
        for(ListIterator<String> li=str.listIterator(str.size());li.hasPrevious();)
        {
            System.out.print(li.previous()+"\t");
        }

    }
}
