import java.util.Scanner;
class Leap
{
    public static void main(String[] args)
   {
	 Scanner obj =new Scanner(System.in);
	 System.out.println("Enter Year");
	 int year =obj.nextInt();
	 if(year%4==0)//1996,2000,2100,2200,2400
	 {
		 if(year%100==0)//2000,2100,2200,2400
		 {
			 if(year%400==0) //2000,2400
			 {
				 System.out.println("Leap Year");
			 }
			 else//2100,2200
			 {
				System.out.println("Not Leap Year"); 
			 }
		 }
		 else //1996,2004
		 {
			  System.out.println("Leap Year");
		 }
		 
	 }
	 else
	 {
		 System.out.println("Not Leap Year");
	 }
	 
   }    
}