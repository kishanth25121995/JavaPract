package org.ConditionalStatement;

import java.security.DomainCombiner;

public class IfElseIfStatement {
	
	
	public void testData() {
	int num=22;
	
	if(num==22) {
		System.out.println("it is equal number");
	}

	else if (num>22) {
		System.out.println("it is smaller number");
	}

	else if(num<22) {
		System.out.println("it is larger number");
	}

	else {
		System.out.println("it is invalid number");
	}

	
	
	}
public static void main(String[] args) {
	IfElseIfStatement i = new IfElseIfStatement();
	i.testData();
}
}
