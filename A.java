/**
 *  Below is the code of incomplete A.java file.
	And another code for ATest.java file.
	ATest.java file has 3 errors. You don’t have to make changes in ATest.java file.
	You are free to change the code inside A.java file. Make changes is A.java file so that on executing ATest class, we get following output:
	str: JAVA, val: 0.0
	str: test, val: 0.0
	str: JAVA, val: 9876.000873
	str: test, val: 5.6

	@author Amelia
 */



package oop.src;

public class A {
	public String str="JAVA";
	public double val;

	public A(){

	}
	public A(double d){
		val =d;
	}

	public  A(String s){
		str = s;
	}

	public A(String s,double d){
		str = s;
		val = d;
	}
	
	public void print() {
		System.out.println("str: " + str + ", val: " + val);
	}
}
