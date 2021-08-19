
package javaapplication1;

public class Cmtofeet {
        public static void main(String arg[]){
    len l1=new len(200,10);
    len l2=new len(500,15);
    len l3=new len();
    l3=l1.add(l2);
    l3.display();
    }
    }
class len{
int a,b,c;
public len(int x,int y){
a=x;
b=y;
c=0;
}
public len(){
a=0;
b=0;
c=0;
}
public void display(){
System.out.println("value of a is"+a);
System.out.println("value of b is"+b);
System.out.println("value of c is"+c);
}
len add(len s){
len l=new len();
l.a=a+s.a;
l.b=b+s.b;
int f=l.b/12;
int d=l.b%12;
if(f>1){
l.a=l.a+f;
l.b=d;
}
l.c=l.a+l.b;
return l;
}
}
