package org.methodOverloading;

public class ClassA {

	
	public void testa(int id) {
		System.out.println("it is a atestA");
	}
    
	public void testa(int age,String mob) {
		System.out.println("it is testb");
	}

	public void testa(long mobile) {
		System.out.println("it is testc");
	}
	public static void main(String[] args) {
		ClassA f= new ClassA();
		f.testa(30);
		f.testa(39,"08765678906");
		f.testa(8655555);
	}
}
