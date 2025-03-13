package r33;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class StudentGradeApp {
    public static void main(String[] args) {
        boolean flag=true;
        LinkedList<Student> students =new LinkedList<>();
        Scanner sc=new Scanner(System.in);
        do
        {
            int c=sc.nextInt();

            switch(c)
            {
                case 1:
                    students.add(new Student(1,"kp",60));
                    students.add(new Student(2,"md",70));
                    students.add(new Student(3,"rp",40));
                    students.add(new Student(4,"pg",50));
                    students.add(new Student(5,"kg",30));
                    break;
                case 2:
                    for(Student s:students)
                    {
                        System.out.println(s.getId()+"\t"+s.getName()+"\t"+s.getGrade());
                    }
                    break;
                case 3:
//                    for(Student s:students)
//                    {
//                        if(s.getGrade()<50)
//                        {
//                            students.remove(s);
//                        }
//                    }
                    ListIterator<Student> i= students.listIterator();
                    while(i.hasNext())
                    {
                        Student s=i.next();
                        if(s.getGrade()<50)
                        {
                            i.remove();
                        }
                    }
                    break;
                case 4:
                    System.exit(0);

            }
        }while(flag);

    }
}

