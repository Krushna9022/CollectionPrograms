package r22;

import java.util.ArrayList;
import java.util.Collections;

class Employees implements Comparable<Employees>
{
    int id;
   String  name;
    int salary;

    public Employees(int id, String name, int salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getSalary() {
        return salary;
    }

    @Override
    public int compareTo(Employees o) {
        // Compare based on name
        return this.name.compareTo(o.name);
    }
}
public class SortBYComparable {
    public static void main(String[] args) {

        ArrayList<Employees> employeesArrayList= new ArrayList<>();
        employeesArrayList.add(new Employees(1,"kkp",5000));
        employeesArrayList.add(new Employees(2,"mno",5000));
        employeesArrayList.add(new Employees(3,"zxe",5000));

        Collections.sort(employeesArrayList);
        for(Employees emp:employeesArrayList)
        {
            System.out.println(emp.getId()+"\t"+emp.getName()+"\t"+emp.getSalary());
        }
    }
}


