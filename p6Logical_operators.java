class p6Logical_operators
{
	public static void main(String args[])
	{ 
	  byte a=10;
	  byte b=20;
	  byte c=5;
	  
	  if( a>b && a>c)
		  System.out.println("a is greater--1st IF");
	  
	  if(a>b || a>c)
		  	System.out.println("a is greater--2nd IF");
      
	  /*if(!(a>c))
	 
	      System.out.println("B is greater--3nd IF"); //make inversion if it is true it makes false, if it is false it makes true REMOVE ABOVE TWO IF CONDITION TO EXECUTE THIS CONDITION!!!!
	   */
	}
}