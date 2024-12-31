package org.thisKeyword;

public class ClassA {

	public void testA() {
		System.out.println("it is test1");
		this.testb();
	}

    public void testb() {
    	System.out.println("it is testb");
    	this.testc();
    	
    }
  
    
    public void testc() {
    	System.out.println("it is testc");
    }
public static void main(String[] args) {
	ClassA a= new ClassA();
	a.testA();
	a.testb();
}

}
