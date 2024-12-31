package org.fullyAbstraction;

public class ClassB implements ClassA {

	public void id() {
		System.out.println("it is id");
	}
   
	public void name() {
		System.out.println("it is name");
	}
    
	public void id(int age) {
		System.out.println(age);
	}

	
	public static void main(String[] args) {
		ClassB b= new ClassB();
		b.id();
		b.name();
		b.id(23);
	}
	
}

