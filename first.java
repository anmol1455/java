import java.util.*;
public class first 
{
    int id;
    String name;
    void setid(int id)
    {
        this.id=id;
    }
    void setname(String name)
    {
        this.name=name;
    }
    int getid()
    {
        return id;
    }
    String getname()
        {
           return name; 
        }
}
class stud extends first
{
String course;
void setcourse(String course)
{
    this.course=course;
}
String getcourse()
{
    return course;
}
}
class third
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
stud obj=new stud();
obj.setid(int x);
obj.setname()
System.out.println("Enter your name");
name=sc.nextString();


}
}
