package Euler;

import java.util.HashSet;
import java.util.Set;

public class Euler87 {

	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		int limit = 50000000;
		int count = 0;
		int lim = (int) Math.sqrt(limit);
		boolean [] isPrime = new boolean[limit + 1];
		for(int i = 2; i <= limit; i++){
			isPrime[i] = true;
		}
		for(int i = 2; i <= lim; i++){
			if(isPrime[i]){
				for(int j = i; j * i <= limit; j++){
					isPrime[j*i] = false;
				}
			}
		}
		for(int i = 2; i <= limit; i++){
			if(isPrime[i]){
				count++;
			}
		}
		int [] primes = new int[count];
		int x = 0;
		for(int i = 2; i <= limit; i++){
			if(isPrime[i]){
				primes[x] = i;
				x++;
			}
		}
		Set<Integer> sums = new HashSet<Integer>();
		sums.add(0);
		for(int i = 2; i <= 4; i++){
			Set<Integer> newsums = new HashSet<Integer>();
			for(int p : primes){ // loop through primes
				long q = 1; 
				for(int j = 0; j < i; j++){
					q *=p; // q = p^i.. 1 * 2,2*2,4*2
				}
					if(q > limit) break;
					int r = (int) q; // set r = q
					for(int z : sums){
						if(z + r <= limit) 
							newsums.add(z + r);
					}
			}
			sums = newsums;
		}
		long end = System.currentTimeMillis();
		System.out.println(Integer.toString(sums.size()));
		System.out.println("Time taken is "+(end - start)+ " ms");
	}
}
