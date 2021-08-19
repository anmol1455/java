
package javaapplication1;

import java.util.Scanner;


public class JavaApplication1 {

  
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
     int i,j = 0;
     int arr[][]=new int[5][5];
     int arr1[][]=new int[5][5];
     int c[][]=new int[5][5];
     System.out.println("enter array");
     for(i=0;i<3;i++)
     {
         for(j=0;j<3;j++)
         {
            arr[i][j]=sc.nextInt();
         }
     }
        System.out.println("enter array 2");
     for(i=0;i<3;i++)
     {
         for(j=0;j<3;j++)
         {
            arr1[i][j]=sc.nextInt();
         }
     }
     c[i][j]=arr[i][j]*arr1[j][i]; 
      for(i=0;i<3;i++)
     {
         for(j=0;j<3;j++)
         {
    System.out.println("multiplied"+c[i][j]);
}
}
    }
}
