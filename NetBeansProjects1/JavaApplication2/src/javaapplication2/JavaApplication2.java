
package javaapplication2;

import java.util.Scanner;


public class JavaApplication2 {

    
    public static void main(String[] args) {
       int c[][]=new int[5][5];
       int i,j;
       
        int a[][]=new int[5][5];
        Scanner sc=new Scanner(System.in);
        System.out.println("first array");
        for(i=0;i<3;i++)
        { System.out.println("enter"+(i+1)+"student's detail");
            for(j=0;j<4;j++)
            {
                a[i][j]=sc.nextInt();
            }
        }
        System.out.println("Student's detail are \n");
        System.out.println("Roll no \t Math \t English ");
          for(i=0;i<3;i++)
        {
         
            for(j=0;j<4;j++)
            {
           System.out.println(a[i][j]+"\t"); 
            }        
                System.out.println("\n");
        }
           System.out.println("enter roll no to be searched");
           int se=sc.nextInt();
            System.out.println("required details are");
             System.out.println("Roll no \t Math \t English \t hindi ");
           for(i=0;i<3;i++)
        {
            for(j=0;j<4;j++)
            {
         if(a[i][0]==se)
                {
               
                  
                    System.out.println(a[i][j]+"\t");
           }
         
            }
        }
    }
    
}
