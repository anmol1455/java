
package search;

 
import java.util.*;
public class Search
 {
    public static void main(String[] args) 
    {
       Scanner sc=new Scanner(System.in);
               int arr[]= new int[10];
               
               int n,i,count=0;
               
               System.out.println("Enter 10 array elements");
               for(i=0;i<10;i++)
               {
                   arr[i]=sc.nextInt();
               }
               System.out.println("enter the number to be search");
               n=sc.nextInt();
               for(i=0;i<10;i++)
               {
               if(n==arr[i])
               {
                  
                   System.out.println("num. is found");
                   System.out.println(" num is found and is position="+i);
                   count++;
                   System.out.println("num is pre="+count);
                        
                   break;
               }
               else if(i==9)
               {
               System.out.println("num not found");
               
               }               
               }   
    }           
              
    
}
