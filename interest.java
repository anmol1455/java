import java.util.*;
public class interest
{
    float r=10,t=3;
    float interest(float pri)
    {
        float si=(pri*r*t)/100;
        System.out.println("simpe interest is="+si);
        return si;
    }
    
    float interest(float pri,float r,float t)
    {
        float si=(pri*r*t)/100;
        System.out.println("simpe interest is="+si);
        return si;
    }
    float interest(float pri,float r)
    {
        float si=(pri*r*t)/100;
        System.out.println("simpe interest is="+si);
        return si;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        interest in=new interest();
        System.out.println("Enter Principle amount,rate&time:=");
        float prin=sc.nextFloat();
         float rt=sc.nextFloat();
          int tm=sc.nextInt();
          float si=in.interest(prin);
                  si=in.interest(prin, rt);
                  si=in.interest(prin, rt, tm);
    }
    
    
}
