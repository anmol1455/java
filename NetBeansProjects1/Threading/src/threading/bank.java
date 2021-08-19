package threading;
public class bank {
    public static void main(String args[]){
    class1 c=new class1(4000);
    Thread t=new Thread(c,"xyz");
    Thread t1=new Thread(c,"abc");
    t.start();
    t1.start();
    }
}
class class1 extends Thread{
int amt;
int balance=10000;
public class1(int amt){
this.amt=amt;
}
public void run(){
synchronized(this){
if(amt<=balance){
System.out.println(Thread.currentThread().getName()+"withdraw"+amt);
try{
Thread.sleep(1000);
}
catch(Exception E){}
balance=balance-amt;
}
else
    System.out.println("insufficient balance");
}
System.out.println("Balance="+balance);
}
}