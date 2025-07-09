class A{
	
	final void show() 
	//By using final to a method we cannot override a method means we cannot create a method 
	//with same name and signature in a subclass
	//now this program won't Execute because we used final to a method
	//So we cannot override.
	{
		
		System.out.println("I am from show method from class A");
	}
}
class B extends A{
	
	void show(){
		super.show();	
	  System.out.println("I am from show method from class B");

	}
	
}




class p69FinalMethod{
	
	public static void main(String args[]){
		
	 B obj = new B();
	 obj.show();
	}
	
}