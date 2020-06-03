package edunova;

import javax.swing.JOptionPane;

public class E03Algoritam {
	
	/*
	 * Tekst zadatka
	 * tražiti od korsinika unos, uvećati unos za 
	 * jedan te ispisati dobiveni rezultat na 
	 * standardni izlaz
	 */
	
	public static void main(String[] args) {
		//ulaz
		int broj=Integer.parseInt(JOptionPane.showInputDialog("Unesi broj"));
		
		//obrada
		broj=broj+1; //operator zbrajanja
		
		//izlaz
		System.out.println(broj);
	}

}
