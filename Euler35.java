package Euler;

public class Euler35 {
	public static boolean isaPrime(String s){
		int string = Integer.parseInt(s);
		// Function to check if a number is prime
		if(string % 2 == 0 && string != 2) return false;
		if(string == 1) return false;
		for(int i = 3; i*i<= string; i+=2){
			if(string % i == 0) return false;
		}
		return true;
	}
	
	private static boolean isCircularP(int n){
		String s = Integer.toString(n);
		for(int i = 0; i < s.length(); i++){
			if(!isaPrime((s.substring(i) + s.substring(0,i)))) return false;
		}
		return true;
	}

	
	public static void main(String[] args) {
		long count = 0;
		int max = 1000000;
		int lim = (int) Math.sqrt(max);
		boolean [] isPrime = new boolean [max  + 1];
		for(int i = 2; i < max; i++){
			isPrime[i] = true;
		}
		for(int i = 2; i <= lim; i++){
			if(isPrime[i]){
				for(int j = i; j * i < max; j++){
					isPrime[j*i] = false;
				}
			}
		}
		
		for(int i = 2; i <= max; i++){
			if(isPrime[i]){
				if(isCircularP(i)) count++;
			}
		}
		System.out.println(count);
//		System.out.println(permString("", x));
	}

}
