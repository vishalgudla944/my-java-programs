class p85WrapperClassByte{
public static void main(String args[]){
	
byte a = 95;
//Wrapper class of Byte
Byte b = new Byte(a);
System.out.println(b.byteValue());
System.out.println(b.intValue());
System.out.println(b.floatValue());
System.out.println(b.doubleValue());
//We can Use any NumberClass Like intValue,floatValue,DoubleValue
//to Retrive a Number value, unlike boolean, boolean should
//only retrived by booleanValue(); 
}

}
	
	
	
