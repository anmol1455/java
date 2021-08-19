
package collections;
import java.util.*;
public class hashmap {
    public static void main(String args[]){
        
HashMap<Integer,String> hm=new HashMap<Integer,String>();

hm.put(20,"Anmol");
hm.put(30,"xyz");
hm.put(40,"abc");
hm.put(50,"pqr");
System.out.println(hm);
System.out.println(hm.get(20));
for(Map.Entry<Integer,String>e:hm.entrySet()){
System.out.println(e.getKey()+" "+e.getValue());
}
}
    
}
