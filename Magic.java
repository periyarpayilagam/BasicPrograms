import java.util.Scanner;
class Magic
{
    public static void main(String[] args)
   {
	 Scanner obj = new Scanner(System.in);
	 System.out.println("Enter Number1");
	 int num1 = obj.nextInt();
	 System.out.println("Enter Number1");
	 int num2 = obj.nextInt();
	 +, -, * , /, %
	 //Ternary(Conditional)
	 
	 int a = num1>num2 ? num1 :num2; // conditions?True:False;
	 int b = num1<num2 ? num1 :num2; // conditions?True:False;
	 System.out.println("Number1: "+a);
	 System.out.println("Number2: "+b);
	 
   }    
}