
package threading;

public class mt {
    public static void main(String[] args) {
     //   myclass c=new myclass();
        myclass c=new myclass("Akhand");
        myclass c1=new myclass("Abhinav");
        Thread t=new Thread(c,"dsa");
        Thread t1=new Thread(c1,"dsa");
        t1.start();
        t.start();
    }
    }
class myclass extends Thread{
    String name;
    public myclass(String name){
    this.name=name;
    }
    public void fun1(){
    System.out.println("fun1 executing");
    }
    public void fun2(){
    System.out.println("fun2 executing");
    }
public void run(){
    for(int i=0;i<=5;i++){
//System.out.println("This is thread");
System.out.println(i+"This is thread"+name+Thread.currentThread().getName());

    try{
    Thread.sleep(1000);
    }
    catch(Exception E){}

fun1();
fun2();
}
}
}