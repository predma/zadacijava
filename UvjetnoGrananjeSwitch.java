package edunova;

public class UvjetnoGrananjeSwitch {

	public static void main(String[] args) {
		int i=2;
		
		switch(i) {
		case 1:
			System.out.println("Nedovoljan");
		break;
		
		case 2:
			System.out.println("Dovoljan");
		break;
		
		default:
			System.out.println("Ostalo");
		}
		
		char z='a';
		
		switch(z) {
		
		case 'a':
		case 'b':
			
			System.out.println("slova");
			break;
			
		case '1':
			System.out.println("brojevi");
		}
		
	
	
	
		
		
	}

}
