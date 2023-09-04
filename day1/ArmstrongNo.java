package day1;
import java.util.Scanner;

public class ArmstrongNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		int a = i/100;
		int b = i/10%10;
		int c = i%10;
	
		int arm=a*a*a +b*b*b + c*c*c;
		
		if(i==arm){
			System.out.println("It is an Armstrong number");
		}else {
			System.out.println("It is not an Armstrong number");
		}
		
		
		

	}

}
