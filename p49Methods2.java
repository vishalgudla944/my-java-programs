class Ex2{
	
	int a;
	int b;
	void add(){
		
		System.out.println("Addition is: "+(a+b));
	}
	
	//we can use same method name but parameter should different like void add(int a, int b)
	
	void add(int a){
		System.out.println("add value with int single parameter is: "+(a+5));
		
	}
	
	void add(float p){
		
				System.out.println("add value with float single parameter is: "+(p+10));

		
	}
	
	void add (float p, float q){
		
		 System.out.println("add value with float, float parameter is: "+(p+q));
	}
	
	
	void mul(){
		
		System.out.println("Multiplication is: "+(a*b));
	}
	
	
}
class p49Methods2{
	
	public static void main(String args[]){
	
	int x = 20;
	int y = 40;
	Ex2 obj1 = new Ex2();
	obj1.a = x;
	obj1.b = y;
	obj1.add();
	obj1.mul();
	obj1.add(10); //acc method 10+5
	obj1.add(5.5f); //acc method 5.5+10
	obj1.add(1.5f,2.5f);
	
}
	
	
}