package algorithms;

import javax.swing.JOptionPane;

public class PrimeorNotiboi {
public static void main(String[] args) {
	
	String xs = JOptionPane.showInputDialog("Enter a number that you think is prime");
	int x = Integer.parseInt(xs);
	for (int i=2; i < x; i++) {
		if (x % i == 0) {
			JOptionPane.showMessageDialog(null, "That number is not prime. (remember, prime numbers are only able to be divided by 1 and itself)");
			System.exit(0);
		}
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
}
