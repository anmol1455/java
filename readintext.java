import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.Scanner;


public class readintext 
{
    public static void main(String args[])throws Exception
    {
        FileWriter fw=new FileWriter("annu.txt",true);
        BufferedWriter br=new BufferedWriter(fw);
        Scanner sc=new Scanner(System.in);
        System.out.println("enter data");
        String data=sc.next();
        br.write(data);
        br.close();
        fw.close();
        System.out.println("Writing Complete...!!!!");
    } 
           
}
