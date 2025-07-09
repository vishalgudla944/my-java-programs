class p45String_immutable15{
	
	public static void main(String args[]){
		
		
		//We know String is immuatable
		//Means We can change the object or value but it will change it's HASHCODE
		//HASHCODE means a memory Address for every new assiging Value
		//Observe Below Example

		
		String name = new String("hello");
		System.out.println("Inital Value: "+name);
		System.out.println("Hascode Value: "+name.hashCode());
		
		 name ="hi";
		System.out.println("Updated Value: "+name);
		System.out.println("Hascode Value: "+name.hashCode());
		
		 name = "Welcome";
		System.out.println("Updated Value"+name);
		System.out.println("Hascode Value: "+name.hashCode());
		
		
		//We can Observe String 'name' value changing And also Hashcode also changing
		//It will create New Object for every new assiging of String
	}
	
	
	
	
	
}