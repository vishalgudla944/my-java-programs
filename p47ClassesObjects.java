//Definig Class
class human{
	
	//Definig Instance Varibles
	String name;
	int age;
	
	//Definig Insatnce Methods
	void talk( ){
		
		System.out.println(name+" can talk and his age is "+age);
		
	}
	void walk( ){
		
		System.out.println(name+" can walk and his age is "+age);
	}
}
	
	
	//Driver class
	//enni classes rasina anni e DRIVER CLASS nunche execute avutai
	
	class p47ClassesObjects{
		
		public static void main(String args[]) {
			
			//creating objects
			
			human person1 = new human();
			person1.name = "Vishal";
			person1.age = 19;
			person1.walk();
			person1.talk();
			
			
			
			human person2 = new human();
			person2.name = "Siddhu";
			person2.age = 16;
			person2.walk();
			person2.talk();
			
			
			
			
			
		}
		
		
	}
	
