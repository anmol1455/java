import java.util.Scanner;
public class paisa
{
    public static void main(String args[])
    {
        float s;
        Scanner sc=new Scanner(System.in);
     System.out.println("Enter the amount");   
     int n=sc.nextInt();
     if(n>=2000)
     {
         s=n/2000;
         System.out.println("Notes of 2000 "+s);
         n=n%2000;
     }
     else
     {
         System.out.println("Notes of 2000 "+0);
     }
        if(n>=500)
        {
            s=n/500;
            System.out.println("Notes of 500 "+s);
            n=n%500;
        }
             else
     {
         System.out.println("Notes of 500 "+0);
     }
                if(n>=200)
        {
            s=n/200;
            System.out.println("Notes of 200 "+s);
            n=n%200;
        }
                     else
     {
         System.out.println("Notes of 200 "+0);
     }
                        if(n>=100)
        {
            float a=n/100;
            System.out.println("Notes of 100 "+a);
            n=n%100;
        }
                             else
     {
         System.out.println("Notes of 50"+0);
     }
                                if(n>=50)
        {
            float b=n/50;
            System.out.println("Notes of 50 "+b);
            n=n%50;
        }
                                        if(n>=10)
        {
            float c=n/10;
            System.out.println("Notes of 10 "+c);
            n=n%10;
        }
                 if(n>=5)
        {
            s=n/5;
            System.out.println("Notes of 5 "+s);
            n=n%5;
        }
                         if(n>=2)
        {
            s=n/2;
            System.out.println("Notes of 2 "+s);
            n=n%2;
        }
                                 if(n>=1)
        {
            s=n/1;
            System.out.println("Notes of 1 "+s);
        }
        
     }
    }
  
