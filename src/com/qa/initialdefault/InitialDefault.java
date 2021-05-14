package com.qa.initialdefault;

public class InitialDefault {

	public static void main(String[] args) {
		pubstatvoidMessage();
		int testDefault2 = add();
		String messageVariable = "Initial Default 2";

		System.out.println("Initial Default 1");
		System.out.println(messageVariable);
		System.out.println(testDefault2);
		printWithExtraSteps(7,8);
		int addResult = addWithExtraSteps(3, 5, 7);
		System.out.println(addResult);
	}

	public static void pubstatvoidMessage() {
		String voidMessage = "Initial Default 3";
		System.out.println(voidMessage);
	}

	public static int add() {
		return 7 * 3;

	}
	
	public static void printWithExtraSteps(int intY, int intZ) {
		System.out.println(intY + " " + intZ);
	}
	public static int addWithExtraSteps(int intA, int intB, int intC) {
		return (intA + intB + intC);
	}
}
