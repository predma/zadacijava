package edunova;

import javax.swing.JOptionPane;

public class DZ01 {
	
	public static void main(String[] args) {
		
//Trkač je istrčao određenu dužinu za određeno vrijeme (sat,minute,sekune). 
//Ispiši: istrčanu dužinu (km), ukupno vrijeme trčanja i prosjek istrčanih minuta u jednom kilometru (pace)
		
		int duzina=Integer.parseInt(JOptionPane.showInputDialog("Unesi dužinu (km)"));
		int sat=Integer.parseInt(JOptionPane.showInputDialog("Unesi sat"));
		int minuta=Integer.parseInt(JOptionPane.showInputDialog("Unesi minutu"));
		int sekunda=Integer.parseInt(JOptionPane.showInputDialog("Unesi sekunda"));
		
		
		//konverzija vremena u sekunde
		int vrijeme=sat*3600+minuta*60+sekunda;
	
		
		//prosječna brzina (pace) u sekundama
		int speed=vrijeme/duzina;
		
		//konverzija prosječne brzine u min:sec		
		int sec=speed % 60;
		int min=(speed-sec)/60;
		
	
		System.out.println("Trkač je pretrčao "+duzina+" km., u vremenu od "+sat+":"+minuta+":"+sekunda+". Prosječna brzina trčanja jednog kilometra je: "+min+" min. i "+sec+" sek.");
		
	
		
	}

}
