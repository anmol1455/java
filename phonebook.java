
import java.util.HashMap;
import java.util.Scanner;
import java.lang.*;
public class phonebook 
{
    public static void main(String args[])
    {
     
        HashMap<String,Integer> hs=new  HashMap<String,Integer>();
        Scanner sc=new Scanner(System.in);
        int ct=0;
        System.out.println("enter the number of contacts in your phonebook");
        int n=sc.nextInt();
         for(int i=0;i<=(n-1);i++)
        {
            ct++;
        System.out.println( "enter the name ");
     String name=sc.next();
        System.out.println("enter number");
        int num=sc.nextInt();
       
            hs.put(name, num);
        }
         System.out.println(hs);
    }
}
