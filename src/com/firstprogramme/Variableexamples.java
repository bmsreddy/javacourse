package com.firstprogramme;

public class Variableexamples {
	int i = 100; //Non-static variable
	static String s = "abc"; //static variable
	void Localexample() {   //Non-static method
		double d = 500d; //local variable
		System.out.println(d);
		
	}
	static void doing() {  //static method
		boolean flag = true; //local variable
		System.out.println(flag);
	}
public static void main(String[]args) {
	String s2 = "Java"; // local variable
	System.out.println(s2);
	
	Variableexamples V = new Variableexamples();  //object creation
	System.out.println(V.i);
	System.out.println(s);
	V.Localexample();
	doing();
  }
}

