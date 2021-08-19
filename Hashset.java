
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
public class Hashset
{
    public static void main(String args[])
    {
        int count=0,x;
        HashSet<String> h=new HashSet<String>();
        Scanner sc=new Scanner(System.in);
         do
               {
                System.out.println("MAIN MENU");
                
       System.out.println("1.Create list");
       System.out.println("2.Add element in list");
       System.out.println("3.Remove an element");
      System.out.println("4.Check whether the list is empty or not");
      System.out.println("5.Clear array");
     System.out.println("6.Exit");
       x=sc.nextInt();
     
     switch(x)
             {
         case 1:
                     System.out.println("Enter the number of element");
                     int n=sc.nextInt();
                     System.out.println("enter element");
                     for(int i=0;i<=(n-1);i++)
                 {
                    String name=sc.next();
                     h.add(name);
                 }   
                      Iterator ii=h.iterator();
                       while(ii.hasNext())
                 {
                         count++;
                         String m=ii.next().toString();
                        System.out.println(count+" "+m);
                  }
                       break;
                       
         case 2:
                    
                    System.out.println("enter element which u wny]t to add");
                   String o=sc.next();
                   h.add(o);
                   System.out.println(h);
        break;
         case 3:
             
                      System.out.println("enter the element which u wnt to be dlt");
                     String p=sc.next();
                      if(h.contains(p))
                      {
                         System.out.println("element exist");
                      h.remove(p);
                       System.out.println("element deleted");
                      }
                     else
                     {
                  System.out.println("Element dose't exist");
                    }
                 System.out.println(h);
                 break;
         case 4:
                     if(h.isEmpty())
                     {
                         System.out.println("list is empty");
                     }
                     else
                     {
                       System.out.println("list is not empty");
                         System.out.println("Size of list is"+h.size());}
                         break;
                         
          case 5:
                        h.clear();
                        System.out.println("your list is empty\n"+h.size()+"=this is the size of your list ");
                        break;
               }
         }while(x!=6);
    }
}
