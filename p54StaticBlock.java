class p54StaticBlock{
	
		
		//static block is used run specific statements before execution of main Method
		//The code that is written inside the static block run once, when the class is getting loaded into the memory.
		//Static block have higest priority in Java, then 2nd Main method
		
		static{
			
			System.out.println("This is Static Block");
			
		}
		
		public static void main(String args[]){
		
		System.out.println("This is Main method Block");
		
		}
		
		//Even If we write static block after main. static block will Execute firstly.
	}
	
	
