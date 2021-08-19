import java.util.*;
public class sumover1
{
    int sum(int a,int b)
    {
            int c=a+b;
            System.out.println("sum int int is:="+c);
            return c;
    }
    int sum(float a,int b)
    {
        float c=a+b;
        System.out.println("sum float int is:="+c);
        return c;
        
    }
    int sum(int a,float b)
    {
        float c=a+b;
        System.out.println("sum  int float is:="+c);
        return c;
     }
    int sum(float a,float b)
    {
        float c=a+b;
        System.out.println("sum  float float is :="+c);
        return c;
    }
            public static void main(String args[])
            {
                    Scanner sc=new Scanner(System.in);
                    sumover so=new sumover();
                    System.out.println("enter the value of a & b");
                   float x=sc.nextFloat();
                    float y=sc.nextFloat();
                    int c=so.sum(x, y);
                     c=so.sum(x, y);
                     c=so.sum(x, y);
                    c=so.sum(x, y);
            }  
                    
        }
