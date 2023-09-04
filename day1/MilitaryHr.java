package day1;
import java.util.Scanner;

public class MilitaryHr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// 			hr = 1400/100;
//		    12< nothih  
//		12> -12 hr 
//		00== 12 
		
		Scanner sc = new Scanner(System.in);
		int hr = sc.nextInt();
		
		int hr1 = hr/100;
		if (hr1==0) {
			hr1=12;
		}else if (hr1>12) {
			hr1= hr1-12;
		}
		int min = hr%100;
		
		
		System.out.println(hr1+":"+min);
		
		
		
		
		
	}

}
