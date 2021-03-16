package com.java.day1;

public class Basics1 implements Interfacelearning {
	public Basics1(){
		System.out.println("I am constructor coming inside");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       //Coding starts from main method
		new Bascics1().
		ClassB c = new ClassB();
		System.out.println(c.a);
		String a = "Ashok kumar";
	char[] b = a.toCharArray();
	System.out.println(b);
	System.out.println(b[1]);
	String k = "";
	for(int i = 0; i<=b.length-1; i++) {
		 k = k + b;
		 System.out.println(b[i]);
		 for(int j=b.length; j<=10; j++) {
		 if(b[j]==b[j+1]) {
			 System.out.println("This string is repeated" + b);
		 }else {
			 System.err.println("No duplicate values are found");
		 }
	}
	}
System.out.println(k);
}

	@Override
	public void keyboard() {
		// TODO Auto-generated method stub
		System.out.println("I am keyboard");
	}

	@Override
	public void mouse() {
		// TODO Auto-generated method stub
		System.out.println("I am mouse");
	}
	public void classmethod() {
		System.out.println("I am class method");
	}
}