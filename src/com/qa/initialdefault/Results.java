package com.qa.initialdefault;

public class Results {
	
	
	
  public static void main(String[] args) {
	  getResults(87, 93, 59);
	  

  }
	public static void getResults(int num1, int num2, int num3) {
		int resultTemp = (num1 + num2 + num3) / 3;
		
		if( num1 <= 60 || num2 <= 60 || num3 < 60) {
			System.out.println("Failure");
		} else {
			System.out.println("You passed with an average grade of: " + resultTemp);
		}
//		System.out.println(resultTemp);
	}

}
