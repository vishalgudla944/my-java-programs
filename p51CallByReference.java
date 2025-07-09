import java.util.*;

class sample{
	
	void add(int a, int b){
		
		int c = a+b;
		System.out.println("Sum is: "+c);
		
	}
	
	void check(Ex obj1){
		
	   obj1.v1 = 50;
       obj1.v2 = 60;	   
		
	}
	
	
	
}

class Ex
{
	
	
	int v1;
	int v2;
}







class p51CallByReference{
	
	public static void main(String args[])  {
		
		
		int p = 50;		
		int q = 40;
		
		sample n = new sample();
		n.add(p,q); //call by value
		
		Ex obj2 = new Ex();
		obj2.v1 = 13;
		obj2.v2 = 14;
		System.out.println("Value of v1 is "+obj2.v1+" and v2 is "+obj2.v2);
		
		n.check(obj2);
		
		System.out.println("After callbyreference Value of v1 is "+obj2.v1+" and v2 is "+obj2.v2);

		
	}
}