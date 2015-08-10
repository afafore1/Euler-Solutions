package Euler;

import java.text.DecimalFormat;
import java.text.NumberFormat;

public class Euler4 {

	  public static boolean isPalindrome(int n){
	        int reverse = 0;
	        int num = n;
	        while(num > 0){
	            int mod = num % 10;
	            reverse = reverse * 10 + mod;
	            num = num/10;
	        }
	        
	        if(reverse != n){
	            return false;
	        }
	        return true;
	    }
	  
	  public static boolean isPal(String s){
		  if(s.length() == 0 || s.length() == 1){
			  return true;
		  }
		  if(s.charAt(0) == s.charAt(s.length() -1))
			  return isPal(s.substring(1,s.length()-1));
		  return false;
	  }
	  
	  public static boolean isPalin(long n){
		  String v = String.valueOf(n);
		  if(v.charAt(0) != v.charAt(v.length() -1)){
			  return false;
		  }
			StringBuilder s = new StringBuilder();
			char [] chars = String.valueOf(n).toCharArray();
			for(int i = chars.length -1; i >= 0; i--){
				s.append(chars[i]);
			}
			String r = String.valueOf(s);
			long reverse = Long.parseLong(r);
			if(reverse == n){
				return true;
			}
			return false;
		}
	  
	    public static void main(String [] args){	    	
	    	int max = 0;
	    	long startTime = System.currentTimeMillis();
	        for(int i = 999; i >= 0; i--){
	            for(int j = 999; j >=i; j-- ){
	                if(isPalindrome(j*i)){
	                	if(j*i > max)
	                    max= j*i;
	                    break;
	                }
	            }
	        }
	        System.out.println(max);
	        long endTime = System.currentTimeMillis();
			NumberFormat formatter = new DecimalFormat("#0.00000");
			System.out.print("Execution time for isPalindrome is " + (endTime - startTime) + " milliseconds\n");
			long sTime = System.currentTimeMillis();
			 for(int x = 999; x >= 100; x--){
		            for(int y = 999; y >= x; y-- ){
		            	String s = String.valueOf(y*x);
		                if(isPal(s)){
		                	if(y*x > max)
		                    max= y*x;
		                    break;
		                }
		            }
		        }
			 System.out.println(max);
			 long eTime = System.currentTimeMillis();
			 NumberFormat formattter = new DecimalFormat("#0.00000");
			 System.out.print("Execution time for isPal is " + (eTime - sTime) + " milliseconds\n");

			 
			 long stTime = System.currentTimeMillis();
			 for(int s = 999; s >= 100; s--){
		            for(int t = 999; t >=s; t-- ){
		                if(isPalin(t*s)){
		                	if(t*s > max)
		                    max= t*s;
		                    break;
		                }
		            }
		        }
			 System.out.println(max);
			 long etTime = System.currentTimeMillis();
			 NumberFormat formtter = new DecimalFormat("#0.00000");
			 System.out.print("Execution time for isPalin is " + (etTime - stTime) + " milliseconds\n");


	    }
	    
}
