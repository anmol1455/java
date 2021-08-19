import java.util.*;
public class function 
{
        int t;
void sum(int a,int b)
{
   t=a+b;
   System.out.println("sum of a&b is="+t);
}
void sub(int a,int b)
{
    t=a-b;
     System.out.println("sub of a&b is="+t);
}
void multi(int a,int b)
{
    t=a*b;
     System.out.println("Multiplicatio of a&b is="+t);
}
void Div(int a,int b)
{
    t=a/b;
     System.out.println("Div of a&b is="+t);
}
public static void main(String args[])
{
    Scanner sc=new Scanner(System.in);
            
    function c=new function();
    
    
        System.out.println("ENter value of x & y");
        int x=sc.nextInt();
        int y=sc.nextInt();
        while(true)
    {
        System.out.println("Select OPeration:-\n1 Add\n2 Sub\n3 Multiply\n4 Division\n5 Exit");
        
        int ch=sc.nextInt();
       
        switch(ch)
        {
            case 1:
                {
            c.sum(x,y);
             break;
        }
            case 2:
            {
                c.sub(x, y);
                break;
            }
            case 3:
            {
                c.multi(x, y);
                break;
            }
            case 4:
            {
                c.Div(x, y);
                break;
            }
            case 5:
                break;
            default:
                System.out.println("wrong Option Selected");
        }
        if(ch==5)
        {
          break;      
                         
        }
                
        }
        
    }
    
}
        