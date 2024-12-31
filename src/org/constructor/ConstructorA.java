package org.constructor;

public class ConstructorA extends Constructor{

	public ConstructorA() {
		this(33);
		System.out.println("it is second constructor");
	}

    public ConstructorA(int age) {
    	super();
    	System.out.println("it is the best constructor");
    	
    }

public static void main(String[] args) {
	ConstructorA c = new ConstructorA();
	
}





}
