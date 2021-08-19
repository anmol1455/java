package threading;
public class Deadlock {
public static void main(String args[]){
Object seat=new Object();
Object birth=new Object();
Bt b=new Bt(seat,birth);
Ct c=new Ct(birth,seat);
Thread t=new Thread(b);
Thread t1=new Thread(c);
t.start();
t1.start();
}
}
class Bt extends Thread{
Object seat,birth;
public Bt(Object s,Object b){
this.seat=s;
this.birth=b;
}
public void run()
{
synchronized(seat){
System.out.println("Book ticket. holding available seats");
try{
Thread.sleep(1000);
}
catch(Exception E){}
System.out.println("waiting for seat allocation");
synchronized(birth){
System.out.println("Birth allocation");
}
}
}
}
class Ct extends Thread{
Object seat,birth;
//public Ct(Object b,Object s) for deadlock
public Ct(Object s,Object b)
{
this.seat=s;
this.birth=b;
}
public void run()
{
synchronized(birth){
System.out.println("Cancelled ticket. deallocating birth");
try{
Thread.sleep(1000);
}
catch(Exception E){}
System.out.println("waiting for seat increment");
synchronized(seat){
System.out.println("Seat increased. ticket cancelled");
}
}
}
}
