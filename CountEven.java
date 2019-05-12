import java.util.Scanner;
class CountEven
{
    public static void main(String[] args)
   {
	 Scanner obj =new Scanner(System.in);
	 int count=0;
	 for(int i=1; i<=6; i++) // 6 times 
	 {
		  System.out.println("Enter Number"+i);//1,2,3,4,5,6
	      int num=  obj.nextInt(); 
		  if(num%2==0)//1,2,3,4,5,6   34%2 ==0 24%2==0 67%2==1
		  {
			  //count=count+1;
			  count++;
		  }
     
	}
	System.out.println("Number of Even:"+count);
	 
	 
	  
	   
   }
}