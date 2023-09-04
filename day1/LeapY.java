package day1;
import java.util.Scanner;

public class LeapY {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int ly= sc.nextInt();
		if (ly%4==0 && ly%100 !=0 || ly%400 ==0) {
			System.out.print(ly+ " is a leap year");
		}else 
		{
			System.out.print(ly+ " is not a leap year");
		}

	}

}
