package Euler;

import java.math.BigInteger;

public class Euler30 {

	public static void main(String[] args) {
		long startTime = System.currentTimeMillis();
		int start = 1630;
		int Tsum = 0;
		while(start < 1000000){
			int sum = 0;
			int n = start;
			while(n > 0){
				int mod = n % 10;
				sum += Math.pow(mod, 5);
				n /= 10;
			}
			if(sum == start) {
				Tsum += sum;
				System.out.println(sum);
			}
			start++;
		}
		long endTime = System.currentTimeMillis();
		long time = endTime - startTime;
		System.out.println("Found "+Tsum+ " in "+time+" ms");

	}

}
