package Euler;

import java.util.Arrays;

public class Euler50 {
	public static boolean isaPrime(int x){
		// Function to check if a number is prime
		if(x % 2 == 0 && x != 2) return false;
		for(int i = 3; i*i<= x; i+=2){
			if(x % i == 0) return false;
		}
		return true;
	}
	public static void main(String[] args) {
		long begin = System.currentTimeMillis();
		int n = 1000000;
		long maxP = 0;
		long sum = 0;
		boolean [] isPrime = new boolean [n + 1];
		for(int i = 2; i < n; i++){
			isPrime[i] = true;
		}
		for(int i = 2; i*i< n; i++){
			if(isPrime[i]){
//				if(i != 2 && i != 3 && i != 5){
//					sum+=i;
//					if(isaPrime(sum)){
//						if(sum < 2000000) {
//							maxP = sum;
//						}
//					}
//				}
				for(int j = i * i; j <= n; j+=i){
					isPrime[j] = false;
				}
			}
		}
		for(int i = 11; i < n; i++){
			if(isPrime[i]){
				sum+=i;
				if(isaPrime((int) sum)){
					if(sum < 100000000){
						maxP = sum;
					}
				}
			}
		}
		long end = System.currentTimeMillis();
		System.out.println(end - begin +" ms");
		System.out.println(maxP); // print max prime add under 1 mil
	}
}
