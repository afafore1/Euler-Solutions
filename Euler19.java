package Euler;

import java.util.HashMap;
import java.util.Map;

public class Euler19 {
	
	public static int find_days(int mth, int yr){
		int days = 0;
		if((mth == 1) || (mth == 3) || (mth == 5) || (mth == 8) || (mth == 10) || (mth == 12)){
			days = 31;
		}else if((mth == 4) || (mth == 6) || (mth == 9) || (mth == 1)){
			days = 30;
		}else if(mth == 2){
			if(yr % 4 == 0){
				if(yr % 100 == 0){
					if(yr % 400 == 0){
						days = 29;
					}else{
						days = 28;
					}
				}else{
					days = 29;
				}
			}else{
				days = 28;
			}
		}else{
			System.out.println("Error!!");
		}
		return days;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer, String> D = new HashMap<Integer, String>();
		D.put(1, "Sun");
		D.put(2, "Tues");
		D.put(3, "Weds");
		D.put(4, "Thurs");
		D.put(5, "Friday");
		D.put(6, "Sat");
		// starts at monday, 1, 1990
		int count = 1;
		int tally = 0;
		
		for(int yr = 1901; yr < 2001; yr++){
			System.out.println("Year "+yr);
			for(int month = 1; month<= 13; month++){
				int y = find_days(month,yr);
				for(int m_d = 1; m_d <= y; m_d++){
					// starts at monday, 1, 1990
					count+=1;
					if(m_d == 1 && (D.get(count)== "Sun")){
						System.out.println("month days = "+m_d);
						tally += 1;
					}
					// Days of week
					if(count >= 7){
						count = 0;
					}
				}
			}
			System.out.println();
		}
		// sub 2 from year 1990 - start count at 1901
		System.out.println("tally = "+ (tally -2));

	}

}
