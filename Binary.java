import java.util.Scanner;
class Binary
{  
  public static void main(String[] args)
  {
          //half-interval search
		  
		  int[] arr = {12,16,22,24,28,30,32};
		  Scanner obj =new Scanner(System.in);
		  System.out.println("Enter Number to Search");
		  int search=obj.nextInt();//24, 16
          boolean check=false;
		  
		  int low=0;
		  int high=arr.length-1;
		  
		while(low<=high)
		{ 
				     int mid=(low+high)/2;
					  
					  if(search==arr[mid])
					  {
						  check=true;
					  }
					  else if(search<arr[mid])//0,1,2
					  {
						  high=mid-1;
							  if(search==arr[low])
							  {
								check=true;  
							  }
						  
					  }
					  
					  else if(search>arr[mid])//4,5,6
					  {
							  low=mid+1;
							  if(search==arr[low])
							  {
								check=true;  
							  }
							  
					  }
		  low++;
			  
		}
		  
		  
		  if(check==true)
		  {
			  System.out.println("Found");
		  }
		  else
		  {
			  System.out.println("Not Found");
		  }
		  
   }
}
