/*
12345
 2345
  345
   45
    5
		
i=1		     print(j)     j=1,2,3,4,5           j=1,2,3,4,5
  2   					  j=  2,3,4,5			j=-,2,3,4,5  	
  3					      j=    3,4,5			j=-,-,3,4,5	 
  4    					  j=      4,5			j=-,-,-,4,5	 
  5				          j=        5			j=-,-,-,-,5
i<=5, i++                j=1, j<i, j++         j=i,i<=5, ,j++           
*/			
public class Pattern6 {
	public static void main(String[] args) {
		
		for(int i=1; i<=5; i++)
		{
			for(int j=1; j<i; j++)
			{
				System.out.print(" ");
			}
			for(int j=i; j<=5; j++)
			{
				System.out.print("*");
			}
			System.out.println("");
		}
      
		
	}
}
