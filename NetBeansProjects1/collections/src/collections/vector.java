
package collections;
import java.util.*;
public class vector {
    public static void main(String args[]){
    Vector v=new Vector(3,2);
    v.add(new Integer(50));
      v.add(new Float(50.25));
      v.add(new Double(50.555));
      v.add(new String("Anmol"));
      System.out.println(v);
      v.addElement(52);
      System.out.println(v.capacity());
      v.elementAt(2);
      System.out.println(v);
      System.out.println(v.firstElement());
      Iterator i=v.iterator();
      while(i.hasNext()){
      System.out.println(i.next().toString());
      Vector<Integer> c=new Vector<Integer>();
      c.add(20);
      c.add(25);
      c.add(new Integer(56));
      System.out.println(c);
      }
    }
}
