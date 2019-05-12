import java.util.Scanner;
class Reverse
{
    public static void main(String[] args)
   {
	 Scanner obj =new Scanner(System.in);
	 int temp=0;  int rem=0; 
	 System.out.println("Enter Number to Reverse");//12345
	 int num=  obj.nextInt(); 
	 while(num>=1)
	 {
		  rem =num%10;//12345%10==>5,4,3,2,1
		  temp=temp*10+rem;//5,54,543,5432,54321
          num=num/10; // 1234,123,12,1  
	 }
	System.out.println("Reversed Number is:"+temp);	 
}
}