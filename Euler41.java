package Euler;

//1-9
//123456789

public class Euler41 {
	private static boolean isPrime(int n){
		if(n == 2 || n == 3) return true;
		if(n == 1 || n % 2 == 0) return false;
		for(int i = 3; i * i <= n; i+=2){
			if(n % i == 0) return false;
		}
		return true;
	}
	
	public static void permString(String bString, String eString){

		String v = " ";
		if(eString.length() <= 1){
//			if(isPrime[Integer.parseInt(String.valueOf(bString+eString))]){
//				System.out.println(" Permutations are "+bString + eString);
//			}
			v = bString + eString;
			//if(isPrime(Integer.parseInt(v))){
				
			//}
		}
		else
			for(int i = 0; i < eString.length(); i++){
				try{
					String nString = eString.substring(0, i) + eString.substring(i+1);
					permString(bString + eString.charAt(i), nString);
				} catch (StringIndexOutOfBoundsException exception){
					exception.printStackTrace();
				}
		
				
			}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		permString("","123456789");

	}

}
