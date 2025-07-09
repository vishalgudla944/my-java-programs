final class Account
//By using final to a class, then the class do not inherit to a sub class
//now this program won't execute until we remove final keyword.
{
	
	int b = 2000;
}

class Myaccount extends Account{
	
	//balance
	
}





class p70FinalClass{

	public static void main(String args[]){
		
		Myaccount obj = new Myaccount();
		
		System.out.println(obj.b);
		
	}
}