package com.qa.initialdefault;

public class Person {
	public static void main(String[] args) {
		Person bob = new Person("Bob", 18, "Male", "Software Development");
		System.out.println(bob.age);
		bob.read();
	}

	public String name; //
	public int age; //
	public String gender; //
	public String career;

	// Constructor
 
	public Person(String name, int age, String gender, String career) {
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.career = career;
	}

	public void read() {
		System.out.println(this.name + " is reading the book titled: {given}");
	}


	public String speak(String msg) {
		return this.name + " says: " + msg;
	}

}
