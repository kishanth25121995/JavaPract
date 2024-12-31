package org.partialAbstr;

public class ClassB extends ClassA{

	public void testhg() {
		System.out.println("it is testhg");
		super.testA();
	}
		
	public void testq() {
		System.out.println("it is a testq");
		
	}
   
	public void testqw(String a) {
		System.out.println(a);
	}

	
	public static void main(String[] args) {
		ClassB b= new ClassB();
		b.testhg();
		b.testq();
		b.testqw("gfhdjks");
	}
}


