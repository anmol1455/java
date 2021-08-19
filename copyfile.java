import java.io.*;
import java.util.Scanner;
public class copyfile 
{
    public static void main(String args[])throws Exception
    {
        int ch;
        try
        {
            FileInputStream fin=new FileInputStream("anu.txt");
            FileOutputStream fout=new FileOutputStream("anu1.txt");
            String data="my name is anu";
           
            {
                while((ch=fin.read())!=-1)
                    fout.write(ch);
            }
            fout.close();
        }
            catch(Exception e)
            {
                System.out.println(e.getMessage());
            }   
        System.out.println("1file copied");
    }
}
