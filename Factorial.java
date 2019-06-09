/*
                
                   Factorial of a number
                       num=5!
                       =5x4x3x2x1
                       or
                       =1x2x3x4x5
					   
			temp=1
			temp= 1  x 1  => i=1 
			 1  = 1  x 2      =2
			 2	= 2  x 3      =3
			 6	= 6  x 4      =4
			 24	= 24 x 5      =5 i<=5; i++
			 120=	 
            temp=temp x i
*/
import java.util.Scanner;
public class Factorial{
	public static void main(String[] args) {
       Scanner obj =new Scanner(System.in);
	   System.out.println("Enter Number");
	   int num =obj.nextInt();
	   int temp=1;
	   if(num==0)
	   {
		  System.out.println("Should not use zero"); 
	   }
       else if(num>0)//positive number
	   {
		   for(int i=1; i<=num; i++)
		   {
			   temp=temp*i;
		   }
		   System.out.println("Factorial of a number: "+temp);
	   }		   
	   else if(num<0)//negative number
	   {
		   for(int i=-1; i>=num; i--)// i=-1; i>=-5; i--
		   {
			   temp=temp*i;//-1,-2,-3,-4,-5
		   }
		   System.out.println("Factorial of a number: "+temp);
	   }		   
	   
	   
	}
}