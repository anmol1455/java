
package enume;
import java.util.*;
public class Enume {
enum course{
python(8000,40),
c(5000,39),
php(10000),
java(7896);
int price,duration;
course(int p,int d){
this.price=p;
this.duration=d;
}
course(int p){
this.price=p;
}
int getprice(){
return this.price;
}
int getduration(){
return this.duration;
}
static void display(int i){
course a[]=course.values();
System.out.println("course is "+a[i]+a[i].name()+"fees "+a[i].price);

}
}

    public static void main(String[] args) {
      course c[]=course.values();
      System.out.println("id\tcourse\tfee\tduration");
      for(int i=0;i<c.length;i++){
      int j=c[i].ordinal();
      System.out.println(j+"\t"+c[i]+"\t"+c[i].getprice()+"\t"+c[i].getduration());
      }
     /* Scanner sc=new Scanner(System.in);
      System.out.println("select course");
      int opt=sc.nextInt();
      course.display(opt);*/
    }
    
}
