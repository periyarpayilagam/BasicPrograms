import java.util.Scanner;
class Grade
{
    public static void main(String[] args)
   {
	 Scanner obj =new Scanner(System.in);
	 System.out.println("Enter Mark");
	 int mark =obj.nextInt();
	 if(mark>100 || mark<0) //101,105, or -20
	 // {
		System.out.println("Should not use -ve or >100"); 
	 }
	 else
	 {
		 //Find Grade
		 if(mark>90 & mark<=100)//91 - 100
		 {
			System.out.println("Your Grade is : S"); 
		 }
		 else if(mark>80 & mark<=90)//81 - 90
		 {
			System.out.println("Your Grade is : A"); 
		 }
		 else if(mark>70 & mark<=80)//71 - 80
		 {
			System.out.println("Your Grade is : B"); 
		 }
		 else if(mark>60 & mark<=70)//61 - 70
		 {
			System.out.println("Your Grade is : C"); 
		 }
		 else if(mark>55 & mark<=60)//55 - 60
		 {
			System.out.println("Your Grade is : D"); 
		 }
		 else if(mark>=50 & mark<=55)//50 to 55
		 {
			System.out.println("Your Grade is : E"); 
		 }
		 else if(mark>=0 & mark<50)//91 - 100
		 {
			System.out.println("REAPPEAR"); 
		 }
	 }
	 
	}    
}