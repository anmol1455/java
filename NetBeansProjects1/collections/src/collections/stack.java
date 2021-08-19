
package collections;
import java.util.*;
public class stack {
    public static void main(String args[]){
 Stack<Integer> s=new Stack();
 s.push(20);
 s.push(30);
 s.push(40);
 s.push(50);
 System.out.println(s);
 Iterator<Integer> i=s.iterator();
 while(i.hasNext()){
 System.out.println(i.next());

 
 }
  s.pop();
 System.out.println(s);
  System.out.println(s.peek());
}
}
