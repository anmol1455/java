import java.util.*;
public class number
{int count=1;
    int n;
    void prime(int a)
    {     
        for(int i=2;i<=a/2;i++)
        {
if(a%i==0)
{

System.out.println("Number is not a prime");
break;
}
    }
if(count==0)
{
System.out.println("Number is prime");
}
    }
    void even(int a)
    {
        if(a%2==0)
        {
            System.out.println("given num is even ");
        }
        else
        {
            System.out.println("given number is odd");
            }
    }
    void armstrong(int a)
    {int sum=0;
    int org=a;
       while(a>0)
       {
           int r=a%10;
         sum  +=r*r*r;
           a=a/10;
         }
       if(sum==org)
       {
           System.out.println("num ia armstrong");
       }
       else
       {
           System.out.println("num is not armstrong ");
       }
    }
       void palindrome(int a)
       {int r;
       int org=a,sum=0;
           while(a>0)
           {
               r=a%10;
               sum=(sum*10)+r;
               a=a/10;
           }
           if(org==sum)
           {
               System.out.println("num is palindrome");
           }
           else
           {
               System.out.println("num is not palindrome");
           }
       }
    
    public static void main(String args[])
    {
        number n=new number();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the num");
      int  num=sc.nextInt();
        n.armstrong(num);
        n.prime(num);
        n.even(num);
        n.palindrome(num);
        
    }
}

}
