package collections;
public class generic<T> {
public static void main(String args[]){
generic_exp<Integer> i=new generic_exp<Integer>();
generic_exp<Float> f=new generic_exp<Float>();
generic_exp<String> s=new generic_exp<String>();
i.add(50);
s.add("Anmol");
f.add(80.22f);
System.out.println("Integer"+i.get());
System.out.println("String"+s.get());
System.out.println("Float"+f.get());
Integer arr[]={10,20,30,40};
String str[]={"banana","apple","grapes","mango"};
normal.display(arr);
normal.display(str);
}    
}
class generic_exp<T>
{
private T value;
void add(T v){
this.value=v;
}
T get(){
return this.value;
}
}
class normal
{
public static <E> void display(E arr[])
{
for(E i:arr){
System.out.println(i+"\t");
}
}
}
