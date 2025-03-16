package theory;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.*;

public class SortCompEamp {
    public static void main(String[] args) {
        List<Integer> num = Arrays.asList(1, 2, 3, 4, 5, 6);
        Collections.sort(num);
        System.out.println(num);
        ArrayList<Fruits> fr = new ArrayList<>();
        fr.add(new Fruits(100, "Apple"));
        fr.add(new Fruits(300, "PineApple"));
        fr.add(new Fruits(50, "Custard Apple"));
        Collections.sort(fr, new Comparator<Fruits>() {
            @Override
            public int compare(Fruits o1, Fruits o2) {
                return o1.getPrice() > o2.getPrice() ? 1 : o1.getPrice() < o2.getPrice() ? -1 : 0;
            }
        });
        fr.forEach(t-> System.out.println(t.getName()+"\t"+t.getPrice()));

        Collections.sort(fr,(Fruits f1,Fruits f2)->f1.getName().compareTo(f2.getName()));
        fr.forEach(t-> System.out.println(t.getName()+"\t"+t.getPrice()));
    }
}

@AllArgsConstructor
@Getter
class Fruits
{
    private  int price;
    private String name;
}
