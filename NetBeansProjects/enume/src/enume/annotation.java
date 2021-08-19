package enume;
import java.util.*;
public class annotation {
    public static void main(String args[]){
    Hashtable h=new Hashtable();
    h.put(191,"apple");
      h.put(192,"banana");
      System.out.println(h);
      A o=new A();
      o.fun1();
    
    }
}
class A{
    @Deprecated
public void fun1(){
    @SuppressWarnings("unchecked")//works in notepad.
HashSet h1=new HashSet();
h1.add(200);
h1.add(201);
System.out.println(h1);

}
}
class B extends A{
    @Override //if given any other function it will produce errors
public void fun1(){
System.out.println("Class B function");
}
}