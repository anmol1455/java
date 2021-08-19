
package collections;
import java.util.*;
public class set {
    public static void main(String args[]){
        
Set<Integer> s=new HashSet<Integer>();

s.add(10);
s.add(20);
s.add(30);
s.add(40);
System.out.println(s);
s.remove(40);
System.out.println(s);
System.out.println(s.contains(20));

}
    
}
