class Myexception extends Exception
{
	Myexception(){
		
		System.out.println("Age should be less than 10");
	}
	
	Myexception(String str){
	
         super(str);	
	}
}


class p73UserException{
	
	public static void main(String args[]) throws Exception {
		int age = 13;
		try
		{
		if (age>10)
			throw new Myexception("Compition is only for kids with age below 10");
		}
		catch (Myexception e){
			System.out.println("Re-Enter valid age");
		}
		
		    System.out.println("1st Exception Cleared");			
			
		String name = "vis";
        int len = name.length();
		
		try{
         if (len > 3)
          System.out.println("Valid name");			
         else
           throw new Myexception("You have Enter Invalid name");			 
		}
          catch (Myexception e)	{
			  System.out.println("Name should be more than 3 characters");
		  }
		  
		  System.out.println("2nd Exception Cleared");
	}
	
}