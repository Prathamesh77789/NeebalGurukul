package day1;
import java.util.Scanner;
public class SalaryInc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int sal = sc.nextInt();
		int limit =20000;
		
		if (sal<limit) {
	    sal= sal + 5000;
		}
		
		
		System.out.println(sal);
	

}
}