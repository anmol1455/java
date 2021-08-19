/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package update;

/**
 */

 
import java.util.*;
public class Update 
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
                   arr[i]=95;
                   System.out.println("updated arr is=");
                   for(i=0;i<10;i++)
                       System.out.println(arr[i]);
               }   
    }   
    }
}
            