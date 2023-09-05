package day1;
import java.util.Scanner;
public class QuadrantDay2Ass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter x:");
		int x = sc.nextInt();
		System.out.println("Enter y:");
		int y = sc.nextInt();
		
		
//         ( x>0 and y>0 ) First Quadrant. If ( x<0 and y>0 )2nd quad 
//		   ( x<0 and y<0 ) Third Quadrant. If ( x>0 and y>0 ) Fourth Quadrant.
		if (x>0 && y>0) {
			System.out.println("1st Quadrant");
		}else if (x<0 && y>0) {
			System.out.println("2nd Quadrant");
		}else if (x<0 && y>0) {
			System.out.println("3rd Quadrant");
		}else if (x>0 && y>0) {
			System.out.println("4th Quadrant");
		}else if (x==0 && y!=0) {
			System.out.println("Y-axis");
		}else if (x!=0 && y==0) {
			System.out.println("X-axis");
		}
		sc.close();

	}

}
