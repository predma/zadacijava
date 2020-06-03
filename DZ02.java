package edunova;

import javax.swing.JOptionPane;

public class DZ02 {
	
	public static void main(String[] args) {
		//Unesi koliko je caffe bar prodao sokova naranče 0,2l. U jednom paketu nalazi se 12 bočica. 
		//Ispiši koliko je prodano soka u litrama i paketa i koliko je zaradio ako je 
		//nabavna cijena jedne bočice 4kn, a prodajna cijena 10kn
		
		int brojSokova=Integer.parseInt(JOptionPane.showInputDialog("Unesi brojprodanih bočica"));
		
		float litara=brojSokova*(float)0.2;
		float paketa=brojSokova/(float)12;
		int zarada=brojSokova*(10-4);
		
		System.out.println(litara);
		System.out.println(paketa);
		System.out.println("Zarađeno "+zarada+" Kn");
		
	}

}
