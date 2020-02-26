package practice1;

public class Employee extends Person{
	String position;
	Employee(){
		
	}
	Employee(String position){
		this.position = position;
	}
	Employee(String name, int age){
		super(name,age);
	}
	Employee(String name, int age,String position){
		super(name,age);
		this.position = position;
	}
	
	 public String toString() {
		return super.toString()+ position;
	}
	
}
