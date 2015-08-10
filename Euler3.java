package Euler;

import java.math.BigInteger;
import java.text.DecimalFormat;
import java.text.NumberFormat;

public class Euler3 {
	
	public static boolean isPrime(long i){
		for (int j = 2; j < i; j++){
			if(i %j == 0){
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		long startTime = System.currentTimeMillis();
		long limit = Long.parseLong("600851475143");
		long lim = (int) Math.sqrt(limit);
		for(long i = (lim/100) ; i >= 0; i--){
			if(isPrime(i)){
				if(limit%i == 0	){
				System.out.println(i);
					break;
				}
			}
		}
		long endTime = System.currentTimeMillis();
		NumberFormat formatter = new DecimalFormat("#0.00000");
		System.out.println((endTime-startTime)+" ms");
		System.out.print("\nExecution time is " + formatter.format((endTime - startTime) / 1000d) + " seconds\n");
		
	}
			
}
