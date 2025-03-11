package r11;

import java.sql.SQLOutput;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class p5Map {
    public static void main(String[] args) {
        boolean flag = true;
        Scanner sc = new Scanner(System.in);
        HashMap<Integer, String> hm = new HashMap<>();
        hm.put(1, "Krushna");
        hm.put(2, "Abhishek");
        hm.put(3, "mahesh");
        do {
            System.out.println("1. add in map");
            System.out.println("2.remove from map");
            System.out.println("3.display from map");
            System.out.println("enter your choice");
            int c = sc.nextInt();
            switch (c) {
                case 1:
                    System.out.println("enter the key");
                    int key = sc.nextInt();
                    sc.nextLine();
                    System.out.println("enter the value ");
                    String value = sc.nextLine();
                    String s = hm.put(key, value);
                    System.out.println(s);
                    if (s == null) {
                        System.out.println("added to Map");
                    } else {
                        System.out.println("not added to Map");
                    }
                    break;
                case 2:
                    System.out.println("enter the key to rempve from the map");
                    key = sc.nextInt();
                    String removevalue = hm.remove(key);
                    if(removevalue!=null)
                    {
                        System.out.println(removevalue+" removed from the map ");
                    }
                    else {
                        System.out.println("not removed");
                    }
                    break;
                case 3:
                  Set< Map.Entry<Integer,String>> emap=hm.entrySet();
                  for(Map.Entry<Integer,String> entry:emap)
                  {
                      System.out.println(entry.getKey()+"\t\t"+entry.getValue());
                  }
            }
        } while (flag);
    }
}
