
import java.util.Scanner;


public class Restaurants {

    static int sn=0;
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        boolean quit= false;
        int sum=0;
        int wine=200,cold=20,bear=400,juice=100,pizza=500,burger=250,dosa=350,icecream=50,fries=25;
        double tax,total;
        String order="";
        
        do{
            System.out.println("ITEM"+"\t\tPrice");
            System.out.println("1.Wine"+"\t\t"+"200");
            System.out.println("2.ColdDrink"+"\t"+"20");
            System.out.println("3.Bear"+"\t\t"+"400");
            System.out.println("4.Juice"+"\t\t"+"100");
	    System.out.println("5.pizza"+"\t\t"+"500");
	    System.out.println("6.burger"+" \t"+"250");
	    System.out.println("7.dosa"+"\t\t"+"350");
            System.out.println("8.Icecream"+"\t"+"50");
            System.out.println("9.fries"+"\t\t"+"25");
            System.out.println("10.Quit");
            
            int choice=sc.nextInt();
            
            switch(choice){
                case 1:                             System.out.println("Wine"+"\n");
		                   System.out.println("enter number of bottles");
			int b=sc.nextInt();
                                                          sum=sum+(b*wine);
                                                          System.out.println(+b  +"--wine  "+"  prize  "+(b*wine));
                    sn++;
                                                        order=order.concat(sn+"\t|\t"+b+"\t|\t"+"wine"+"\t|\t"+"@"+wine+"\t|\t"+(b*wine)+"\n");  
                    break;
                    case 2:

                                                          System.out.println("ColdDrink");
			 System.out.println("enter number of bottles");
			 int c=sc.nextInt();
                                                          sum=sum+(c*cold);
                                                          System.out.println(+c  +"--Cold drink  "+"  prize  "+(c*cold));
                    sn++;
                                                          order=order.concat(sn+"\t|\t"+c+"\t|\t"+"ColdDrink"+"\t|"+"@"+cold+"\t|\t"+(c*cold)+"\n");
                   break;
                   case 3:
                                                          System.out.println("Bear");
 			System.out.println("enter number of bottles");
			int d=sc.nextInt();
                                                          sum=sum+(d*bear);
                                                         System.out.println(+d  +"--bear  "+"  prize  "+(d*bear));
                   sn++;
                                                         order=order.concat(sn+"\t\t"+d+"\t\t"+"Bear" +"\t\t"+"@ "+bear+"\t\t"+(d*bear)+"\n");
                   break;
                  case 4:
                                                          System.out.println("Juice");
			 System.out.println("enter number of bottles");
			 int e=sc.nextInt();
                                                           sum=sum+(e*juice);
                                                          System.out.println(+e  +"--Juice  "+"  prize  "+(e*juice));
                    sn++;
                                                          order=order.concat(sn+"\t\t"+e+"\t\t"+"Juice"+"\t\t"+"@"+juice+"\t\t"+(e*juice)+"\n");
                    break;
                    case 5:
                                                          System.out.println("pizza"+"\n");
                                                          System.out.println("enter number of pizzas");
                  			 int f=sc.nextInt();
                                                          sum=sum+(f*pizza);
                                                          System.out.println(+f  +"--pizza  "+"  prize  "+(f*pizza));
                    sn++;
                                                          order=order.concat(sn+"\t\t"+f+"\t\t"+"pizza"+"\t\t"+"@"+pizza+"\t\t"+(f*pizza)+"\n");                     
                   break;
                  case 6:
                                                           System.out.println("burger"+"\n");
			 System.out.println("enter number of burger");	
			 int g=sc.nextInt();
                                                           sum=sum+(g*burger);
                                                           System.out.println(+g  +"--burger  "+"  prize  "+(g*burger));
                    sn++;
                                                           order=order.concat(sn+"\t\t"+g+"\t\t"+"burger"+"\t\t"+"@"+burger+"\t\t"+(g*burger)+"\n");         
                   break;
                   case 7:
                                                          System.out.println("dosa"+"\n");
 			System.out.println("enter number of dosas");
			int h=sc.nextInt();
                                                          sum=sum+(h*dosa);
                                                          System.out.println(+h  +"--dosa  "+"  prize  "+(h*dosa));
                   sn++;
                                                         order=order.concat(sn+"\t\t"+h+"\t\t"+"dosa"+"\t\t"+"@"+dosa+"\t\t"+(h*dosa)+"\n");                   
                  break;
                  case 8:
                                                          System.out.println("icecream"+"\n");
                                                          System.out.println("enter number of icecreams");
			 int i=sc.nextInt();
                                                          sum=sum+(i*icecream);
                                                          System.out.println(+i  +"--wine    "+"  prize  "+(i*icecream));
                  sn++;
                                                          order=order.concat(sn+"\t\t"+i+"\t\t"+"icecream"+"\t"+"@"+icecream+"\t\t"+(i*icecream)+"\n");                     
                 break;
                 case 9:
                                                           System.out.println("fries"+"\n");
                                                           System.out.println("enter number of fries");
			  int j=sc.nextInt();
                                                           sum=sum+(j*fries);
System.out.println(+j  +"--fries  "+"  prize  "+(j*fries));
sn++;
                                                           order=order.concat(sn+"\t\t"+j+"\t\t"+"fries"+"\t\t"+"@"+fries+"\t\t"+(j*fries)+"\n");
                        
                    break;
                case 10:
                                                           quit=true;
                        
                        
                    break;

                default:
                                                           System.out.println("Wrong input");
            }

                                                           System.out.println("you want to order again??");
        }
                               while(!quit);
                                                             tax=sum*.18;
                                                             total=sum+tax;
                                                            
                                                             System.out.println("Your Orders are:\n");
                                                             System.out.println("__________________________________________________________________________"+"\n");
                                                             System.out.println("S.No."+"\t\t"+"Qty"+"\t\t"+"Items"+"\t\t"+"Prize"+"\t\t"+"Total"+"\n"+"__________________________________________________________________________"+"\n");
                                                             System.out.println(order);
                                                             System.out.println("__________________________________________________________________________"+"\n");
			    System.out.println("Your bill without tax:\n"+sum);
                                                             System.out.println("Your total bill="+total);    
                                                             System.out.println("Thank you");
    }
    
}
