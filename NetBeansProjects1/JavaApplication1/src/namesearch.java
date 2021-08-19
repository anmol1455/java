import java.util.Scanner;
public class namesearch {
    public static void main(String args[])
    {
        String alpha;int i;
     Scanner sc=new Scanner(System.in);
     String name[]=new String[30];
     System.out.println("enter 5 names");
     for(i=0;i<=5;i++)
     {
         name[i]=sc.nextLine();
     }
      System.out.println("enter index upto which name to be checked ");
     alpha=sc.next();
     boolean flag=true;
              for(i=0;i<=5;i++)
              {
                 if(name[i].startsWith(alpha))
                 {
                     flag=false;
                     System.out.println(name[i]);
                 }
                 if (flag==true)
                     System.out.println("not found");
             
              }
      
          
    }
}
