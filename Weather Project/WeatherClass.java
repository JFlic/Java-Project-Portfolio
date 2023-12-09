//Jack Flickinger
//October 10 2022
//This program tells you the weather. 

import java.util.Random;

public class WeatherClass {
	Random oRand = new Random();
	
	int[][][] data = new int[12][31][2];
	int low = -30;
	int high = 121;
	int check = 0;
	int AvgYear = 0;
	int AvgMonth = 0;
	
	public WeatherClass() {
		for (int a= 0; a<12;a++) {
			for(int b = 0; b<31;b++) {
				for(int c = 0;c<2;c++) {
					data[a][b][c]= oRand.nextInt(high-low) + low;
				}
				if (data[a][b][0]> data[a][b][1]) {
					check = data[a][b][0];
					data[a][b][0] = data[a][b][1];
					data[a][b][1] = check;
				}
			}
		}
	}
	
	public String getLow(int Month, int Day) {
			return ("The low for the day is " + data[Month-1][Day-1][0]);
		}
		
	public String getHigh(int Month, int Day) {
		if (data[Month-1][Day-1][1] >= 90) {
			return ("The high for the day is " + data[Month-1][Day-1][1]+ " and it is summer.");
		}
		if(data[Month-1][Day-1][1] >= 70 && data[Month-1][Day-1][1] < 90) {
			return ("The high for the day is " + data[Month-1][Day-1][1]+ " and it is spring.");
		}
		if(data[Month-1][Day-1][1] >= 50 && data[Month-1][Day-1][1] < 70) {
			return ("The high for the day is " + data[Month-1][Day-1][1]+ " and it is fall.");
		}
		else {
			return ("The high for the day is " + data[Month-1][Day-1][1]+ " and it is winter.");
			
		}
	}
	public String getBoth(int Month, int Day) {
		return ("The high for the day is " + data[Month-1][Day-1][1]+ " and the low is " + data[Month-1][Day-1][0]+".");
	}
	
	public String getAvgLowYear() {
		for (int a= 0; a<12;a++) {
			for(int b = 0; b<31;b++) {
				AvgYear += data[a][b][0];
				
			}
		}
		return ("The average low for the year is "+ AvgYear/720);
	}
	public String getAvgHighYear() {
		for (int a= 0; a<12;a++) {
			for(int b = 0; b<31;b++) {
				AvgYear += data[a][b][1];
				
			}
		}
		return ("The average high for the year is "+ AvgYear/720);
	}
	
	public String getLowMonth(int Month) {
		for (int i= 0; i<31;i++) {
			AvgMonth += data[Month-1][i][0];
	}	
	return "The average low for the month is "+ AvgMonth/31;
	}
	
	public String getHighMonth(int Month) {
		for (int i= 0; i<31;i++) {
			AvgMonth += data[Month-1][i][1];
			
	}	
	return "The average low for the month is "+ AvgMonth/31;
		
	}
	
	public String getHighest() {
		int highest = 0;
		for (int a= 0; a<12;a++) {
			for(int b = 0; b<31;b++) {
				if (data[a][b][1]>highest) {
					highest = data[a][b][1];
				}
			}
		}
		return "The highest for the year is "+ highest;
	}
	
	public String getLowest() {
		int highest = 0;
		for (int a= 0; a<12;a++) {
			for(int b = 0; b<31;b++) {
				if (data[a][b][0]<highest) {
					highest = data[a][b][0];
				}
			}
		}
		return "The lowest for the year is "+ highest;
	}
}

