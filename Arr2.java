
import java.util.*;

public class Arr2 {

   
    public static void main(String[] args) 
    {
      int arr[][]=new int[6][4];
      int n;
      Scanner sc = new Scanner(System.in);

      for(int i=0;i<6;i++)
      {
          System.out.println("enter"+(i+1)+"row value");
          for(int j=0;j<4;j++)
          {
              arr[i][j]=sc.nextInt();
          }
      }
                      System.out.println("Roll\tMath\tEng\tHindi");
         for(int i=0;i<6;i++)
      {
           for(int j=0;j<4;j++)
          {
             
           System.out.print(arr[i][j]+"\t");
          }
            System.out.println("\n");
      }
          System.out.println("Enter roll number");
          n = sc.nextInt();
          for(int i=0;i<6;i++)
      {      
          
          
           if(arr[i][0]!=n)
             {
              System.out.println("roll number is not exit");
             }
               else  if(arr[i][0]==n)
              {    int p=i;
                 System.out.println("roll\tmath\teng\thindi");
                 for(int k=0;k<4;k++)
                 {
                System.out.print(arr[p][k]+"\t"); 
                
                 }
                 break;
             }
            
             System.out.println("\n");
      }

    }
    

}
    
