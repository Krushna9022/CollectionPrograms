package r11;

import java.util.ListIterator;
import java.util.Stack;
import java.util.Scanner;

public class p3Stack {
    public static void main(String[] args) {
        Stack<Integer> num = new Stack<>();
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("enter the ");
            int c = sc.nextInt();
            switch (c) {
                case 1:
                    System.out.println("enter the element to push in stack");
                    int element = sc.nextInt();
                    boolean b = pushElement(num, element);
                    if (b) {
                        System.out.println("element is added");
                    } else {
                        System.out.println("elemt is not added");
                    }
                    break;
                case 2:
                    display(num);

                    break;
                case 3:
                    popElement(num);
                case 4:
                    peekElement(num);
                    break;

            }

        } while (true);

    }

    public static void display(Stack<Integer> al) {
        ListIterator<Integer> listIterator = al.listIterator(al.size());
        while (listIterator.hasPrevious()) {
            Integer i = listIterator.previous();
            System.out.println(i);
        }

    }

    public static boolean pushElement(Stack<Integer> al, int element) {
        return al.push(element) != null;
    }

    public static boolean popElement(Stack<Integer> al) {
        return al.pop() != null;
    }

    public static boolean peekElement(Stack<Integer> al) {
        return al.peek() != null;
    }
}


