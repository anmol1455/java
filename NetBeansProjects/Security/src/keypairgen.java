import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.Signature;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.util.*;
public class keypairgen {
    public static void main(String args[])throws Exception
    {   
        Scanner sc=new Scanner(System.in);
        KeyPairGenerator kpg=KeyPairGenerator.getInstance("DSA");
        kpg.initialize(1024);
        KeyPair kp=kpg.generateKeyPair();
        PrivateKey pk=kp.getPrivate();
        Signature sign=Signature.getInstance("SHAwithDSA");
        Signature sign1=Signature.getInstance("SHAwithDSA");
        System.out.println("Enter String");
        String s=sc.nextLine();
        sign.initSign(pk);
        byte [] by=s.getBytes();
        sign.update(by);
        byte [] si=sign.sign();
        System.out.println(si);
        String ss=si.toString();
        System.out.println(ss);
        sign1.initVerify(kp.getPublic());
        sign1.update(s.getBytes());
        if(sign1.verify(si))
        {
            System.out.println("Sign Matched");
        }
        else
        {
            System.out.println("Sign not Matched");
        }
    }
}
