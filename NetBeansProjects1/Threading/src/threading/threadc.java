package threading;
import java.util.*;
public class threadc {
    public static void main(String args[])throws Exception{
    final demo1 d=new demo1();
    Thread t=new Thread(new Runnable(){
    public void run(){
    try{
    d.method1();
    }
    catch(Exception e){}
    }
    });
    Thread t2=new Thread(new Runnable(){
    public void run(){
    try{
    d.method2();
    }
    catch(Exception e){}
    }
    });
    t.start();
    t2.start();
    t.join();
    t2.join();
    }
}
class demo1 extends Thread
{
    public void method1() throws Exception{
    synchronized(this){
    System.out.println("method1 is running");
    System.out.println("method1 waiting for pressing 1 key");
    wait();
    System.out.println("method1 resumed");
    }
    }
    public void method2() throws Exception{
    Thread.sleep(1000);
    Scanner sc=new Scanner(System.in);
    synchronized(this){
    System.out.println("Press 1");
    int i=sc.nextInt();
    if(i==1){
    notify();
    }
    else {
    System.out.println("wrong input");
    }
    Thread.sleep(1000);
    }
    }
}
