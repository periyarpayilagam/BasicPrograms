class Greatest
{
   public static void main(String[] args)
   {
      int a=5;
      int b=2;
      int c=5;
      if(a>b)
      {
		  if(a>c)
		  {
			  System.out.println("A is Greater");
		  }
		  else if(c>a)
		  {
			 System.out.println("C is Greater"); 
		  }
		  else
		  {
			  System.out.println("A is equal to C");
		  }
	  }	
      else if(b>a)
      {
		  if(b>c)
		  {
			  System.out.println("B is Greater");
		  }
		  else if(c>b)
		  {
			 System.out.println("C is Greater"); 
		  }
		  else
		  {
			  System.out.println("B is equal to C");
		  }
	  }
      else
	  {
		  System.out.println("A is equal to B");
	  }		  
    }
}