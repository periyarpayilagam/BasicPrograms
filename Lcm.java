import java.util.Scanner;
class Lcm//Least Common Multiple 
{
    public static void main(String[] args)
   {
	 Scanner obj = new Scanner(System.in);
	 System.out.println("Enter Number1");
	 int num1 = obj.nextInt();
	 System.out.println("Enter Number2");
	 int num2 = obj.nextInt();
	
	 int r=0;int max;
	 int a = num1>num2 ? num1 :num2; // conditions?True:False;
	 int b = num1<num2 ? num1 :num2; // conditions?True:False;
	 
	 max=a;
	 do
	 {
		 if(max%a==0 && max%b==0)
		 {
			 System.out.println("LCM is: "+max);
			 break;
		 }
		 else
		 {
			 max++;
		 }
	 }
	 while(true);
	 
   }    
}