
import java.io.BufferedInputStream;
import java.io.FileInputStream;



public class file {

    public static void main(String args[]) 
    {
      try
      {
          FileInputStream fin=new FileInputStream("change.txt");
          BufferedInputStream br=new BufferedInputStream(fin);
          int ch;
          while((ch=br.read())!=-1)
          {
              System.out.println((char)ch);
              
          }
          br.close();
          fin.close();
      }
      catch(Exception e)
      {
          System.out.println(e.getMessage());
      }
          System.out.println("reading complete....");
          
      }
    }
    

