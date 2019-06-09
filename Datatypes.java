class Datatypes
{
  public static void main(String[] args)
  {
	  //Datatypes
	  /*
	     byte   1B  =>8bits 	default=0 	Range=2^7
	     short  2B  =>16bits 	default=0	Range=2^15
	     int    4B  =>32bits 	default=0	Range=2^31
	     long   8B  =>64bits 	default=0	Range=2^63
		 
		 float  2B	=>32bits    default=0.0f Range 6 decimal
		 double 4B  =>64bits    default=0.0d Range 15 decimal
		 
		 char   2B  =>16bits    default='', 65536
		 boolean 1bit true or flase
		 object => null
	  */
	  
	  byte  a=10;
	  short b=234;
	  int   c=23456;
	  long  d=78678678;
	  float e=34.567f;
	  double f=67.7886786;
	  char g='a';
      boolean h=true;
	  Object myobj=null;
	  System.out.println(a+" "+b+" "+d+" "+e+" "+f+" "+g+" "+h);
	  System.out.println(myobj);
    }
}
