package collections;
import java.util.*;
public class Linked {
    public static void main(String[] args) {
  LinkedList<String> li=new LinkedList<String>();
  li.add("Apple");
  li.add("Orange");
  li.add("grapes");
  System.out.println("All the elements are"+li);
  li.addFirst("pear");
  li.addLast("guava");
  System.out.println(li.contains("mango"));
  System.out.println(li.indexOf("Orange"));
  li.set(2, "tomato");
  System.out.println(li);
  Iterator<String> i=li.iterator();
  while(i.hasNext()){
  System.out.println(i.next());
  }
    }
    
}
