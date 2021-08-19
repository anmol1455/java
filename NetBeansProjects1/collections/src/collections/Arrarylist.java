
package collections;
import java.util.*;
public class Arrarylist {
    public static void main(String args[]){
    ArrayList<Integer> a=new ArrayList<Integer>();
    
    for(int i=1;i<=5;i++)
    {
        a.add(i);
    }
    System.out.println(a);
    a.add(2, 222);
    System.out.println(a);
    System.out.println(a.contains(222));
    System.out.println(a.get(3));
    a.set(4,44);
    System.out.println(a);
    a.remove(3);
    System.out.println(a);
    
    }
    
}
