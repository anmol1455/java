
package collections;
import java.util.*;
public class hastable {
    public static void main(String args[]){
    Hashtable<Integer,String> ht=new Hashtable<Integer,String>();
    ht.put(20,"Anmol");
ht.put(30,"xyz");
ht.put(40,"abc");
ht.put(50,"pqr");
System.out.println(ht);
System.out.println(ht.get(20));
for(Map.Entry<Integer,String>e:ht.entrySet()){
System.out.println(e.getKey()+" "+e.getValue());
}
Enumeration<String> e=ht.elements();
while(e.hasMoreElements()){
System.out.println(e.nextElement());
}
ht.put(90,"ghj");
System.out.println(ht);
    }
    
}
