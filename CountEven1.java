import java.util.Scanner;
class CountEven1
{
    public static void main(String[] args)
   {
	 Scanner obj =new Scanner(System.in);
	 int count=0;
	 int rem=0;
	 System.out.println("Enter Number");//12345
	 int num=  obj.nextInt(); 
	 for(int i=1; i<=5; i++) // 5 times 
	 {
		  rem =num%10;//12345%10==>5
		  if(rem%2==1)
		  {
			  count++;
		  }
          num=num/10; //   12345/10 ==>1234
	 }
	System.out.println("Number of Odd:"+count);
	 
}
}