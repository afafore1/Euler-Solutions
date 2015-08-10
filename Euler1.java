package Euler;

import java.text.DecimalFormat;
import java.text.NumberFormat;

public class Euler1 {
	public static void muls(int n){
		boolean [] divs = new boolean[(n+1)];
		int sum = 0;
		for(int i = 3;i < n; i+=3){
			divs[i] = true;
		}
		for(int j = 5; j < n; j+=5){
			divs[j] = true;
		}
		for(int i = 2;i < n; i++){ // 
			if(divs[i]){
				sum+=i;
			}
		}
		System.out.println(sum);
		
	}

	public static void main(String [] args){
        // simple way, through brute force
		long sum = 0;
		int max = 10000000;
		long startTime = System.currentTimeMillis();
		muls(max);
		long endTime = System.currentTimeMillis();
		NumberFormat formater = new DecimalFormat("#0.00000");
		System.out.print("\nExecution time for func is " + formater.format((endTime - startTime) / 1000d) + " seconds\n");
		long sTime = System.currentTimeMillis();
		for(int i = 0; i < max; i++){
			if(i % 3 == 0 || i % 5 == 0){
				sum+=i;
			}
		}
		System.out.println(sum);
		long eTime = System.currentTimeMillis();
		NumberFormat formatter = new DecimalFormat("#0.00000");
		System.out.print("\nExecution time for norm is " + formater.format((eTime - sTime) / 1000d) + " seconds\n");

		startTime = System.currentTimeMillis();
		long n = 10000000-1;
		System.out.println("Jack's: ");
		long daAnswa = 3*(n/3)*((n/3)+1)/2 + 5*(n/5)*((n/5)+1)/2 - 15*(n/15)*((n/15)+1)/2;
		System.out.println(daAnswa);
		endTime = System.currentTimeMillis();
		System.out.print("\nExecution time for func is " + formater.format((endTime - startTime)) + " seconds\n");		
    }

}
