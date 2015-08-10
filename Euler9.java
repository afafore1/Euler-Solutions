package Euler;

import java.text.DecimalFormat;
import java.text.NumberFormat;

public class Euler9 {
	public static void find(int ans){
		int a,b,c; // declare var
		for(a = 1; a < ans; a++){
			for(b = a; b < ans; b++){
				c = ans - a - b; // set c = 1000 - a - b
				// we check condition we want.. a<b<c... a^2 + b^2 = c^2
				// multiply them... and that's our answer.
				if(a < b && b < c && Math.pow(a, 2) + Math.pow(b, 2) == Math.pow(c, 2)){ 
					System.out.println(a + " "+ b + " "+ c);	
					int product = a*b*c;
					System.out.println(product);
				}
			}
		}		
		
	}

	public static void main(String[] args) {
		long startTime = System.currentTimeMillis();
		int number = 1000;
		find(number);
		long endTime = System.currentTimeMillis();
		NumberFormat formatter = new DecimalFormat("#0.00000");
		System.out.print("\nExecution time is " + formatter.format((endTime - startTime) / 1000d) + " seconds\n");	

	}

}