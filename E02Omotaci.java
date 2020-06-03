package edunova;

import javax.swing.JOptionPane;

public class E02Omotaci {

	public static void main(String[] args) {
		// svaki primitivni tip podatka ima soj omotač (wrapper)
		int i = Integer.MAX_VALUE;
		System.out.println(i);
		i = i + 1;
		System.out.println(i);

		int b = Integer.parseInt("1");

		System.out.println(b);

		int unioKorisnik = 
				Integer.parseInt(
						JOptionPane.showInputDialog("Unesi broj"));
		
		System.out.println(unioKorisnik);

	}

}
