package r44;

import java.util.*;

public class MergeMultipleList {
    public static void main(String[] args) {
        List<String> l1= Arrays.asList("the","sky","is","blue");
        List<String> l2= Arrays.asList("the","sky","is","black");
        List<String> l3= Arrays.asList("java","is","programming","language");
        Set<String> s=new TreeSet<>();
        l1.forEach(t->s.add(t));
        l2.forEach(t->s.add(t));
        l3.forEach(t->s.add(t));
        List<String> merge=new ArrayList<>(s);
        merge.forEach(t-> System.out.print(t+"\t"));


    }
}
