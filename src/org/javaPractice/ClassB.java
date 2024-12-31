package org.javaPractice;

public class ClassB extends ClassA {

	
	public void principalData() {
		System.out.println("principal name is jerry");
	}

   public void str() {
	   System.out.println("tr");
   }

   public static void main(String[] args) {
	ClassB b= new ClassB();
	b.principalData();
	b.str();
	b.StudentData();
	b.teacherData();
}




}
