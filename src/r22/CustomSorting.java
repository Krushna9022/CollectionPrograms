package r22;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Employee
{
    int id;
    String name;
    double sal;

    public Employee(int id, String name, double sal) {
        this.id = id;
        this.name = name;
        this.sal = sal;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getSal() {
        return sal;
    }
}

public class CustomSorting {
    public static void main(String[] args) {
       List<Employee> emp=new ArrayList<>();
        emp.add(new Employee(1,"krushna",2000));
        emp.add(new Employee(2,"mahesh",3000.2));
        emp.add(new Employee(5,"Rahul",5000.5));
        emp.add(new Employee(4,"Rohan",2000.1));
        System.out.println("before sorting");
        for(Employee semp:emp)
        {
            System.out.println(semp.getId()+"\t"+semp.getName()+"\t"+semp.getSal());
        }
        Comparator<Employee> e=new SortEmpBySalary();
        Collections.sort(emp,e);
        System.out.println("After sorting");
        for(Employee semp:emp)
        {
            System.out.println(semp.getId()+"\t"+semp.getName()+"\t"+semp.getSal());
        }
    }
}
class SortEmpBySalary implements Comparator<Employee>
{

    @Override
    public int compare(Employee o1, Employee o2) {
        return o1.getSal()>o2.getSal()?1:o1.getSal()<o2.getSal()?-1:0;
    }
}

