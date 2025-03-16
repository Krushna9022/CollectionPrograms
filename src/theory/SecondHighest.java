package theory;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SecondHighest {
    public static void main(String[] args) {
      Integer a[]=new Integer[]{1,2,3,4,5,5};
        List<Integer> li=new ArrayList<>(Arrays.asList(a));
        System.out.println(li);
        List<Integer> num= Arrays.asList(1,2,5,6,4,9,8,7);
        int max= Integer.MIN_VALUE;
        int sec=Integer.MIN_VALUE;
        for(Integer i:num)
        {
            if(i>max)
            {
                int temp=max;
                max=i;
                sec=temp;
            }
            else if(i>sec && i!=max)
            {
                sec=i;
            }
        }
        System.out.println(max+"\t"+sec);
    }
}
