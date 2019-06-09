/*
54321		  i=1		             	j=5,4,3,2,1 
5432			2   					j=5,4,3,2 	  	
543			`   3						j=5,4,3		 
54			    4						j=5,4		 
5			    5	       		        j=5
               i<=5, i++               j>=i, j--
54            i=4				        j=5,4
543		       =3						j=5,4,3
5432	       =2					    j=5,4,3,2
54321	       =1	            		j=5,4,3,2,1 
              i>=1, i--                 j>=i, j--
*/           
public class Pattern5 {
	public static void main(String[] args) {
		for(int i=1; i<=5; i++)
		{
			for(int j=5; j>=i; j--)
			{
				System.out.print("*");
			}
			System.out.println("");
		}
		for(int i=4; i>=1; i--)
		{
			for(int j=5; j>=i; j--)
			{
				System.out.print("*");
			}
			System.out.println("");
		}
		
	}
}