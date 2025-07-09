//program to demostrate methodoverriding
//2 or more methods in superclas and subclas having same 
//name and same signature is said to be methodoverriding

class A{
	
   void add(int a, int b){
	   
	   System.out.println("class A Addition is: "+(a+b));
   }
	
}

class B extends A {
	
	void add(int p, int q){
		
		
		super.add(50,60);
		
		System.out.println("class B Addition is "+(p+q));
	}
	
}

class p63MethodOverriding{
	public static void main(String  args[]){
		
		B obj = new B();
		obj.add(50,60);
		
		
		}
	
}