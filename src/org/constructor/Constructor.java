package org.constructor;

public class Constructor {

	public  Constructor() {
		this(10);
System.out.println("this is parent class constructor");

}
	
	public Constructor(int a) {
		System.out.println(a);
	}

public static void main(String[] args) {
	Constructor c= new Constructor();
}

}