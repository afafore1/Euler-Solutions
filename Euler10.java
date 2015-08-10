package Euler;

import java.text.DecimalFormat;
import java.text.NumberFormat;

public class Euler10 {

	public static void main(String[] args) {
		int n = 2000000;
		int limit =(int) Math.sqrt(n);
		int count = 0;
		long startTime = System.currentTimeMillis();
		boolean [] isPrime = new boolean[(n + 1)];
		for(int i = 2; i <= n; i++){ // Every number is prime
			isPrime[i] = true;
		}
		for(int i = 3; i < n; i+=2){ 
			isPrime[i] = true;
					for(int j = i*i; j < n; j+=i){
						isPrime[j] = false;
					}
			}
		long sum = 0;
		for(int i = 2; i <= n; i++){
			if(isPrime[i]){
				//System.out.println(i);
				sum+= i;
			}
		}
		System.out.println(sum);
		long endTime = System.currentTimeMillis();
		NumberFormat formatter = new DecimalFormat("#0.00000");
		System.out.print("\nExecution time is " + formatter.format((endTime - startTime) / 1000d) + " seconds\n");


	}



}
