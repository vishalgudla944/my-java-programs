class p3Unary_operator
{
public static void main(String args[])
{
	
    byte p=10;
	byte q=-12;
	
	System.out.println("post increment:"+(p++));
	System.out.println(p);
	
	System.out.println("pre increment:"+(++p));
	System.out.println(p);
	
	System.out.println("post decrement:"+(p--));
	System.out.println(p);
	
	
	System.out.println("pre decrement:"+(--p));
	System.out.println(p);
	
	System.out.println("Unary minus:"+(-p)); //make postive to negitive number and negitive to positive number
 	
	System.out.println("Unary minus:"+(-q));
}

}