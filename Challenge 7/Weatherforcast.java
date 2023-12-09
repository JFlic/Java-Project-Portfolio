//Jack Flickinger
//October 10 2022
//This program tells you the weather.

import java.util.Scanner;

public class Weatherforcast {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WeatherClass Check = new WeatherClass();
		WeatherClass Check1 = new WeatherClass();
		
		int month;
		int day;
		
		Scanner oScan = new Scanner(System.in);
		
		
		System.out.println("Please enter the year you want:");
		System.out.println("For year 1 enter 1");
		System.out.println("For year 2 enter 2");
		int Weather = oScan.nextInt();
		
		System.out.println("Enter 1 the low of a specific day.");
		System.out.println("Enter 2 the high of a specific day.");
		System.out.println("Enter 3 both high and low of a specific day.");
		System.out.println("Enter 4 for the average lowest of the year.");
		System.out.println("Enter 5 for the average highest of the year.");
		System.out.println("Enter 6 for the average lowest for a month.");
		System.out.println("Enter 7 for the average highest for a month.");
		System.out.println("Enter 8 for the highest for the year.");
		System.out.println("Enter 9 for the lowest for the year.");
		
		
		int Method = oScan.nextInt();
		
		
		
		switch (Weather){
			case 1:
				switch (Method){
					case 1:
						System.out.println("Enter the month you want");
						month = oScan.nextInt();
						System.out.println("Enter the day you want");
						day = oScan.nextInt();
						System.out.println(Check.getLow(month,day));
						break;
					
					case 2:
						System.out.println("Enter the month you want");
						month = oScan.nextInt();
						System.out.println("Enter the day you want");
						day = oScan.nextInt();
						System.out.println(Check.getHigh(month,day));
						break;
						
					case 3:
						System.out.println("Enter the month you want");
						month = oScan.nextInt();
						System.out.println("Enter the day you want");
						day = oScan.nextInt();
						System.out.println(Check.getBoth(month,day));
						break;
					case 4:
						System.out.println(Check.getAvgLowYear());
					case 5:
						System.out.println(Check.getAvgHighYear());
					case 6:
						System.out.println("Enter the month you want");
						month = oScan.nextInt();
						System.out.println(Check.getLowMonth(month));
					case 7:
						System.out.println("Enter the month you want");
						month = oScan.nextInt();
						System.out.println(Check.getHighMonth(month));
					case 8:
						System.out.println(Check.getHighest());
					case 9:
						System.out.println(Check.getLowest());
					
				}
				break;
				
		case 2:
			switch (Method){
				case 1:
					System.out.println("Enter the month you want");
					month = oScan.nextInt();
					System.out.println("Enter the day you want");
					day = oScan.nextInt();
					System.out.println(Check1.getLow(month,day));
					break;
				
				case 2:
					System.out.println("Enter the month you want");
					month = oScan.nextInt();
					System.out.println("Enter the day you want");
					day = oScan.nextInt();
					System.out.println(Check1.getHigh(month,day));
					break;
					
				case 3:
					System.out.println("Enter the month you want");
					month = oScan.nextInt();
					System.out.println("Enter the day you want");
					day = oScan.nextInt();
					System.out.println(Check1.getBoth(month,day));
					break;
				case 4:
					System.out.println(Check1.getAvgLowYear());
				case 5:
					System.out.println(Check1.getAvgHighYear());
				case 6:
					System.out.println("Enter the month you want");
					month = oScan.nextInt();
					System.out.println(Check1.getLowMonth(month));
				case 7:
					System.out.println("Enter the month you want");
					month = oScan.nextInt();
					System.out.println(Check1.getHighMonth(month));
				case 8:
					System.out.println(Check1.getHighest());
				case 9:
					System.out.println(Check1.getLowest());
			}
			break;
		}
	
		
	}

}
