package Euler;

import java.util.HashMap;
import java.util.Map;

public class Euler26 {
	
	private static int getCycleLen(int n){
		Map<Integer, Integer> sTi = new HashMap<Integer, Integer>();
		int state = 1;
		int it = 0;
		while(!sTi.containsKey(state)){
			sTi.put(state, it);
			state = state * 10 % n;
			it++;
		}
		return it - sTi.get(state);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int bestNum = 0;
		int bestLen = 0;
		for(int i = 2; i <= 10; i++){
			int len = getCycleLen(i);
			if(len > bestLen){
				bestNum = i;
				bestLen = len;
			}
		}
		System.out.println(bestNum);

	}

}
