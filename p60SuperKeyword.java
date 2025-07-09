class a
{
	int p = 10; //member variable
	
	void show() //member method
	{
		System.out.println("CLASS A: "+p);
		
	}
	 
	
}

class b extends a
{
	int p = 100;
	int q = 200;
	 void show()
	 {    
	 
	      super.show();                           //accessing show method of 'class a' using 'super'
		 System.out.println("CLASS B: "+super.p); //accessing p value of 'class a' using 'super'
		 System.out.println("CLASS B: "+p);
		 
	 }
	
	
}




class p60SuperKeyword
{
	public static void main(String args[])
	{
		b obj = new b();
		obj.show();
		
	}
	
}