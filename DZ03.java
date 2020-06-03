package edunova;

import javax.swing.JOptionPane;

public class DZ03 {
	
	public static void main(String[] args) {
				
		//Izračuna potrošnju vozila ako automobil troši 5.2l na 100 km, a prešao je (unesi broj kilometara)
		
		int km=Integer.parseInt(JOptionPane.showInputDialog("Unesi broj pređenih kilometara"));
		
		float potrosnja=(float)5.2;
		
		float ukupnaPotrosnja=(km/100)*(float)potrosnja;
		
		System.out.println(ukupnaPotrosnja);
		
	}

}
