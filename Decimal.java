import java.util.Scanner;
class Decimal
{
    public static void main(String[] args)
   {
	 Scanner obj =new Scanner(System.in);
	 double temp=0;  int rem=0; int count=0;
	 System.out.println("Enter Binary Number");//1110
	 int num=  obj.nextInt(); 
	 while(num>=1)
	 {
		  rem =num%10;//1110%10==>0, 1, 1, 1
		  double product=rem*Math.pow(2,count);//0,1,2,3
		  temp=temp+product;
          num=num/10; //   1110/10 ==>111,11,1
		  count++;
	 }
	int result=(int)temp; //Type Casting
	System.out.println("Binary to Decimal:"+result);	 
}
}