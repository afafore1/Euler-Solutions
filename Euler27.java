package Euler;

public class Euler27 {
	private static boolean isPrime(long n){
		if(n % 2 == 0 && n != 2) return false;
		int lim = (int) Math.sqrt(n);
		for(int i = 3; i <= lim; i+=2){
			if(n % i == 0) return false;
		}
		return true;
	}
	private static int ConsecPrimes(int a, int b){
		for(int i = 0; ; i++){
			int ans = (int) Math.pow(i, 2) + a*i + b;
			if(ans < 0 || !isPrime(ans)) return i;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int bestN = 0;
		int bestA = 0;
		int bestB = 0;
		for(int a = -1000; a < 1001; a++){
			for(int b = -1000; b < 1001; b++){
				int ans = ConsecPrimes(a,b);
				if(ans > bestN){
					bestN = ans;
					bestA = a;
					bestB = b;
				}
			}
		}
		int result = bestA * bestB;
		System.out.println(result);
		

	}

}
