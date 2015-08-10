package Euler;

public class Euler77 {
	
	private static int search(int lim, int target){
		boolean [] isPrime = new boolean [lim + 1];
		for(int i = 2; i <= lim; i++){
			isPrime[i] = true;
		}
		for(int i = 2; i <= (int)Math.sqrt(lim); i++){
			if(isPrime[i]){
				for(int j = i*i; j <= lim; j+=i){
					isPrime[j] = false;
				}
			}
		}
		
		int [] part = new int[lim];
		part[0] = 1;
		for(int i = 0; i < part.length; i++){
			if(!isPrime[i]) continue;
			for(int j = i; j < part.length;j++){
				part[j] += part[j-i];
			}
		}
		for(int i = 0; i < lim; i++){
			if(part[i] > target){
				return i;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		// TODO Auto-generated method stub
		for(int lim = 1; ; lim+=2){
			int result = search(lim,5000);
			if(result != -1) {
				System.out.println(result);
				break;
			}
		}
		long end = System.currentTimeMillis();
		System.out.println("Time taken "+(end - start)+ " ms");

	}

}
