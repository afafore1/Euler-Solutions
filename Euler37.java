package Euler;

public class Euler37 {
	public static boolean isaPrime(long x){
		// Function to check if a number is prime
		if(x % 2 == 0 && x != 2) return false;
		if(x == 1) return false;
		for(int i = 3; i*i<= x; i+=2){
			if(x % i == 0) return false;
		}
		return true;
	}
	public static boolean checkTrun(long n){
		long p = 10;
		while(p < n){ // 3797..
			if(!isaPrime(n/p) || !isaPrime(n%p)) return false; //7..397..97..
			p*=10;
		}
		return true;
	}
	
	public static void main(String[] args) {
		long stime = System.currentTimeMillis();
		int lim = 1000000;
		int sum = 0;		
		boolean [] isPrime = new boolean[lim + 1];
		for(int i = 2; i <= lim; i++){
			isPrime[i] = true;
		}
		for(int i = 2; i*i <= lim; i++){
			if(isPrime[i]){
				for(int j = i; j*i<= lim; j++){
					isPrime[j*i] = false;
				}
			}
		}
		for(int i = 10; i < lim; i++){
			if(isPrime[i]){
				if(checkTrun(i)) sum+=i;
			}
		}
		long etime = System.currentTimeMillis();
		System.out.println(sum);
		System.out.println("Time taken "+(etime-stime)+" ms");

	}

}
