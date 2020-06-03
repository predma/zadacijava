package edunova;

import javax.swing.JOptionPane;

public class Zadatak02 {
	
	public static void main(String[] args) {
		
		int broj=Integer.parseInt(JOptionPane.showInputDialog("Unesi broj"));
		
		if(broj < 1 || broj>5) {
			
			System.out.println("Nije dobar broj");
		}else {
			switch (broj) {
			case 1:
				System.out.println("Nedovoljan");
				break;
			case 2:
				System.out.println("Dovoljan");
				break;
			case 3:
				System.out.println("Dobar");
				break;
			case 4:
				System.out.println("Vrlo dobar");
				break;
			case 5:
				System.out.println("Odličan");
				break;
			
			}
		}
		
	}
	
	
	

}
