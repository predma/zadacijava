package edunova;

public class UvjetnoGrananjeIf {
	
	
	private static boolean uvjet1() {
		System.out.println("Bitan posao1");
		
		return false;
	}
	
	private static boolean uvjet2() {
		System.out.println("Bitan posao2");
		
		return false;
	}
	
	

	public static void main(String[] args) {
		int i = 1;

		boolean uvjet = i == 1;

		// osnovna izvedba if naredbe
		if (uvjet) {
			System.out.println("OK");
		}

		if (i == 2) {

			System.out.println("2");
		}

		if (i > 0) {

			System.out.println("Veće");
		} else {
			System.out.println("Manje ili jednako");
		}

		// bad practice
		i=-4;
		if (i >= 0)
			System.out.println("Veće jednako od 0");
		System.out.println("I ovo je veće od 0");

		
		int j=1;
		//& logički i "and"  |1& provjerava oba dva uvjeta
		if(i<0 & j>0) {
			System.out.println("Zadovoljena oba uvjeta");
			
		}
		
		//&& u slučaju ne zadovoljenja prvog uvjeta
		//drugi se ne provjerava
		
		if(i<0 && j>0) {
			System.out.println("ZOB");
		}
		
		if(uvjet1() && uvjet2()) {		
			
			System.out.println("OK");
			
		}
		
		
		//isto vrijed i za ili
		// altgr+w
		// || ili ne provjerava drugi ako je prvi zadovoljen
		if(uvjet1() || uvjet2()) {
			System.out.println("od");
		}
		
		if(i%2==0) {
			//
		}else if(i%3==0) {
			//
		}else if(i%4==0){
			//
		}else { // na kraju ne mora biti else
			//
		}
		
		
		if(i==2) {
			if(j==3) {
				
			}
		}
		
	}

}
