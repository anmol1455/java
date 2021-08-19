
import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;



public class file4 {

    public static void main(String args[]) 
    {
        
      try
      {
          FileInputStream fin=new FileInputStream("change.txt");
          FileOutputStream fout=new FileOutputStream("ardu.txt");
          FileOutputStream foutt=new FileOutputStream("asmu.txt");
          FileOutputStream fouttt=new FileOutputStream("afdu.txt");
          FileOutputStream foutttt=new FileOutputStream("adty.txt");
          int ch;
          while((ch=fin.read())!=-1)
          {
              fout.write(ch);
              foutt.write(ch);
              fouttt.write(ch);
              foutttt.write(ch);
              
          }
          fout.close();
          fin.close();
      }
      catch(Exception e)
      {
          System.out.println(e.getMessage());
      }
          System.out.println("4 files cpied finally after a lot of efforts....");
          
      }
    }
    


