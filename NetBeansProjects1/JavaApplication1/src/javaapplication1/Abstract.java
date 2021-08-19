
package javaapplication1;


public class Abstract {
public static void main(String args[]){
mine m=new mine();
first m1=new mine();
m.abs();
m.fun1();
m.fun3();
m1.abs();
m1.fun1();


}    
}
abstract class first{
void fun1(){
System.out.println("This is normal function");
}
abstract void abs();
}
class mine extends first implements myinter{
    void abs(){
    System.out.println("this is abstract function implementation in child class");
    }
public void fun3()
{
System.out.println(a);
}
}
interface myinter{
int a=43;
void fun3();
}
