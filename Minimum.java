class Minimum
{
  public static void main(String[] args)
  {
          
		  int[] arr = {3,4,7,2,6,5};
		  
          int temp=arr[0];
		  
          for(int i=0;i<arr.length;i++)//60
          {
        	  if(temp>arr[i]) //60>60,60>55 ,55>70,55>85, 55>75
        	  {
        		 temp=arr[i];//55
        	  }
          }
          System.out.println("Minimum values is: "+temp);
	}
}
