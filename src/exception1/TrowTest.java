/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exception1;

/**
 *
 * @author cis10
 */
public class ThrowTest {

    static int div(int x, int y) throws ArithmeticException {
        if (y == 0) {
            throw new ArithmeticException();
        }
        return x / y;
    }

    public static void main(String args[]) {
        try {
            System.out.println(div(2500, 50));
        } catch (ArithmeticException e) {
            System.out.println("Error --> Divide by Zero !");
        }
    }
}
