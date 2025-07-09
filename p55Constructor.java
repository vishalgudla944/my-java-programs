class Example{
	
	String channel;
	
   //creating Constructor.
   //It is also a method.
   //Constructor should be with the name of it class.
   //It does not contain any return type. 
   //Constructor used to intilise / assign value to instance variable
   //Constructor overloading - same name with diff signatures
   
    Example() //Constructor without parameters are called default parameters
  	
	{
		channel = "Telugu Web Guru";
		
	}
	
	Example (String s ) //Constructor with parameters are called parameterized parameters
	{
		
		channel = s;
	}
	
}


class p55Constructor{
	public static void main(String args[]){
		
		Example e = new Example(); 
		//Does not need give e.name="value" because we already intialized value in Example Constructor
	    System.out.println("Channel value is object e is "+e.channel);	
		
		
	     Example e2 = new Example("vishal");
  	     System.out.println("Channel value is object e2 is "+e2.channel);
	}
	 	

	
	
}