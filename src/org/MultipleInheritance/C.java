package org.MultipleInheritance;

public class C implements A,B {

	public void age() {
		System.out.println("it is 15");
	}
	public void name() {
		System.out.println("it is kishanth");
	}
   
	public void address() {
		System.out.println("148-j");
	}

	public static void main(String[] args) {
		C ca= new C();
		ca.address();
		ca.age();
		ca.name();
	}
}
