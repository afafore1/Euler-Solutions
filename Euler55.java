package Euler;

import java.math.BigInteger;
import java.text.DecimalFormat;
import java.text.NumberFormat;

public class Euler55 {
	public static BigInteger reverse(BigInteger n){
		BigInteger rev = BigInteger.ZERO;
		BigInteger num = n;
		while(num.compareTo(BigInteger.ZERO) > 0){
			BigInteger mod = num.mod(BigInteger.TEN);
			rev = rev.multiply(BigInteger.TEN).add(mod);
			num =  num.divide(BigInteger.TEN);
		}
		return rev;
	}
	
	public static boolean isPalindrome(BigInteger n){
		BigInteger rev = BigInteger.ZERO;
		BigInteger num = n;
		while(num.compareTo(BigInteger.ZERO) > 0){
			BigInteger mod = num.mod(BigInteger.TEN);
			rev = rev.multiply(BigInteger.TEN).add(mod);
			num =  num.divide(BigInteger.TEN);
		}
		if(rev.equals(n)) return true;
		return false;
	}

	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		int c = 0;
		for(long i = 11; i < 10000; i++){
			boolean nFound = true;
			int count = 0;
			BigInteger t = BigInteger.valueOf(i);
			while(nFound){
				BigInteger temp = reverse(t);
				BigInteger sum = temp.add(t);
				if(isPalindrome(sum)){
					nFound = false;
				}else{
					t = sum;
					count++;
				}
				if(count >= 50){
					c++;
					nFound = false;
				}
			}
		}
		long end = System.currentTimeMillis();
		System.out.println("\ncount is "+c);
		NumberFormat formatter = new DecimalFormat("#0.00000");
		System.out.print("\nExecution time is " + formatter.format((end - start) / 1000d) + " seconds\n");
		//System.out.println("Time taken "+(end-start)+" ms");

	}

}
