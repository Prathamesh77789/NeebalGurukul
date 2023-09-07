package day1;

public class Array6Ass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        int[] profits = {12, 18, 20, 38, 53, 93, 77, 61, 59, 56};

        int declineYear = -1; 

        for (int year = 1; year < profits.length; year++) {
            if (profits[year] < profits[year - 1]) {
                declineYear = 2001 + year;
                break;  
            }
        }

        if (declineYear != -1) {
            System.out.println("The decline in profits began in the year: " + declineYear);
        } else {
            System.out.println("No decline in profits was observed during this period.");
        }
	}

}
