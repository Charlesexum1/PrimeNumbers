public class PrimeNumbers {
	
	private boolean isPrime(int n) {
		boolean prime = true;
		for (int x = 2; x < n; x++) {
			if (n % x == 0) {
				prime = false;
				}
			}
		return prime;	
		}
		
	
	public static void main (String[] args) {
		
		
		PrimeNumbers demo = new PrimeNumbers();		
		System.out.println(demo.isPrime(3));
		System.out.println(demo.isPrime(4));
		System.out.println(demo.isPrime(5));
		System.out.println(demo.isPrime(11));
		System.out.println(demo.isPrime(10));
		
		
		}
	
	}
