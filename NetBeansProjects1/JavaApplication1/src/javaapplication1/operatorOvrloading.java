package javaapplication1;
public class operatorOvrloading {
    public static void main(String arg[]){
    bc s1=new bc(200);
    bc s2=new bc(500);
    bc s3=new bc();
    s3=s1.add(s2);
    s3.display();
    }
    }
class bc{
int a;
public bc(int x){
a=x;
}
public bc(){
a=0;
}
public void display(){
System.out.println("value of a is"+a);
}
bc add(bc s){
bc temp=new bc();
temp.a=a+s.a;
return temp;
}
}