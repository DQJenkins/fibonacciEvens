package fibonacciEvens;

public class FibonacciEvens {

	public static void main(String[] args) {
		int nminustwo = 1;
		int nminusone = 2;
		int nthterm = 3;
		//Start with 2, as that value is already accounted for above
		int total = 2;
		
		do {
			nthterm = nminusone + nminustwo;
			
			if (nthterm % 2 == 0) {
				total += nthterm;
			}
			nminustwo = nminusone;
			nminusone = nthterm;
		} while (nthterm < 4000000);
		
		System.out.println("Sum of even terms: " + total);

	}

}
