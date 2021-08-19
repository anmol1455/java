
package security;
import java.util.*;
import java.security.MessageDigest;
public class Security {

    public static void main(String[] args)throws Exception
    {
            String msg;
            Scanner sc=new Scanner(System.in);
            System.out.println("enter string");
            msg=sc.nextLine();
          /*  char c[]=msg.toCharArray();
            for(int i=0;i<c.length;i++)
            {
                c[i]+=5;
                System.out.print(c[i]);
            }*/
          MessageDigest m=MessageDigest.getInstance("SHA-256");
          m.update(msg.getBytes());
           byte [] md=m.digest();
           System.out.println(md);
           StringBuffer output=new StringBuffer();
           for(int i=0;i<md.length;i++)
           {
               output.append(Integer.toHexString(0xFF+md[i]));
           }
           System.out.println(output);
    }
    
}
