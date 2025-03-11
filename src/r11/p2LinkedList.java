package r11;

import java.util.LinkedList;
import java.util.List;

public class p2LinkedList {
    public static void main(String[] args) {
      List<String> str=new LinkedList<>();

        str.add("krushna");
        str.add("mahes");
        str.add("kishor");

        for(String s:str)
        {
            System.out.println(s);
        }

       //int index=str.indexOf("krushna");
        boolean f=str.remove("krpushna");
        if(f)
        {
            System.out.println("removed from the LIst");
        }
        else {
            System.out.println("not Present  from the LIst");
        }
    }
}
