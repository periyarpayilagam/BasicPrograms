class SecondMin
{
  public static void main(String[] args)
  {
          
		  int[] arr = {3,4,7,1,6,2};
		  
          int first=arr[0];
		  int second=arr[0];
          for(int i=0;i<arr.length;i++)
          {
			 	if(first>arr[i])//3>4,3>7, 3>1, 1>6, 1>2
                {
					second=first; //3
					first=arr[i]; //1
				}
                else if(arr[i]>	first) //2 >1
                {
					second=arr[i];
				}					
          }
          System.out.println("First Minimum is: "+first);
          System.out.println("Second Minimum is: "+second);
	}
}
