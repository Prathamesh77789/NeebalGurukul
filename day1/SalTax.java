package day1;
import java.util.Scanner;

public class SalTax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		double CTC = sc.nextDouble();   //1350000
		double tax= 0;
		
			
		if (CTC>1500000) {
			double afd = CTC*0.25;
			tax = CTC-afd;
			System.out.println(tax + afd);
			double taxx=CTC-tax;
			System.out.println( taxx);
			
		}else if (CTC<1400000) {
			double afd = (CTC*20)/100;
			tax = CTC-afd;
			System.out.println(tax+ afd + CTC);
			
		}else if (CTC<100000) {
			double afd = (CTC*10)/100;
			tax = CTC-afd;
			
		}else if (CTC <750000) {
			double afd = (CTC*0)/100;
			tax = CTC-afd;
			
		}else {
			System.out.println(CTC);
		}
		

	}

}
