class p24Arrays2{
	public static void main(String args[]){
		
		int arr[]={20,90,100,50,70}; 
		//we can directly assign like this if we know the values;
		//we can also write int[] arr;
		//printing all values in the array
		
		for(int i=0;i<5;i++) //if we don't know the array size: for( int i=0;i<arr.length;i++)
		{ 
			
			System.out.println("Index is:"+i+"value is"+arr[i]);
			
		}
		 System.out.println("Array Size is:"+arr.length);
		
		
	}
}