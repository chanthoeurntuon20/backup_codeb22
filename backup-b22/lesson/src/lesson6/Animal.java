package lesson6;

public class Animal {
	public String name;
	public String breed;
	public String color;
	public int age;
	public void run() {
		System.out.println(name + " "+ color +" "+ breed +" "+"We can run");
	}
	public void eat() {
		System.out.println("We can eat.....");
	}
	public Animal(String name, int age) {
		this.name = name;
		this.age = age;
	}
	public Animal() {
		
	}
	

}
