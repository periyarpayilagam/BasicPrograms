import java.util.Scanner;
class Gcd//Greatest Common Divisor
{
    public static void main(String[] args)
   {
	 Scanner obj = new Scanner(System.in);
	 System.out.println("Enter Number1");
	 int num1 = obj.nextInt();
	 System.out.println("Enter Number2");
	 int num2 = obj.nextInt();
	
	 int r=0;
	 int a = num1>num2 ? num1 :num2; // conditions?True:False;
	 int b = num1<num2 ? num1 :num2; // conditions?True:False;
	 while(a%b!=0)
	 {
		 r=a%b;
		 a=b;
		 b=r;
	 }
	 System.out.println("GCD is: "+r);
   }    
}