/**
 * 	Below is the code of B.java file.
	And code of BTest.java file:
	Currently we get null null in the output.
	Don’t make any changes in BTest.java file.
	Make changes in B.java file so on executing BTest class, we get following output:
	Hello World!
	NOTE: You are restricted to make changes in no-argument constructor only.

	@author Amelia
 */

package oop.src;

public class B {
	public String msg1; //default value null
	public String msg2; //default value null
	
	public B() {
		//TODO: Make changes over here.
		msg1 = "Hello";
		msg2 = "World!";
	}
	
	public B(String s1, String s2) {
		msg1 = s1;
		msg2 = s2;
	}

	public void print() {
		System.out.println(msg1 + " " + msg2);
	}
}
