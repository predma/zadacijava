package edunova;

import javax.swing.JOptionPane;

public class Z01 {
	
	// Program unosi dva broj i ispisuje njihov zbroj.
	
	public static void main(String[] args) {
		
		System.out.println(
				Integer.parseInt(JOptionPane.showInputDialog("Prvi broj"))
				+
				Integer.parseInt(JOptionPane.showInputDialog("Drugi broj"))
				);
		
		
	}

}
