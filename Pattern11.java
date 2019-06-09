/*



1 2 3 4 5   i=5        j=12345     s=5, s=No space 5>5 
 1 2 3 4      4         =1234            =-, 5>4, 4>4
  1 2 3       3         =123             =-,-, 5>3,4>3,3>3
   1 2        2         =12              =-,-,- 5>2, 4>2, 3>2, 2>2
    1         1         =1               =-,-,-,- 5>1, 4>1, 3>1, 2>1,1>1
         i>=1,i--      j=1,j<=i,j++         s>i, s--
*/  
public class Pattern11{
	public static void main(String[] args) {
      
	   for(int i=5; i>=1; i--)
		{
			for(int s=5; s>i; s--)
			{
				System.out.print(" ");
			}
			for(int j=1; j<=i; j++)
			{
				System.out.print("*"+" ");
			}
			System.out.println("");
		}
       
	}
}