class Student{
	int rn;
	String name;
	public Student(){
		System.out.println("I am default constructor");
	}
	public Student(int rn,String name){
		System.out.println("I am parameterized constructor");
		this.rn = rn;
		this.name = name;
	}
	public void display(){
		System.out.println("name : "+name);
		System.out.println("roll num : "+rn);
	}
}
class Oops{
	public static void main(String[] args){
		Student s = new Student();
		s.rn = 1;
		s.name = "Maya";
		System.out.println("name : "+s.name);
		System.out.println("roll num : "+s.rn);
		
		Student s2 = new Student(2,"Priya");
		s2.display();
	}
}