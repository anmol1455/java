import java.util.*;
class Sum
{
public static void main(String arg[])
{
int n;
int sum=0;
int i;
Scanner Sc=new Scanner(System.in);
System.out.println("Enter the value of n");
n=Sc.nextInt();
for(i=0;i<n;i++)
{
if(n>0)
{
sum=sum+i;
System.out.println("sum="+sum);
}
else
{
break;
}
}
}
}

