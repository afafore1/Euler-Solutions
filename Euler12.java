package Euler;

import java.text.DecimalFormat;
import java.text.NumberFormat;

public class Euler12 {

	public static int Factors(int n){
		// get factors
		int div = 0;
		int s = (int) Math.sqrt(n); 
		for(int i = 2; i <= s + 1; i++){
			if(n % i == 0){
				div++;
			}
		}
		return 2 * div;
		
	}

	public static void main(String[] args) {
		    int counter = 0;
	        int TriangleNumber = 0;
	        boolean Switch = true;
	        long startTime = System.currentTimeMillis();
	        while(Switch){
	            counter ++;
	            TriangleNumber += counter;
	            
	            if(Factors(TriangleNumber) > 500){
	                System.out.println(TriangleNumber);
	                Switch = false;
	            }
	        }
	        long endTime = System.currentTimeMillis();
			NumberFormat formatter = new DecimalFormat("#0.00000");
			System.out.print("\nExecution time is " + formatter.format((endTime - startTime) / 1000d) + " seconds\n");	

		
		
	}


}
