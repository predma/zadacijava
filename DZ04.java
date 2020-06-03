package edunova;

import javax.swing.JOptionPane;

public class DZ04 {

	public static void main(String[] args) {
		//Upiši 3 godine starosti igrača i izračunaj/ispiši prosjek starosti
		
		int g1=Integer.parseInt(JOptionPane.showInputDialog("Prva godina"));
		int g2=Integer.parseInt(JOptionPane.showInputDialog("Druga godina"));
		int g3=Integer.parseInt(JOptionPane.showInputDialog("Treća godina"));
		
		float sum=(g1+g2+g3)/(float)3;
		
		System.out.println(sum);
}
}
