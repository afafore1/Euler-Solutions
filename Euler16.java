package Euler;
import java.math.BigInteger;

public class Euler16 {
	public static void addNums(BigInteger n){
		BigInteger sum = BigInteger.ZERO;
		while(n.compareTo(BigInteger.ZERO) > 0){
			BigInteger mod = n.mod(BigInteger.TEN);
			sum = sum.add(mod);
			n = n.divide(BigInteger.TEN);
		}
		System.out.println(sum);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long begin = System.currentTimeMillis();
		BigInteger n = BigInteger.valueOf(2).pow(1000);
		System.out.println(n);
		addNums(n);
		long end = System.currentTimeMillis();
		System.out.println(end-begin +" ms");

	}

}
