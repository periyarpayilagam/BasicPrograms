import java.util.Scanner;
class Prime
{
    public static void main(String[] args)
   {
	 
	 for(int i=50; i<=100; i++)//50,51, 52...100
	 {
		    boolean check=false;
			 for(int start=2; start<i/2; start++)
			 {
				 if(i%start==0)
				 {
					 check=true;
					 break;//To reduce the comparison
				 }
			 }
			 if(check==false)
			 {
				 System.out.println(i);
			 }
	  }
	 
	 
   }    
}