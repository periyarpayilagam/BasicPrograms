/*
book1) 12345	  i=5	    	  j=1,2,3,4,5    	       	 
book2) 1234			4   		  j=1,2,3,4  .. 1<=5,2<=5,3<=5,4<=5  
book3) 123		    3		      j=1,2,3   
book4) 12		    2			  j=1,2,
book5) 1		    1			  j=1,
			     i--, i>=1; 	j++,j<=i,	   

// */			
public class Pattern3
{
	public static void main(String[] args) {
		for(int i=5; i>=1; i--)
		{
			for(int j=1; j<=i; j++)
			{
				System.out.print(j);
			}
			System.out.println("");
		}
	}
}
