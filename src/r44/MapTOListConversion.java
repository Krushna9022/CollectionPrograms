package r44;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.*;

public class MapTOListConversion {
    public static void main(String[] args) {
            Map<Integer,Employe > empmap=new HashMap<>();
            Employe emp1=new Employe(1,"Krushna",800);
            Employe emp2=new Employe(5,"Abhishek",400);
            Employe emp3=new Employe(3,"Rohan",600);
            empmap.put(emp1.getId(),emp1);
            empmap.put(emp2.getId(),emp2);
            empmap.put(emp3.getId(),emp3);
        List<Employe>li=new ArrayList<>(empmap.values());
        for(Employe e:li)
        {
            System.out.println(e.getId()+"\t"+e.getName()+"\t"+e.getSal());
        }
        System.out.println("after sorting\n===============");
        Collections.sort(li, new Comparator<Employe>() {
            @Override
            public int compare(Employe o1, Employe o2) {
                return o1.getSal()>o2.getSal()?1:o1.getSal()<o2.getSal()?-1:0;
            }
        });
        
        for(ListIterator<Employe> e=li.listIterator(li.size());e.hasPrevious();)
        {
            Employe emp=e.previous();
            System.out.println(emp.getId()+"\t"+emp.getName()+"+\t"+emp.getSal());
        }

    }
}

@Getter
@Setter
@AllArgsConstructor
class Employe
{
    private int id;
    private String name;
    private double sal;
}