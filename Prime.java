import java.util.Scanner;
class Prime
{
    public static void main(String[] args)
   {
	 Scanner obj =new Scanner(System.in);
	 System.out.println("Enter Number");
	 int num =obj.nextInt();//7
	 boolean check=false;
	 for(int start=2; start<num; start++)//7%2,7%3...7%6
	 {
		 if(num%start==0)//2,3,4,5,6,
		 {
			 System.out.println(start);
			 check=true;
			 break;//To reduce the comparison
		 }
	 }
	 if(check==true)
	 {
		 System.out.println("Not Prime Number");
	 }
	 else
	 {
		 System.out.println("Prime Number");
	 }
	 
	 
	 
   }    
}