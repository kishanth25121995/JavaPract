package org.methodOverriding;

public class ClassB extends ClassA {

	public void tets3() {
		System.out.println("it is test4");
	}
	public void test4() {
		System.out.println("it is test6");
		super.username();
	}
   public static void main(String[] args) {
	ClassB b= new ClassB();
	b.tets3();
	b.test4();
	b.username("KISHANTH");
	b.mob("5678984567");
	
}



}
