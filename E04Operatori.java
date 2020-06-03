package edunova;

public class E04Operatori {
	
	public static void main(String[] args) {
		//https://docs.oracle.com/javase/tutorial/java/nutsandbolts/operators.html
		
		// = operator dodjeljivanja (vrijednost s desne strane se dojeli lijevoj
		// + operator zbrajanja 
		
		int i=2; //zamislimo da je korisnik unio tu vrijednost
		i=i+1;
		System.out.println(i); //3
		i+=1;
		System.out.println(i); //4
		i++;
		System.out.println(i); //5
		++i;
		System.out.println(i); //6
		
		// ++ increment
		// ++i i i++ nije jedno te isto
		// ++i prvo uveća za jedan pa koristi
		// i++ prvo koristi pa uveća
		
		//kombinatorika
		//i je 6
		int j=1;
		i = j++ - i; //j=1 1-6 = -5
		i=i-j; //j=2, -5-2 = -7
		System.out.println(i);
		
		// - oduzimanje
		// --
		// dekrement
		
		// * množenje
		// / djeljenje
		
		int k=7, t=4;
		//na snazi je implicitna konverzija
		System.out.println(k/t);
		
		// explicitna konverzija - cast
		float decimalniBroj=k/(float)t;
		System.out.println(decimalniBroj);
		
		
		// % operator modulo - ostatak nakon cjelobrojnog djeljenja
		t=9;
		System.out.println(t%2);
		t=8;
		System.out.println(t%2);
		
	}

}
