class Ex{
	
	//instance variables
	
	int a;
	int b;
	
	//instance methods
	 void add() //method defination
	 {       
		System.out.println("Addition is: "+(a+b)); 
		 
	 }
	 
	 void mul()
	 {
		 System.out.println("Multiplication is "+(a*b));
	 }	
	
} 

class p48Methods1 {
	
	public static void main(String args[]){
		
		int p=20;
		int q=30;
		
		
		Ex obj1 = new Ex();
		
		obj1.a=p;
		obj1.b=q;
		obj1.add(); //method call  
		obj1.mul();
		
		
		
		
		
	}
	
}

















