class p8Bitwise_operator{
	
public static void main(String args[])
{
 byte a=13;
 byte b=14;

System.out.println("Bitwise of a is:"+(~a)); //convert into Decimal and change 0s to 1 and 1s to 0

System.out.println("Bitwise AND of a&b is:"+(a&b));

System.out.println("Bitwise OR of a|b is:"+(a|b));

System.out.println("Bitwise XOR of a^b is:"+(a^b));

System.out.println("Left Shift of a to 2 is:"+(a<<2));

System.out.println("Right Shift of b to 3 is:"+(a>>3)); //siging right shift

System.out.println("Right Shift of b to 4 is:"+(a>>>3)); //unsigned right shift with 0 fill

 

}


}