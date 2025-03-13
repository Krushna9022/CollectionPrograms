package r33;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class ShoppingCart {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Set<String> s=new HashSet<>();
        do {
            System.out.println("1. Add item in cart");
            System.out.println("2. View All Items");
            System.out.println("3. remove Items");
            System.out.println("enter choice");
            int c=sc.nextInt();
            switch (c)
            {
                case 1:

                    sc.nextLine();
                    System.out.println("enter the items");
                    String item=sc.nextLine();
                   boolean f=s.contains(item);
                    if(!f)
                    {     s.add(item);
                        System.out.println(" added to cart");
                    }
                    else
                    {
                        System.out.println("not added to cart already present" );
                    }
                    break;
                case 2:
                    System.out.println("cart list");
                    for(String a:s)
                    {
                        System.out.println(a);
                    }
                    break;
                case 3:
                    sc.nextLine();
                    item=sc.nextLine();
                    f=s.remove(item);
                    if(f)
                    {
                        System.out.println("removed from the cart");
                    }
                    else
                    {
                        System.out.println("not removed from the cart");
                    }

                    break;
            }
        }while(true);


    }
}
