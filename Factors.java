import java.util.Scanner;
class Factors
{
    public static void main(String[] args)
   {
	 Scanner obj = new Scanner(System.in);
	 System.out.println("Enter Number");
	 int num = obj.nextInt();//7
	 int temp=0; 
	 System.out.println("Factors of a Number");
	 for(int i=1; i<=num; i++)//6
	 {
		 if(num%i==0)
		 {
			  System.out.println(i);//1,2,3,6 
		 }
		 
	 }
	 
	 
   }    
}