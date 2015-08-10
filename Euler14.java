package Euler;

import java.util.LinkedList;


public class Euler14 {
	static final short[] cache = new short[1000000];
	
	public static int CollazSum(long n){
		if(n == 1) return 1;
		if(n < cache.length){
			int count = cache[((int) n)];
			if(count > 0){
				return count;
			}
		}
		int next = (n & 1) == 0 
				? 1 + CollazSum(n >> 1)
						: 2 + CollazSum((n * 3 + 1) >> 1);
				if(n < cache.length)
					cache[((int) n)] = (short) next;
				return next;
	}
	static{
		for(int i = 10; i < cache.length; i *= 2)
			CollazSum(i - 1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		long start = System.currentTimeMillis();
		int len = 0, res = 0;
		for(int i = 1; i < 1000000; i++){
			int maxCount = CollazSum(i);
			if(maxCount > len){
				len = maxCount;
				res = i;
			}
		}
		long end = System.currentTimeMillis();
		System.out.println(res+ " with chain size of "+len);
		System.out.println(end - start +" ms");

	}

}
