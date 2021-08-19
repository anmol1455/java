
package javaapplication1;


public class Inheritance {
int a,b,c;
public Inheritance(){
a=0;b=0;c=0;
}
public void calc(int a,int b){
c=a+b;
}
void display(){
System.out.println("Sum is \t"+c);
System.out.println("This is Super class");
}
    public static void main(String[] args) {
        // TODO code application logic here
       second obj=new second();
        obj.calc(10, 30);
        obj.display();
    }
}
class second extends Inheritance{
public second(){
System.out.println("this is sub class");
}
}
