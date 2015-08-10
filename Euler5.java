package Euler;

public class Euler5 {
	public static boolean find(long s){
		for(int i = 2; i <= 10; i++){
			if(!(s % i == 0)) return false;
			s++;
			break;
		}
		return true;
	}

	public static void main(String[] args) {
		long s = 20;
		if(find(s)){
			System.out.println(s);
		}
		

	}

}
