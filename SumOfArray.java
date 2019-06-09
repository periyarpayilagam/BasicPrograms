class SumOfArray
{
 public static void main(String[] args)
 {
	/*
    int tamil=60;
	int eng=55;
	int math=70;
	int sci=85;
	int ssc=75;
	*/ 
	int[] arr ={60,55,70,85,75};//arr.length;
	/*         //0,1,2,3,4 < 5
	System.out.println(arr[0]);
	System.out.println(arr[1]);
	System.out.println(arr[2]);
	System.out.println(arr[3]);
	System.out.println(arr[4]);
	*/
	 System.out.println("length"+arr.length);
	 int temp=0;
     for(int i=0; i<arr.length; i++)
	 {
		temp=temp+arr[i];
	 }		 
	 System.out.println("Sum of array of elements"+temp);
 
 }

}