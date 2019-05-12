import java.util.Scanner;
class GreatestN
{
    public static void main(String[] args)
   {
	 Scanner obj =new Scanner(System.in);
	 int temp=0;
	 for(int i=1; i<=4; i++) // 4 times 
	 {
		  System.out.println("Enter Number"+i);//1,2,3,4
	      int num=  obj.nextInt(); 
		  if(num>temp)//2,1,3,4
		  {
			  temp=num;//4
		  }
     
	}
	System.out.println("Greatest:"+temp);
	 
	 
	  
	   
   }
}