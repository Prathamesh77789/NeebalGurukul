package day1;

public class Days {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int TD = 1020;
		int y = TD/365;
		int m = (TD%365)/30;
		int w = ((TD%365)%30)/7;
		int d = ((TD%365)%30)%7/1;
		
		 System.out.println( y + " Year " + m + " Month " + w +" week "+ d+" days ");
		
	}

}
