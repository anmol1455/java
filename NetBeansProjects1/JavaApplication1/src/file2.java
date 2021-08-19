
import java.io.DataInputStream;
import java.io.FileOutputStream;


public class file2 {
    public static void main(String args[])
           
    {
        try
        {
        DataInputStream dis=new DataInputStream(System.in);
        FileOutputStream fout=new FileOutputStream("change.txt",true);
        char ch;
        System.out.println("write something");
        while ((ch=(char)dis.read())!='@')
        {
          fout.write(ch);  
        
         }
        
        fout.close();
        }
        catch(Exception e)
                {
                    System.out.println(e.getMessage());
                }
    }
        }   
        
    
    

