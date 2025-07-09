//Inheritence with Constructors

class A{
	
	int p;
	A() {} //Should give empty Constructors when we implement parametrized in main class for this class.
	
	A(int p){
		
		
		this.p = p;
	}
	
	void display(){
		
		System.out.println("i am in base class my p value is "+ p);
	} 
   
	
	
}

class B extends A{
	int q;
	B() {}
	B(int p, int q){
		
		this.p = p;
		this.q = q;
	}
	
	void show(){
		
		System.out.println("i am in sub_class my q value is: "+q);
	}
	
	
	
}


class p58Inheritence2{
	
	public static void main(String args[]){
		
		B obj = new B(25,35);
		obj.display();
		obj.show();
       
		
	}
}
