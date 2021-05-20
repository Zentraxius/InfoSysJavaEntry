package com.qa.initialdefault;

public class Bird {
	private boolean fly = true;

	public void noise() {
		System.out.println("CHEEEEEEP");
	}

	// Get/Set
	public boolean getFly() {
		return fly;
	}

	public void setFly(boolean newValueOfFly) {
		this.fly = newValueOfFly;
	}
}

