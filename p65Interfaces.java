interface A{
	
	void show();
	void display();
}

class B implements A //implements used to inhertate from Interface to class
{
	
  	public void show() //must specify public
	{
		System.out.println("I am in show method in class B");
	}
	public void display(){
		System.out.println("I am in display method in class B");
	}
}




class p65Interfaces{
	public static void main(String args[]){
		
		B obj = new B();
		obj.show();
		obj.display();
		
	}
}