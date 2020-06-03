package edunova;

import javax.swing.JOptionPane;

public class Z03 {
	
	//Korisnik unosi 5 ocjena, program ispisuje njihov prosjek
	
	//Z04
	// Za uneseni troznamenkasti broj program ispisuje zadnju 
	// znamenku. Primjer: ulaz 237, izlaz 7, ulaz 333 izlaz 3
	
	//Z05
	//U programu omogućite unos dva broja, broj sati i minuta. 
	//Ispišite koliko taj broj sati i minuta iznosi u sekundama.
	
	//Z06
	// Program unosi 3 dvoznmenkasta broja. 
	// Ispisuje zbroj vodećih znamenki
	
	// https://projecteuler.net/
	


	public static void main(String[] args) {
		
		//rješenje 03
		
		int ocjena1=Integer.parseInt(JOptionPane.showInputDialog("Unesi prvu ocjenu"));
		int ocjena2=Integer.parseInt(JOptionPane.showInputDialog("Unesi drugu ocjenu"));
		int ocjena3=Integer.parseInt(JOptionPane.showInputDialog("Unesi treću ocjenu"));
		int ocjena4=Integer.parseInt(JOptionPane.showInputDialog("Unesi četvrtu ocjenu"));
		int ocjena5=Integer.parseInt(JOptionPane.showInputDialog("Unesi petu ocjenu"));
	
		float prosjek=(ocjena1+ocjena2+ocjena3+ocjena4+ocjena5)/(float)5;
	
		System.out.println(prosjek);
		
		
		//rješenje04
		
		
		int broj=Integer.parseInt(JOptionPane.showInputDialog("Upiši broj"));
		
		System.out.println(broj%10);
		
	
		
		
	}

}
