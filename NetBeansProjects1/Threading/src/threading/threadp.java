package threading;
public class threadp {
    public static void main(String args[]){
    demo d=new demo();
    Thread t=new Thread(d,"t1");
    Thread t1=new Thread(d,"t2");
    Thread t2=new Thread(d,"t3");
    t.setPriority(1);
    t1.setPriority(10);
    t2.setPriority(4);
    t.start();
    t1.start();
    t2.start();
    }
    }
class demo implements Runnable{
public void run(){
System.out.println(Thread.currentThread().getName()+"is running with priority"+Thread.currentThread().getPriority());
}
}