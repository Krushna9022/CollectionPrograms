package r11;

import java.util.ArrayList;
import java.util.Scanner;

public class p1ArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        boolean b = true;
        while (b) {
            System.out.println("1 for add eleemts");
            System.out.println("2 for display");
            System.out.println("2 for remove");
            System.out.println("enter the choice");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("enter the element to add in the list ");
                    int element = sc.nextInt();
                    System.out.println("added "+al.add(element));;
                    break;
                case 2:
                    if (al.isEmpty()) {
                        System.out.println("list is emepty");
                    } else {
                        for (Integer i : al) {
                            System.out.print(i + "\t");
                        }
                    }
                    break;
                case 3:
                    System.out.println("enter the index to remove the elemnt from the list");
                    int index = sc.nextInt();
                    if(index>=0&& index< al.size()) {
                        System.out.println("remove "+al.remove(index));
                    }else {
                        System.out.println("index is not present in list");
                    }
                    break;
                case 4:
                    System.exit(0);
               default:
                   System.out.println("Wrong choice");


            }
        }
    }
}
