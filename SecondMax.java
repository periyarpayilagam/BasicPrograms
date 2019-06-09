class SecondMax
{
  public static void main(String[] args)
  {
          
		  int[] arr = {3,4,7,2,6,5};
		  
          int first=0;
		  int second=0;
          for(int i=0;i<arr.length;i++)
          {
			 if(arr[i]>first)
			 {
				 second=first;
				 first=arr[i];
			 }
             else if(arr[i]>second)
             {
				 second=arr[i];
			 }				 
          }
          System.out.println("First Maximum is: "+first);
          System.out.println("Second Maximum is: "+second);
	}
}
