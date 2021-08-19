import java.io.*;
public class copy_file 
{
    public static void main(String args[])throws Exception
    {
        char ch;
        try
        {
            FileOutputStream fout=new FileOutputStream("annu.txt");
            DataInputStream d=new DataInputStream(System.in);
            System.out.println("write something..!!!!");
        
            while((ch=(char)d.read())!='@')
            {
                fout.write(ch);
            }
            fout.close();
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());          
        }
        System.out.println("file writting complete...!!!");
    }
            
}
