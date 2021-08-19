import java.util.*;
public class office
{
    int id,sal,contno;
    String name,post,email;
    Scanner sc=new Scanner(System.in);
    void getid()
    {
        System.out.println("enter your id");
        id=sc.nextInt();
     }
      void disid()
    {
        System.out.println("enter your id"+id);
     }
      void getname()
      {
          System.out.println("enter your name");
          name=sc.next();
      }
      void disname()
      {
         System.out.println("enter your name"+name);
      }
      void getsal()
      {
          System.out.println("enter your salery");
          sal=sc.nextInt();
      }
      void dissal()
      {
         System.out.println("enter your salery"+sal);
      }
       void getcontno()
      {
          System.out.println("enter your contact no.");
          contno=sc.nextInt();
      }
      void discontno()
      {
         System.out.println("enter your contact no."+contno);
      }
      }
class manager extends office
{
    String dep;
    Scanner sc=new Scanner(System.in);
    public manager()
    {
         System.out.println(" Manager details......!!");
    }
    void getdep()
    {
       System.out.println(" enter your department");
        dep=sc.next();
    }
    void disdep()
    {
         System.out.println("  your department"+dep);
    }
}

class clerk extends office
{
    String man;
    Scanner sc=new Scanner(System.in);
    public clerk()
    {
         System.out.println(" clerk details......!!");
    }
    void getman()
    {
       System.out.println(" enter your manager");
        man=sc.next();
    }
    void disman()
    {
         System.out.println("  your department"+man);
    }
}

class use 
{
  public static void main(String args[])
         
  {
      String dep;
       manager m=new manager();
       clerk c=new clerk();
      Scanner Sc=new Scanner(System.in);
            int opt;
        do
      {
      System.out.println("Emp:\n1Manager \n2clerk \n3 Quit");
    
      opt=Sc.nextInt();
     
      switch(opt)
      {
        case 1:
                         System.out.println("Emp:\n1Entre details \n2Show details");
                         int opt1=Sc.nextInt();
                  switch(opt1) 
             {
                         case 1:         
                                     m.getid();
                                    m.getcontno();
                                   m.getdep();
                                  m.getname();
                                 m.getsal();
                                    break;
      
                        case 2:
      
                                    m.discontno();
                                   m.disdep();
                                  m.disid();
                                 m.disname();
                                m.dissal();
                                    break; 
                        default:
                                    System.out.println("wrong option");
      }
        break;
          
        case 2:
           
                     System.out.println("Clerk:\n1Entre details \n2Show details");
                     int opt2=Sc.nextInt();
      switch(opt2) 
    {
                case 1:
                                 c.getid();
                                c.getcontno();
                               c.getman();
                              c.getname();
                             c.getsal();
                                    break;
  
                case 2:
          
                                  c.discontno();
                                 c.disman();
                                c.disid();
                               c.disname();
                              c.dissal();
                                    break;

                default:
                                    System.out.println("wrong option");
}
           
           }
      }
      while(opt!=3);   
}
}
