class Student{
	int rn;
	String name;
	String subject;
	public Student(){
		System.out.println("I am default constructor");
	}
	public Student(int rn,String name){
		System.out.println("I am parameterized(2) constructor");
		this.rn = rn;
		this.name = name;
	}
	public Student(int rn,String name,String subject){
		this(rn,name);
		System.out.println("I am parameterized(3) constructor");
		this.subject = subject;
	}
	public void display(){
		System.out.println("name : "+name);
		System.out.println("roll num : "+rn);
		System.out.println("subject : "+subject);
	}
	public static void show(){
		System.out.println("I am static method , i can be called from Class reference directly without creating object of class");
	}
}
class Oops2{
	public static void main(String[] args){
		Student s = new Student();
		s.rn = 1;
		s.name = "Maya";
		System.out.println("name : "+s.name);
		System.out.println("roll num : "+s.rn);
		
		Student s2 = new Student(2,"Priya");
		s2.display();
		
		Student s3 = new Student(3,"Himanshi","Java");
		s3.display();
		
		Student.show();
	}
}