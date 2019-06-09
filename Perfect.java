import java.util.Scanner;
class Perfect
{
    public static void main(String[] args)
   {
	 Scanner obj = new Scanner(System.in);
	 System.out.println("Enter Number");
	 int num = obj.nextInt();//7
	 int temp=0;                  //7/7==0
	 for(int i=1; i<=num; i++)//6
	 {
		 if(num%i==0)
		 {
			 // temp=temp+i;//1,2,3  
		 }
		 
	 }
	 if(num==temp)
	 {
		System.out.println("Perfect Number"); 
	 }
	 else
	 {
		System.out.println("Not Perfect Number"); 
	 }
	 
	 
   }    
}