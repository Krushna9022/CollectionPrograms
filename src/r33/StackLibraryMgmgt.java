package r33;

import java.util.ListIterator;
import java.util.Scanner;
import java.util.Stack;

public class StackLibraryMgmgt {
    public static void main(String[] args) {
        boolean flag = true;
        Scanner sc = new Scanner(System.in);
        Stack<String> books = new Stack<>();
        do {
            System.out.println("1.boorrow book");
            System.out.println("2.pop book");
            System.out.println("3.peek book");
            System.out.println("4.display stack of book");
            System.out.println("enter the choice");
            int c = sc.nextInt();
            switch (c) {
                case 1:
                    sc.nextLine();
                    System.out.println("enter the book name to borrow");
                    String b1=sc.nextLine();
                    books.push(b1);
                    break;
                case 2:
                    sc.nextLine();

                    String popped=books.pop();
                    if(popped!=null)
                    {
                        System.out.println("Top book  has been returned");
                    }
                    break;
                case 3:
                    System.out.println("top book is "+books.peek());
                    break;

                case 4:
                    System.out.println("displaying the all the books in stack");
                   for(ListIterator<String> i= books.listIterator(books.size());i.hasPrevious();)
                   {
                       String item=i.previous();
                       System.out.print(item+"\t");
                   }
                case 5:
                    flag=false;
            }

        } while (flag);
    }
}

