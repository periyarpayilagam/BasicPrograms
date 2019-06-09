/*
            Natural Numbers=1,2,3,4,5,6,7....
	        mind = 1+2+3+4+5+6+.....10
            part11 sum of digits of a number 
			temp=0
			temp=0+ 1  => i=1 ; i<=10 ; i++
			    =1+ 2
				=3+ 3
				=6+ 4
				=10+5
				=15+6
				=21+7
				=28+8
                =36+9
                =45+10
                =55
            temp=temp+i
*/

public class Natural{
	public static void main(String[] args) {
       int temp=0;
	   for(int i=55; i<=100; i++)
	   {
		   temp=temp+i;
	   }
       System.out.println(temp);
	}
}