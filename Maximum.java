class Maximum
{
  public static void main(String[] args)
  {
          
		  int[] arr = {3,4,7,2,8,5};
		  
          int temp=0;
		  
          for(int i=0;i<arr.length;i++)
          {
        	  if(arr[i]>temp)//3>0,4>3,7>4,2>7,8>7,5>8
        	  {
        		 temp=arr[i];//3,4,7,8
        	  }
          }
          System.out.println("Maximum values is: "+temp);
	}
}
