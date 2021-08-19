import java.util.*;
class Doc
{
public static void main(String arg[])
{
  int n;
float f;
char c;
String s;
Scanner Sc=new Scanner(System.in);
System.out.println("Enter the roll no n");
n=Sc.nextInt();
System.out.println("Enter the name s");
s=Sc.next();
System.out.println("Enter fee f");
f=Sc.nextFloat();
System.out.println("Enter gender c");
c=Sc.next().charAt(0);
System.out.println("Roll is="+n);
System.out.println("Name="+s);
System.out.println("Fee="+f);
System.out.println("Gender="+c);
}
}