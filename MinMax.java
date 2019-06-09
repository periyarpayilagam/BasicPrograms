class MinMax
{
  public static void main(String[] args)
  {
          
		  int[] arr = {3,4,7,2,6,5};
		  
          int min=arr[0];
		  int max=0;
          for(int i=0;i<arr.length;i++)
          {
        	  if(min>arr[i]) 
        	  {
        		 min=arr[i];
        	  }
			  if(arr[i]>max)
        	  {
        		 max=arr[i];
        	  }
          }
          System.out.println("Minimum values is: "+min);
          System.out.println("Maximum values is: "+max);
	}
}
