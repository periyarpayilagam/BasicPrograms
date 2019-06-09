 /* 

    1
   21
  321
 4321
54321
 4321
  321
   21
    1
--------------------------------------------------------------------------------------------
----1   i=1		             j=        1        s=5  s=-,-,-,-, 5,4,3,2
---21     2   			     j=      2,1			 s=-,-,-  	5,4,3
--321     3					 j=    3,2,1			 s=-,-	    5,4,
-4321     4    			     j=  4,3,2,1			 s=-,	    5 5>4
54321     5	         	     j=5,4,3,2,1		s>i, s=	        s>5 5>5
        i<=5; i++           j=i, j>=1, j--        s--                     

-4321   i=4                  j= 4,3,2,1         s=5       s=-
--321     3                   =   3,2,1         s=5,4      =-,-
---21     2                   =     2,1         s=5,4,3    =-,-,-
----1	  1	                  =       1         s=5,4,3,2  =-,-,-,-
        i>=1, i--          j=i, j>=1, j--       s>i, s--

*/	     
public class Pattern8 {
	public static void main(String[] args) {
		
		for(int i=1; i<=5; i++)
		{
			for(int s=5; s>i; s--)
			{
				System.out.print(" ");
			}
			for(int j=i; j>=1; j--)
			{
				System.out.print("*");
			}
			System.out.println("");
		}
		
		for(int i=4; i>=1; i--)
		{
			for(int s=5; s>i; s--)
			{
				System.out.print(" ");
			}
			for(int j=i; j>=1; j--)
			{
				System.out.print("*");
			}
			System.out.println("");
		}
		
		
	}
}