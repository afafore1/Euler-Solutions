package Euler;

public class Euler36 {
	public static boolean isPal(int n){
		int reverse = 0;
		int num = n;
		while(num > 0){
			int mod = num % 10;
			reverse = reverse * 10 + mod;
			num/= 10;
		}
		if(reverse == n){
			return true;
		}
		return false;
	}

	public static boolean isPalBin(int n){
		int reverse = 0;
		int num = n;
		while(num > 0){
			int mod = num % 2;
			reverse = reverse * 2 + mod;
			num/= 2;
		}
		if(reverse == n){
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 1;
		int sum = 0;
		long s = System.currentTimeMillis();
		for(;i < 1000000;i++){
			if(isPal(i) && isPalBin(i)){
				sum+=i;
				System.out.println(i +" in binary: "+Integer.toBinaryString(i));
			}
		}
		long e = System.currentTimeMillis();
		System.out.println("\nSum of all Double base Palindrome is "+sum);
		System.out.println("time taken "+(e-s)+" ms");
		

	}

}
