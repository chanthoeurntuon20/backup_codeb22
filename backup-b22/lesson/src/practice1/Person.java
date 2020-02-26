package practice1;

public class Person {
	String name;
	private int age ;
	Person(){
		
	}
	Person(String name){
		this.name = name;
	}
	Person(int age){
		this.age = age;
	}
	Person(String name, int age){
		this.name = name;
		setAge(age);
		getAge();
	}
	void setAge(int age) {
		this.age = age;
	}
	int getAge() {
		return age;
	}
	public String toString() {
		return name + age;
	}
}
