class Student
{
	String name;
	int age;
	Student(String n, int a)
	{
		name = n;
		age = a;
	}
	
}
class p86ArrayObjects
{
	//Create Student Objects
	public static void main(String args[]){
	Student s1 = new Student("Vishal",19);
	Student s2 = new Student("Siddhu",17);
    Student s3 = new Student("Sanjay",21);
    Student s4 = new Student("Ramesh",25);
	Student s5 = new Student("Rajesh",30);
    
	//Creating Students array Using Student class
	
	Student Students[] = new Student[5];
	Students[0] = s1;
	Students[1] = s2;
	Students[2] = s3;
	Students[3] = s4;
	Students[4] = s5;
	
	//retriving objects using member name
	
	for (int i=0;i<Students.length;i++)
	{
		Student s = Students[i];
		System.out.println(s.name);
		
	}
	
}
	

}





