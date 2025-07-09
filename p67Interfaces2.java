interface A{
	int p = 10;  //defaulty it is STATIC, can be retrived by using its class name;
	void showA();
	
}
interface B extends A{
	
	void showB();
}
class C implements B{
	 public void showA(){
		System.out.println("I am from ShowA class c");
	}
	public void showB(){3
		
		System.out.println("I am from showB class c");
	}
	
}


class p67Interfaces2{
	
	public static void main(String args[]){
		
		C obj = new C();

        obj.showA();
        obj.showB();
        System.out.println(obj.p);		
		
	}
	
}