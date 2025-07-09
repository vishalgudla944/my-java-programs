class JavaClass{
	
	//instance variable
	String name;
	//Insatnce Method 
	void listen(){
		
		System.out.println(name+" is Listening Class");
	}
	
	//Static variable
	//static variable/method is helps to create Shared or Common varibles
	//And method to a class.
	//It can be Accessed by classname.staticvariblename
	//Ex Javaclass.board();
	
	static String board;
	
	static void teaching(){
		
		System.out.println("Sir teaching Static keyword class in "+board+" board");
	} 
	
	
}


class p53StaticVariablesAndMethods{
	public static void main(String args[]){
		
	JavaClass person1  = new JavaClass();
      person1.name = "Vishal";
      person1.listen();
	  
      //calling static variable and method
      //It is Accessed by using classname
	  
	  JavaClass.board = "green";
	  JavaClass.teaching();

		
		
	}
}