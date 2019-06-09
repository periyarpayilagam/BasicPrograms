/*
  
54321
 4321
  321
   21
    1
   21
  321
 4321
54321
--------------------------------------------------------------------------------------------
54321  i=5       j=5,4,3,2,1     s=5, s=        5>5
 4321    4        =  4,3,2,1           =-       5>4,4>4
  321    3        =    3,2,1           =-,-     5>3,4>3,3>3
   21    2        =      2,1           =-,-,-   5>2,4>2,3>2,2>2
    1    1        =        1           =-,-,-,- 5>1,4>1,3>1,2>1,1>1
	   i>=1,i--    j=i, j>=1, j--       s>i, s--
	

   21  i=2       j=   2,1         s=5, s=-,-,-,2,1
  321    3        =  3,2,1             s=-,-,3,2,1
 4321    4        = 4,3,2,1            s=-,4,3,2,1
54321    5        =5,4,3,2,1           s=5,4,3,2,1
	   i<=5,i++    j=i, j>=1, j--      s>i, s--
	   

*/	     
public class Pattern9 {
	public static void main(String[] args) {
		for(int i=5; i>=1; i--)
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
		
		for(int i=2; i<=5; i++)
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