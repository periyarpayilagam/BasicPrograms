import java.util.Scanner;
class Linear
{
  public static void main(String[] args)
  {
          
		  int[] arr = {3,4,7,2,6,5};
		  Scanner obj =new Scanner(System.in);
		  System.out.println("Enter Number to Search");
		  int search=obj.nextInt();//6
          boolean check=false;
		  
		  for(int i=0; i<arr.length; i++)
		  {
			  if(search==arr[i])//6==3,6==4,6==7, 6==2, 6==6
			  {
				  check=true;
				  break;
			  }
		  }
		  if(check==true)
		  {
			  System.out.println(search+" is present in array");
		  }
		  else
		  {
			  System.out.println(search+" is not present in array");
		  }
	}
}
