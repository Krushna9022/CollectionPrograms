package r44;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class CommonSkill {
    public static void main(String[] args) {
        List<Employee> e1 = new ArrayList<>();
        e1.add(new Employee("krushna", "java"));
        e1.add(new Employee("Manoj", "python"));
        e1.add(new Employee("Rohan", "sql"));
        List<Employee> e2 = new ArrayList<>();
        e2.add(new Employee("rahul", "spring"));
        e2.add(new Employee("kkp", "java"));
        e2.add(new Employee("mahesh", "sql"));
        HashSet<String> hs=new HashSet<>();
        for(Employee emp1:e1)
        {
            for(Employee emp2:e2)
            {
                if(emp1.getSkill().equals(emp2.getSkill()))
                {
                    hs.add(emp1.getSkill());
                }
            }
        }
        System.out.println(hs);
    }
}



@Getter
@Setter
@AllArgsConstructor
class Employee {
    String name;
    String skill;
}
