import java.util.Scanner;
class Calc
{
    public static void main(String[] args)
   {
	 Scanner obj =new Scanner(System.in);
	 
	 System.out.println("Enter Number1");
	 int num1 =obj.nextInt(); //20
	 
	 System.out.println("Enter Number2");
	 int num2 =obj.nextInt(); //10	
	 
	 System.out.println("Enter Operator");
	 char x = obj.next().charAt(0); //+, -, *,/ , "Hello"
	 
	 
	 switch(x) // +, -, *, / if(x=='+' || x!='+')
	 {
		case '+':
        System.out.println(num1+num2);	
        break;
		case '-':
        System.out.println(num1-num2);	
        break;
		case '*':
        System.out.println(num1*num2);	
        break;
		case '/':
        System.out.println(num1/num2);	
        break;
		
	 }
	 
	 
   }
	 
}
