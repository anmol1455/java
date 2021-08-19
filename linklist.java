
import java.util.LinkedList;
import java.util.Scanner;
 import java.util.*;

public class linklist 
{
   
    public static void main(String args[])
    {
        LinkedList<String> al=new LinkedList<String>();
        String arr[]=new String[100];
        int n,i=01
                ;
                Scanner sc=new Scanner(System.in);
       do
               {
                System.out.println("MAIN MENU");
                
       System.out.println("1.Insert Array Element");
       System.out.println("2.Insert element at a perticular position");
       System.out.println("3.Remove an element");
      System.out.println("4.Remove an element from a perticular position");
      System.out.println("5.Update array ");
      System.out.println("6.Searching");
      System.out.println("7.Search array element with index number");
      System.out.println("8.know the size of array");
      System.out.println("9.Clear array");
      System.out.println("10.visit to all the element");
        System.out.println("11.visit to all the element");
        System.out.println("12.visit to all the element");
          System.out.println("13.visit to all the element");
      n=sc.nextInt();
     
     switch(n)
             {
         case 1:  
                           for( i=0;i<=5;i++)
                           {
                         System.out.println("Insert array element");
                        String a=sc.next();
                        al.add(a);
                           }
                         System.out.println("Array element"+al);
                         break;
                       
         case 2:           
                         System.out.println("Enter string to insert") ;
                         String b=sc.next();
                         System.out.println("Enter the position") ;
                         int o=sc.nextInt();
                         al.add(o, b);
                       
                        System.out.println("Array element"+al);  
                            break;
                            
         case 3:    
                         System.out.println("Enter element which you to delete");
                         String a=sc.next();
                         al.remove(a);
                         if(al.isEmpty())
                             System.out.println("kuch daal to,tb naa delete kroge");
                         else
                             System.out.println("jaaa kr liya naa delete");
                        System.out.println("Array element"+al);
                        break;
                        
         case 4:    
                         System.out.println("Enter index number number");
                        int p=sc.nextInt();
                         al.remove(n);
                        System.out.println("Array element"+al);
                        break;
                        
         case 5:    
                         System.out.println("Enter element which you want to update ");
                         String d=sc.next();
                         System.out.println("Enter index ");
                         int x=sc.nextInt();
                         al.set(x, d);
                        System.out.println("Array element"+al);
                        break;         
                        
         case 6:    
                         System.out.println("Enter element which you want to search");
                         String e=sc.next();
                       boolean ser= al.contains(e);
                        if(ser==true)
                                System.out.println("element exist");
                        else
                                System.out.println("element not exist");
                        System.out.println("Array element=\t"+e);
                        break;   
                        
         case 7:    
                         System.out.println("Enter element which you to search ");
                        String f=sc.next();
                        System.out.println("enter index number");
                        int pos= al.indexOf(f);
                        System.out.println("ele present at"+(pos+1)+"position");
                        System.out.println("Array element"+al);
                        break;     
         case 8:
                         System.out.println("size of array list are:"+al.size());
                         break;
         case 9:                 
                    al.clear();
                     break;
                     
         case 10:
                         Iterator j=al.iterator();
                         int c=0;
                         while(j.hasNext())
                         {
                             c++;
                             System.out.println(c+" "+j.next());
                         }  
         case 11:
                         al.
                            
                         
    } 
} while(n!=15);
       }
}


    

