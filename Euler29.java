package Euler;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Euler29 {

	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		Set<Double> theSet = new <Double>HashSet();
		int c = 0;
		for(int a = 2; a <= 100; a++){
			for(int b = 2; b <=100; b++){
					theSet.add(Math.pow(a, b));
			}
		}
		System.out.println(theSet.size());
		long end = System.currentTimeMillis();
		long t = end - start;
		NumberFormat formater = new DecimalFormat("#0.00000");
		System.out.print("\nExecution time is " + formater.format((end - start) / 1000d) + " seconds\n");
		System.out.println("Time taken "+ t+" ms");

	}

}
