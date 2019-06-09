// import java.util.Scanner;
class Fibo
{
    public static void main(String[] args)
   {
	 int temp=0;  
	 int first=0; 
	 int second=1;
	 for(int i=1; i<=8;i++)// 8 times
	 {
		 System.out.print(first+" ");
		 temp=first+second;
		 first=second;
		 second=temp;
	 }
// }    
}