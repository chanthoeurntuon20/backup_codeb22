package com.practice3;

public class Demo {

	public static void main(String[] args) {
		People people = new People();
		people.setName("Dara");
		people.getName();
		
		people.setAge(20);
		people.getAge();
		
		people.setProvince("PP");
		people.getProvince();
		
		System.out.println(people.getName()+ " " + people.getAge() + " " + people.getProvince());
		
	}
	
}
