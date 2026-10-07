/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exception1;

/**
 *
 * @author cis10
 */
public class FinallyTest {

    public static void main(String args[]) {
        for (int i = -2; i <= 2; i++) {
            try {
                System.out.println(10 / i);
            } catch (Exception e) {
                System.out.println("Catch block : " + e);
                break;
            } finally {
                System.out.println("Finally Block");
            }
            System.out.println("End For");
        }
        System.out.println("End Program");
    }
}
