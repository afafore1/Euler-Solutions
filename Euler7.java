package Euler;

import java.math.BigInteger;
import java.text.DecimalFormat;
import java.text.NumberFormat;

public class Euler7 {
	public static void main(String[] args) {
		int c = 0;
		final int limit = 200000;
		boolean prime[] = new boolean[(limit-1)/2];
		long sTime = System.currentTimeMillis();
		for (int i = 1; i <= prime.length; i++) {
			for (int j = 1; 2*i*j+i+j-1 < prime.length; j++) {
				prime[2*i*j+i+j-1] = true;
			}
		}
		for (int i = 1; i <= prime.length; i++) {
			if(!prime[i-1]){
				c++;
				if(c == 10000){
					System.out.print((i*2+1)+" ");
					break;
				}
			}
		}
		long eTime = System.currentTimeMillis();
		NumberFormat formater = new DecimalFormat("#0.00000");
		System.out.print("\nExecution time for Sandaram is " + formater.format((eTime - sTime) / 1000d) + " seconds\n");
	}

}
