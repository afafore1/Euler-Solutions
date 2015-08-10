package Euler;

public class Euler39 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long result = 0, resultSol = 0;
		for(long p = 2; p <= 1000; p+=2){
			int numOS = 0;
			for(long a = 2; a < (p/3); a++){
				if(p*(p-2*a) % (2*(p-a)) == 0){
					numOS++;
				}
			}
			if(numOS > resultSol){
				resultSol = numOS;
				result = p;
			}
		}
		System.out.println(result);

	}

}
