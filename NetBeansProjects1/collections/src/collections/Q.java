package collections;

import java.util.*;

public class Q {
public static void main(String args[]){
    Queue<Integer> q=new LinkedList<Integer>();
    for(int i=0;i<=5;i++){
    q.add(i);
    }
    System.out.println(q);
    System.out.println(q.contains(2));
    q.add(12);
    System.out.println(q);
    
    System.out.println(q.peek());
    System.out.println(q.poll());
    
}    
}
