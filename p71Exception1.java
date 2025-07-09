class p71Exception1{
	public static void main(String args[]){
		try{
		System.out.println(1+3);
		System.out.println(5*4);
		System.out.println(6/0);
		
		}
		catch(ArithmeticException e)
		{
			System.out.println("Please Don't Divide by zero");
		}
		finally{
		System.out.println("Finally Executed");
		}
		
	}
	
	
	
}