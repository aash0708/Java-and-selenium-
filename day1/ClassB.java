package com.java.day1;

public class ClassB{
	public ClassB() {
		System.out.println("I am classB constructor");
	}
	
	 String a = "ashok kumar A";
	private int c = 5;
     int n = 10;
       n = n+10;

	 public void laptop(int a, String v) {
		 System.out.println("I am in super method");
	 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	       Basics1 obj = new Basics1();
	       Interfacelearning interlear = new Basics1();
	       obj.keyboard();
	       obj.classmethod();
	       interlear.mouse();
	       
	}
	public int getC() {
		return c;
	}

}
