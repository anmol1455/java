import java.util.*;
public class marks 
{
    int total(int a,int b,int c)
    {
        int d=a+b+c;
        System.out.println("total is:"+d);
        return d;
    }
    int per(int d)
    {
        int e=d/3;
        System.out.println("Percentage is:"+e);
        return e;
    }
    void div(int e)
    {
        if(e>=75&&e<=100)
        {
            System.out.println("1st division");
        }
        else if(e>=45&&e<=75)
        {
            System.out.println("2nd division");
        }
        else if(e>=33&&e<=45)
        {
            System.out.println("3rd division");
        }
        else
        {
            System.out.println("fail");
        }
    }
public static void main(String arg[])
{
    Scanner sc=new Scanner(System.in);
    marks mk=new marks();
    System.out.println("Enter the marks");
    int x=sc.nextInt();
    int y=sc.nextInt();
    int z=sc.nextInt();
    int d=mk.total(x, y ,z);
    int e=mk.per(d);
    mk.div(e);
        }
    }

