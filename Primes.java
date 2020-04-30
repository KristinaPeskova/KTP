public class Primes {
	public static void main(String[] args){
		for (int i=2; i<101; i++){
			if (isPrimes(i)) System.out.println(i);
		}
	}
	public static boolean isPrimes(int n) {
		for (int i=2; i<=n/2;i++){
			if (n % i == 0) return false;
		}
		return true;
	}
}
