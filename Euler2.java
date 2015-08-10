package Euler;

import java.math.BigInteger;
import java.text.DecimalFormat;
import java.text.NumberFormat;

public class Euler2 {
	// 1,1,2,3,5,8,13,21...
	public static void fibo(long n){
		int b =1;
		int c = 2; 
		int d;
		long sum = 0;
		long startTime = System.currentTimeMillis();
		while(c < n){
			sum+= c;
			d = b + (c<<0x01);
			c = d+b+c;
			b = d;
		}
		System.out.println(sum);
		long endTime = System.currentTimeMillis();
		System.out.print("\nExecution time for fibo is " + (endTime - startTime) + " nanoseconds\n");
	}

	public static void main(String [] args){
		int curr=1;
		int prev=0;
		int answer=0;
		int sum =0;
		long max = Long.parseLong("400000000");
		fibo(max);
		long startTime = System.currentTimeMillis();
		while (answer<=max)
		{
			answer = prev+curr;
			prev=curr;
			curr=answer;
			if(answer%2==0) sum+=answer;
		}
		System.out.println(sum);//answer=4613732 runtime=0.00 secs
				long endTime = System.currentTimeMillis();
				System.out.print("\nExecution time is " + (endTime - startTime) + " nanoseconds\n");

	}

}
