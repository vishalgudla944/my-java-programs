class A{
	
	int p = 100;
	
	void display(){
		
		System.out.println("i am in base class my p value is "+ p);
	} 
		
}

class B extends A{
	
	int q = 200;
	
	void show(){
		
		System.out.println("i am in sub_class my q value is: "+q);
	}
	
	
	
}





class p57Inheritence{
	public static void main(String args[]){
		
		B obj = new B();
		obj.show();
		//we can also change p value it will print
		
		obj.p = 150;
		obj.display();
		
		//But value in the base class won't change
		//for example 
		A obj2 = new A();
		System.out.println("p value inside class A (base class) is "+ obj2.p);
		
		
		
	}
	
}