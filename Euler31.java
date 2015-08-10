package Euler;

public class Euler31 {

	public static void main(String[] args) {
		long s = System.currentTimeMillis();
		int targ = 200;
		int ways = 0;
		for(int a = targ; a >= 0; a-= 200){
			for(int b = a; b >= 0; b-=100){
				for(int c = b; c >= 0; c-= 50){
					for(int d = c; d >= 0; d-=20){
						for(int e = d; e >= 0; e-=10){
							for(int f = e; f >= 0; f-=5){
								for(int g = f; g >= 0; g-=2){
									ways++;
								}
							}
						}
					}
				}
			}
		}
		long e = System.currentTimeMillis();
		System.out.println(ways);
		System.out.println("Time taken "+(e-s)+" ms");
		s = System.currentTimeMillis();
		final int target = 200;
		int[] coins = { 1, 2, 5, 10, 20, 50, 100, 200};
		int[] coefficient = new int[target + 1];
		coefficient[0] = 1;
		for (int limit : coins) {
			for (int x = 0; x <= target - limit; x++) {
				coefficient[x + limit] += coefficient[x];
			}
		}
		e = System.currentTimeMillis();
		System.out.println(coefficient[target]);
		System.out.println("Time taken "+(e-s)+" ms");
	}

}
