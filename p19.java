package Euler;

public class p19 {
	
	private static long mod(long x, long y){
		x%=y;
		if(y > 0 && x < 0 || y < 0 && x > 0)
			x+=y;
		return x;
	}
	// Zeller's congruence
	private static int dayOfWeek(int year, int month, int day){
		long m = mod((long)month - 3, 4800);
		long y = mod(year + m /12, 400);
		m%=12;
		return (int)((y+y/4 - y/100 +(13*m + 2) /5 + day + 2) % 7);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count = 0;
		for(int yr = 1901; yr<= 2000; yr++){
			for(int mnt = 1; mnt <= 12; mnt++){
				if(dayOfWeek(yr,mnt,1) == 0)
					count++;
			}
		}
		System.out.println(Integer.toString(count));

	}

}
