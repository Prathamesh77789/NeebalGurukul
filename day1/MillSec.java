package day1;
import java.util.Scanner;

public class MillSec {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int mili = sc.nextInt();
		int sec = (mili/1000)% 60;
		int min = (mili /(1000*60)) % 60;
		int hr = (mili/(1000*60*60));


	System.out.println(hr + ":"+ min + ":"+sec);
	}

}
