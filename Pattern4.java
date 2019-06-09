/*
book1) 5	     i=5 	    	  j=5 -> 5>=5        	 
book2) 54		   4   		      j=5,4 -> 5>=4,4>=4
book3) 543		   3		      j=5,4,3 ->5>=3,4>=3,3>=3
book4) 5432		   2			  j=5,4,3,2->5>=2,4>=2,3>=2,2>=2
book5) 54321	   1			  j=5,4,3,2,1
			     i--, i>=1; 	j--,j>=i

*/   			
public class Pattern4
{
	public static void main(String[] args) {
		for(int i=5; i>=1; i--)
		{
			for(int j=5; j>=i; j--)
			{
				System.out.print(j);
			}
			System.out.println("");
		}
	}
}
