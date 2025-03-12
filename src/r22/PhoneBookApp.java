package r22;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.Set;



public class PhoneBookApp {
    public static void main(String[] args) {
        Map<String,String> phoneBook=new TreeMap<>();
        Scanner sc=new Scanner(System.in);
        while(true)
        {
            System.out.println("1. Add to contact");
            System.out.println("2.Show all contact");
            System.out.println("3.Delete contact");
            System.out.println("4.update Contact");
            System.out.println("5.search contact");
            int choice=sc.nextInt();
            switch(choice)
            {
                case 1:
                    sc.nextLine();
                    System.out.println("enter the name to of contact");
                    String name=sc.nextLine();
                    boolean flag=phoneBook.containsKey(name);
                    if(!flag)
                    {
                        System.out.println("enter the Phone number");
                        String phone=sc.nextLine();
                        phoneBook.put(name,phone);
                    }
                    else {
                        System.out.println("Already Exists");
                    }
                    break;
                case 2:
                    sc.nextLine();
                    if(phoneBook.isEmpty())
                    {
                        System.out.println("no  contact found");
                    }
                    else {
                        Set<Map.Entry<String,String> > display=phoneBook.entrySet();
                        System.out.println("Name"+"\t\t\t"+"contacts");
                        for(Map.Entry<String,String> d:display)
                        {
                            System.out.println(d.getKey()+"\t\t\t"+d.getValue());
                        }
                    }
                    break;
                case 3:
                    sc.nextLine();
                    System.out.println("Enter the name to delete");
                    name=sc.nextLine();
                    String removed=phoneBook.remove(name);
                    if(removed!=null)
                    {
                        System.out.println(removed+" removed from the contact");
                    }
                    else
                    {
                        System.out.println("not present in phonebook");
                    }
                    break;
                case 4:
                    sc.nextLine();
                    System.out.println("enter the name to update the Contact");
                    name=sc.nextLine();

                    if(phoneBook.containsKey(name))
                    {
                        System.out.println("enter the updated contact");
                        String updateContact= sc.nextLine();
                        phoneBook.put(name,updateContact);
                    }
                    else {
                        System.out.println("not find with the name add first......");
                    }
                    break;
                case 5:
                    sc.nextLine();
                    System.out.println("enter the name to sarch the Contact");
                    String searchname=sc.nextLine();
                    if(phoneBook.containsKey(searchname))
                    {
                        String phone=phoneBook.get(searchname);
                        System.out.println(searchname+"\t\t"+phone);
                    }
                    else
                    {
                        System.out.println("not presnt in the phonebooks");
                    }
                    break;


            }
        }
    }
}
