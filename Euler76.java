package Euler;

import java.util.Arrays;

public class Euler76 {
	private static int findways(int lim){
		int [] part = new int[lim+1];
		part[0] = 1;
		for(int i = 0; i < lim; i++){
			for(int j = i; j <= lim; j++){
				part[j] += part[j-i];
			}
		}			
		
		return (part[lim]/2);
	}

	public static void main(String[] args) {
		int target = 100;
		System.out.println(findways(target));
		
	}

}
