/*
book1) 1	(1 page)	  i=1	    	  j=1      1<=1	       	 
book2) 12	(1,2 page)		2   		  j=1,2    1<=2,2<=2
book3) 123		            3		      j=1,2,3  1<=3,2<=3,3<=3, 
book4) 1234		            4			  j=1,2,3,4 1<=4,2<=4,3<=4,4<=4
book5) 12345		        5			  j=1,2,3,4,5
			            i++, i<=5; 		  j++,j<=i	   

*/			
public class Pattern1
{
	public static void main(String[] args) 
	{
		for(int i=1; i<=5; i++)
		{
			for(int j=1; j<=i; j++)//1<=1, 1<=2,2<=2....
			{
				System.out.print(j);
			}
			System.out.println("");
		}
	}
}
