class a
{
	
	int p,q,r;
	a() {}
	a(int p,int q, int r)
	{
        
		this.p = p;
        this.q = q;
        this.r = r;		
	
	}

}
 
class b extends a
{
	
	int s,t;
	b(){}
	b(int p,int q, int r,int s,int t)
	{
		
		super(p,q,r); //using super keyword to access the constructor of 'class a'
		this.s = s;
        this.t = t;	
	}
	void add()
	{
		
		System.out.println("Addition is: "+(p+q+r+s+t));
	}
	
}


class p61SuperKeyword2{
	
public static void main(String args[]){
	b obj = new b(20,30,40,50,60);
	obj.add();
	
}
}