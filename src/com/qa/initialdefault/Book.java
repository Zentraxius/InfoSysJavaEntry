package com.qa.initialdefault;

public class Book {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	// Stats
	public String title;
	public String author;
	public String genre;
	public int pageCount;
	public boolean hardBack;
	public boolean isOpen;
	
	// Bob the Builder
	public Book(String title, String author, String genre, int pageCount, boolean hardBack, boolean isOpen) {
		this.title = title;
		this.author = author;
		this.genre = genre;
		this.pageCount = pageCount;
		this.hardBack = hardBack;
		this.isOpen = isOpen;
	}
}
