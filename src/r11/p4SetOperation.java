package r11;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

public class p4SetOperation {
    public static void main(String[] args) {
        HashSet<Integer> hs = new HashSet();
        hs.add(10);
        hs.add(200);
        hs.add(200);
        hs.add(2000);
        hs.add(06);
        Scanner sc = new Scanner(System.in);

        boolean flag = true;
        do {
            System.out.println("\n1.add to set");
            System.out.println("2.check existsto set");
            System.out.println("3. display all elements");
            System.out.println("4.exit...");
            System.out.println("enter your choice");

            int c = sc.nextInt();

            switch (c) {
                case 1:
                    System.out.println("entder the element to add in the set");
                    int ele = sc.nextInt();
                   boolean ispresent= hs.add(ele);
                   if(ispresent)
                   {
                       System.out.println("added to the set");
                   }
                   else
                   {
                       System.out.println("not added to the Set");
                   }
                    break;
                case 2:
                    System.out.println("enter the element is present");
                    int element = sc.nextInt();

                    boolean f = hs.contains(element);
                    if (f) {
                        System.out.println("exits in the sets");
                    } else {
                        System.out.println("not presemt in the sets");
                    }

                    break;
                case 3:
                    System.out.println("printing the list of the elements");
                    for (Integer a : hs) {
                        System.out.print(a + "\t");
                    }
                    break;
                case 4:
                    flag = false;
            }
        } while (flag);


    }
}
