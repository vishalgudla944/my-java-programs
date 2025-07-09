class arr{
	
	
	void printarray(int a[]){
		
		for (int i=0;i<a.length;i++){
			
			System.out.println(a[i]);
		}
		
	}
	
	
	
}


class p52MethodUsingArrays{
	
public static void main(String args[]){
	
	int x[] = {10,12,13,100,105};
	arr obj = new arr();
	obj.printarray(x);
	
	
}	
	
	
}