import java.util.Scanner;
import java.lang.String;
public class str 
{
    public static void main(String args[])
    { 
        char s;
        boolean flag=true;
        Scanner sc=new Scanner(System.in);
        String arr[]=new String[10];
        System.out.println("enter the number of element");
        int n=sc.nextInt();
        System.out.println("Enter names");
        for(int i=0;i<n;i++)
        {
        arr[i]=sc.next();
        }
        System.out.println("enter the name do u want to search");
        String c=sc.next();
        for(int i=0;i<n;i++)
        {
             s=arr[i].charAt(0);
          if(arr[i].startsWith(c)) 
          {
              flag=false;
             System.out.println(arr[i]); 
          }
          if(flag==true)
          {
              System.out.println("name not exist");
          }
        }            
}
}
