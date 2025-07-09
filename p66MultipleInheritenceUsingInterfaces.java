//we will use interfaces to achive Multiple Inheritence 
//we can use three interfaces or 1 class, 2 interfaces

class A
{
	
	void methodA(){
		System.out.println("I am from methodA");
	}
}

interface B 
{
	
	void methodB();
}
interface C 
{
	
	void methodC();
}

class D extends A implements B,C{
	
	public void methodB(){
		System.out.println("I am from methodB from class D");
	}
	public void methodC(){
		System.out.println("I am from methodC from class D");
	}
} 

class p66MultipleInheritenceUsingInterfaces{
	public static void main(String args[]){
		
		D obj = new D();
		obj.methodA();
		obj.methodB();
		obj.methodC();
		
	}
	
}