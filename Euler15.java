package Euler;

import java.math.BigInteger;

public class Euler15 {
	public static long bCo(int n, int k){
		if(k >(n-k)) 
			k = n - k;
		
		long c = 1;
		for(int i = 0; i<k; i++){
			c = c*(n-i);
			c = c/(i+1);
		}
		return c;
	}
	public static BigInteger factorial(int n1){
		BigInteger n = BigInteger.ONE;
		for(int i = 1; i <= n1; i++){
			n = n.multiply(BigInteger.valueOf(i));
		}
		return n;
	}

	public static void main(String[] args) {
		long s = System.currentTimeMillis();
		System.out.println(bCo(40,20));
		long end = System.currentTimeMillis();
		long time = end - s;
		System.out.println(time+" ms");
		long b = System.currentTimeMillis();
		int n = 40;
		int r = 20;
		BigInteger num = factorial(r).multiply(factorial(n-r)); //n!/r!*(n-r)! (n choose r)
		System.out.println(factorial(n).divide(num));
		long e = System.currentTimeMillis();
		long t = e-b;
		System.out.println("time taken is "+t+" ms");

	}


}
