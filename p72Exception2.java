class A{
	
	int arr[] = {10,9,8,7,6};
	String name="Vishal";
}

class p72Exception2{
	public static void main(String args[]){
	A obj = new A();
	try{
	System.out.println(obj.arr[2]);
	
	//Below-Example for ArrayIndexOutOfBoundsException -->unchecked Exception
	
	System.out.println(obj.arr[6]);
	}
	
	catch(ArrayIndexOutOfBoundsException e){
		
		System.out.println("You Enterd out of Array index Bounds Please re-enter");
	}
	
	try{
	System.out.println(obj.name.charAt(2));
	
	//Below-Example for StringIndexOutOfBoundsException -->unchecked Exception
		
		System.out.println(obj.name.charAt(7));
	}
	catch (StringIndexOutOfBoundsException e){
	
	System.out.println("You Enterd out of String index Bounds Please re-enter");

	}
	
	}
}