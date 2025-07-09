abstract class Cgovt //abstract class
{
	void otherdirections()
	{
		System.out.println("I am from OtherDirections");
	}
	abstract void actionsToBeTaken(); //abstract method 
	
	
}
class AP extends Cgovt
{
	void actionsToBeTaken()
	{
		System.out.println("I am from actionsToBeTaken in AP");
	}
	
}

class TG extends Cgovt 
{
	
	void actionsToBeTaken()
	{
		System.out.println("I am from actionsToBeTaken in TS");
	}
	
	
}




class p62AbstractClass
{
	public static void main(String args[])
	{
		
		AP ap = new AP();
		ap.actionsToBeTaken();
		ap.otherdirections();
		
		TG tg = new TG();
		tg.actionsToBeTaken();
		tg.otherdirections();
		
		
	}
	
}