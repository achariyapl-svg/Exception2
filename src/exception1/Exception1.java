package exception1;

/**
 *
 * @author cis10
 */
public class Exception1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        try {
        System.out.println("Input String = "+args[0]);
	System.out.println("Computing Result = "+Integer.parseInt(args[1])/Integer.parseInt(args[2]));
	}
     
        catch(NumberFormatException e) {
	System.out.println("Error Number Type argument");
	}
	catch(ArrayIndexOutOfBoundsException e) {
	System.out.println("Error Number of argument"); 
	} 
	catch(Exception e) {
	System.out.println(e); 
	} 
     }
}