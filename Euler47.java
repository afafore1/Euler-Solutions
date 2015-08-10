package Euler;

public class Euler47 {
	private static boolean isaPrime(long n){
		if(n % 2 == 0) return false;
		for(int i = 3; i <= (int)Math.sqrt(n); i+=2){
			if(n % i == 0) return false;
		}
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i = 1; i <= 20; i++){
				//if()
		}

	}

}
