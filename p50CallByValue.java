class sample{
	
	void add(int a, int b){
		
		int c = a+b;
	    

		System.out.println("sum is: "+c);
		
		a=50;
		b=30;
		System.out.println("Value of a is "+a+" and b is "+b);
		System.out.println("2nd sum is : "+(a+b));
		
		
	}
	
	
	
}


class p50CallByValue{
	public static void main(String args[]){
		
		int p=80;
		int q=9;
		
		System.out.println("Value of p is "+p+" and q is "+q);

		
		sample a = new sample();
		a.add(p,q);
		
				System.out.println("Value  p is "+p+" and q is "+q );

		
		
		
	}
	
}