/*
     Example 371
	      = 3^3 + 7^3 + 1^3
		  = 27  + 343 + 1
		  = 371
	 Example 9474
	 
	      =9^4 + 4^4 + 7^4 + 4^4 = 9474
		  
	 Part 11 -> Sum of digits of a number
         num =371  (1, 7, 3)
		     
			 =1^3 + 7^3 + 3^3
			 
		temp=371

*/
import java.util.Scanner;
class Armstrong
{
    public static void main(String[] args)
   {
	 Scanner obj =new Scanner(System.in);
	 int temp=0;
	 int rem=0;
	 System.out.println("Enter Number");//371
	 int num=  obj.nextInt();
     int mem=num;	 
	 while(num>=1) 
	 {
		  rem =num%10;//371 (1,7,3) or 9474
		  temp=temp+rem*rem*rem*rem;
          num=num/10; //37,3
     }
     if(mem==temp)
	 {
		 System.out.println("Armstrong");
	 }
	 else// 123 => 27+8+1=>36
	 {
		System.out.println("Not Armstrong"); 
	 } 
}
}