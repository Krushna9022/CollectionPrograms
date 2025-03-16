package r55;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class ToDoApp {
    static int count=1;
    public static void main(String[] args) {

        Map<Integer,String> todo=new TreeMap<>();
        Scanner sc=new Scanner(System.in);
        boolean flag=true;
        while(flag)
        {
            System.out.println("Add task to do");
            System.out.println("View All the task");
            System.out.println("Remove the task");
            System.out.println("Enter Your choice");
            int choice=sc.nextInt();
            switch (choice)
            {
                case 1:
                    sc.nextLine();
                    System.out.println("enter the todo");
                    String str=sc.nextLine();
                    todo.put(count++,str);
                    break;
                case 2:
                    System.out.println("Sr.No"+"\t\tList Of Todo");
                    System.out.println("=============================");
                    for(Map.Entry<Integer,String> task:todo.entrySet())
                    {
                        System.out.println(task.getKey()+"\t\t\t"+task.getValue());
                        System.out.println("______________________________");
                    }

                    break;
                case 3:
                    int removetask=sc.nextInt();
                    if(todo.containsKey(removetask))
                    {
                        todo.remove(removetask);
                       int  newcount=0;
                        Map<Integer,String> newtodo=new TreeMap<>();

                        for(Map.Entry<Integer,String> m:todo.entrySet())
                        {
                            newtodo.put(++newcount,m.getValue());
                        }
                        todo.clear();
                        todo.putAll(newtodo);
                    }
                    else
                    {
                        System.out.println("Task Number has not been found");
                    }
                    break;
                case 4:
                    System.out.println("exit");
                    flag=false;
                default:
                    System.out.println("wrong choice System exit");
            }
        }
    }
}
