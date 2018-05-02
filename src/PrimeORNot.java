import javax.swing.JOptionPane;

public class PrimeORNot {

	public static void main(String[] args) {
		
		String in = JOptionPane.showInputDialog("Please Input Number");
		
		int out = Integer.parseInt(in);
		
		for (int i = 2; i < out; i++) {
			
			if  (out%i==0) {
				
				JOptionPane.showMessageDialog(null, "Your Number is Composite!");
				
			}
		}
			JOptionPane.showMessageDialog(null, "Your Number is Prime!");
			
		System.exit(0); // fe
	}
}
