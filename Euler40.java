package Euler;

public class Euler40 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int prod = 1;
		StringBuilder s = new StringBuilder();
		for(int i =1; i < 1000000; i++){
			s.append(i);			
		}
		for(int i = 0; i <= 6; i++){
			prod*= s.charAt((int) (Math.pow(10, i)- 1)) - '0';
		}
		System.out.println(prod);
	}

}
