class Selection
{
  public static void main(String[] args)
  {
          
	int arr[] = {3,4,7,2,6,5};
    int temp=0; 
	for(int i=0; i<arr.length; i++)//3,1st, 2nd, 3rd..
	{
		int index=i;//0
		for(int j=i+1; j<arr.length; j++)//4,7,2,6,5
		{
			if(arr[index]>arr[j])//3>2
			{
				index=j;//3=pos
			}
		}
		// 0 & 3 //swapping
		temp=arr[index];
		arr[index]=arr[i];
		arr[i]=temp;
		
		for(int k=0; k<arr.length; k++)
	    {
		 System.out.print(arr[k]+" ");
	    }
	     System.out.println("");
	}
	
	
  }
}