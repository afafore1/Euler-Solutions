
public class Euler10 {
	public static boolean isPrime(long i){
		if(i != 2 && i % 2 == 0) return false; // even is not prime except 2

		for(int x = 3; x <= Math.sqrt(i); x+=2){
			if(i % x == 0) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 2000000;
		long sum = 0;
		for(int i = 2; i < n; i++){
			if(isPrime(i)){
				sum+=i;
			}
		}
		System.out.println(sum);

		long nSum = 0;
		boolean [] isPrime = new boolean[(n + 1)];		
		for(int i = 2; i < n; i++){ 
			 // Assume every number is prime except even numbers
			if(i % 2 == 0 && i != 2){ 
				isPrime[i] = false;
			}else{
				isPrime[i] = true;
			}
		}

		for(int i = 3; i < n; i+=2){ //only check for odd
			if(isPrime[i]) {
				for(int j = i*i; j < n; j+=i){
					isPrime[j] = false;
				}
			}
		}
		for(int i = 2; i <= n; i++){
			if(isPrime[i]){
				nSum+= i;
			}
		}
		System.out.println(nSum);

	}

}
