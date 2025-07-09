class p44String14{
	public static void main(String args[]){
		
		char a[] =  new char[100];
		String s1 = "Welcome My name is JAVA";
		
		/* 
		Now arrange specific characters from 's1' to 'a' by using
        Void getChars(int i1, int i2, char arr[], int i3)		
		

		Void --> Return Type ( Void means Which does not return anything)
		
		int i1 --> Intial charater position to inserted in 'a';
		String lo eh index nunchi charater ni inster cheyyalo cheptundi 
		
		int i2 --> Last charcter position to inserted in 'a'; (i2 -1)
		String lo eh index mundu varuku varuku charater ni inster cheyyalo cheptundi 
		suppose i2 -- 12 iste adi before 12th ante 11th character varuku print avtundi
		
		char arr[] --> array to be inserted from String.. In this case it is a[];
		
		int i3--> At which postion of array given String charaters should be inserted
		char array a[] lo Eh index nuchi String charcter fill avvlo cheptundi..
		
		*/
		
		s1.getChars(5,12,a,0);
		System.out.println("a[1] is:"+a[1]);
		
		
		
		
		
	}
	
}