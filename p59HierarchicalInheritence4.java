class A
{
	int p;
	A(){}
	A(int p)
	{
		this.p = p;
	}
}



class B extends A
{
	
	int q;
	B(){}
	B(int p, int q)
	{
		this.p = p;
		this.q = q;
	}
	
	void add()
	{
		System.out.println("Addition of p,q is: "+(p+q));
		
	}
	
}



class C extends A
{
 int r;
 
 C() {}
 C(int p, int r) 
  
 {
	this.p = p;
    this.r = r; 	
	 
 } 
 void add()
 {
	 	System.out.println("Addition of p,r is: "+(p+r));
	 
 }
	
}



class p59HierarchicalInheritence4
{

public static void main(String args[])
{
	B obj1 = new B(15,20);
	obj1.add();
	
	
	C obj2 = new C(100,200);
	obj2.add();
	
	
	
	
	
}
	
}