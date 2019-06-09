class Bubble
{
  public static void main(String[] args)
  {
    /* compares adjacent pairs and swaps them 
	   if they are in the wrong order 
    */	 
	int arr[] = {3,4,7,2,6,5,-1,8,10,-2};
    int temp=0; 
	
	for(int i=0; i<arr.length; i++)
	{
		for(int j=0; j<arr.length-1; j++)
		{
			if(arr[j]>arr[j+1])//7
			{
				temp=arr[j];
				arr[j]=arr[j+1];
				arr[j+1]=temp;
				
			}
		
		}
		
	}
	
	    for(int k=0; k<arr.length; k++)
	    {
		 System.out.print(arr[k]+" ");
	    }
	
	
  }
}