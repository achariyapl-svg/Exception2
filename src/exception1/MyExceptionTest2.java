/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exception1;

/**
 *
 * @author cis10
 */
class MyException extends Exception {
	MyException(String s) { super(s);}
}
public class MyExceptionTest2 {
	static void sayHello(String s) throws MyException {
		if (s.equals("John"))
			throw new MyException("BAD BOY");
		System.out.println("Hello! " + s);
	}
	public static void main(String args[]) {
		try {
			sayHello("John");
		} 
		catch (MyException e) {
			System.out.println(e.getMessage());
		}
	}
}

