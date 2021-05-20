package com.qa.initialdefault;

public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Person bob = new Person("Bob", 18, "Male", "Software Development");
		//Book bobsBook = new Book("Bob's Diary", "Bob Bobson", "Non-Fiction", 476, true, false);
		//
		//System.out.println(bob.name + " is " + bob.age + " years old, he identifies as a " + bob.gender
		//		+ " and has a career in " + bob.career);
		//System.out.println(bobsBook.title + " " + bobsBook.author + " " + bobsBook.genre + " " + bobsBook.pageCount + " " + bobsBook.hardBack + " " + bobsBook.isOpen);

		//System.out.print(bob.name + " is reading " + bobsBook.title);
		
		//////////////////////////////////////////////////////////////////////
		Owl testOwl = new Owl();
		testOwl.doThing();
		testOwl.noise();
		
		Chicken cheeken = new Chicken();
		cheeken.doThing();
		cheeken.cluck();
		cheeken.noise();
	}
}
