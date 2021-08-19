
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @author hp
 */ 
public class FuncOverloading {
int a,b,c;
  
public static void main(String[] args) {
        // TODO code application logic here
    // four obj=new four("Anmol","Akhand");
       second2 s=new second2();
      s.add(20,90,40);
    }
}


class third{
public third(String name){
System.out.println("this is super class"+name);
}

}
class four extends third{
    public four(String name,String tname){
    super(name);
    System.out.println("this is sub class"+tname);
    }
            
}
/*public FuncOverloading(){
a=0;b=0;c=0;
}
public void calc(int a,int b){
c=a+b;
}
void display(){
System.out.println("Sum is \t"+c);
System.out.println("This is Super class");
}*/
   
class second1{
public void msg(){
System.out.println("this is super class");
}}
class second2 extends second1{
    public void msg(){
    super.msg();
    System.out.println("this is sub class function");
    }
    public void add(int a,int b,int c){
    System.out.println(a+b+c);
    }
      public void add(int a,int b){
    System.out.println(a+b);
    }       
}
