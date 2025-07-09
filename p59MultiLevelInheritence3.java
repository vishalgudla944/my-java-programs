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
	B() {}
	B(int p,int q)
	{
		
		this.p = p;
		this.q = q;	
		
	}

}

class C extends B
{
	
	int r;
	C(){}
	C(int p, int q, int r)
	{
		
	this.p = p;
	this.q = q;
	this.r = r;
	
	}
	
	void add()
	{
		
		
		System.out.println("Addition of p,q,r is "+(p+q+r));
		
	}
	
	
}




class p59MultiLevelInheritence3{
	public static void main(String args[]){
		
		C obj = new C(20,30,50);
		obj.add();
		
	}
	
}