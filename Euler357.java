package Euler;

public class Euler357 {	
	public static boolean isaPrime(long n){
		if(n % 2 == 0 && n != 2 || n == 1) return false;
		for(int i = 3; i < (int)Math.floor(Math.sqrt(n)); i+=2){
			if(n % i == 0) return false;
		}
		return true;
		
	}
	
//	public static boolean isPrime(int x){
//		boolean [] isPrime = new boolean[x+1];
//		//for(int i = 2; )
//	}
	
//	private static boolean isPrimeGen(int n){

//		for(int i = 1, end = (int) Math.sqrt(n); i<= end; i++){
//			if(n % i == 0){
//				if(!isPrime[(i+n)/i]) return false;
//			}
//		}
//		return true;
//	}

	public static void main(String[] args) {
		int max = 1000;
		long sum = 0;
		int lim = (int) Math.sqrt(max);
		boolean [] isPrime = new boolean[max+2];
		for(int d = 2; d <= max; d++){
			isPrime[d] = true;
		}
		
		for(int d = 2; d <= lim; d++){
			if(isPrime[d]){
				for(int j = d; j*d <= max; j++){
					isPrime[j*d] = false;
				}
			}
		}
		for(int i = 28; i <= 30; i++){
			for(int x = 1, end = (int) Math.sqrt(i); x <= end; x++){
				if(i % x == 0){
					if(!isPrime[x+i/x]){
						continue;						
					}else{
						System.out.println(i);
						
					}
				}
			}
		}
		System.out.println(sum);
		
		
	
//		long start = System.currentTimeMillis();
//		long sum = 0;
//		int max = 30;
//		for(int i = 0; i <= max; i++){
//			if(isPrimeGen(i)){
//				sum+=i;
//			}
//		}	
//		long end = System.currentTimeMillis();
//		System.out.println("Sum is "+sum);
//		System.out.println("Time taken "+(end - start)+" ms");
	}

}
