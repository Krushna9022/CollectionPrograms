package r44;

import java.util.*;

public class removeDepulicate {
    public static void main(String[] args) {
        List<String> ls=new ArrayList<>();
        Scanner sc=new Scanner(System.in);
        String line=sc.nextLine();
        String s[]=line.split(" ");
        for(String str:s)
        {
            ls.add(str);
        }
        Set<String> set=new LinkedHashSet<>(ls);
        ls.clear();
        for(String str:set)
        {
            ls.add(str);
        }
        ls.forEach(t-> System.out.print(t+"\t"));

    }
}
