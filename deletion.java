
package trian;
 
import java.util.*;
public class deletion
{
    public static void main(String[] args) 
    {
       Scanner sc=new Scanner(System.in);
               int arr[]= new int[10];
               
               int n,m,i,count=0;
               
               System.out.println("Enter 10 array elements");
               for(i=0;i<10;i++)
               {
                   arr[i]=sc.nextInt();
               }
               System.out.println("enter the number to be deleted");
               n=sc.nextInt();
               for(i=0;i<10;i++)
               {
               if(n==arr[i])
               {
                  
                   System.out.println("num. is found");
                   System.out.println(" num is found and is position="+i);
                   for(int j=i;j<9;j++)
                   arr[j]=arr[j+1];
                   
                   System.out.println("updated arr is=");
                   for(i=0;i<9;i++)
                       System.out.println(arr[i]);
                   break;
               }   
    }   
    }
}
           