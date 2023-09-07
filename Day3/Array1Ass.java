package day1;
import java.util.Scanner;


public class Array1Ass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//scanner define 
		Scanner sc = new Scanner(System.in);
		
		// input the array
		System.out.println("input array size : ");
		
		int s = sc.nextInt();
		
		int a []= new int[s];
		for (int i=0;i<a.length;i++) {
			a[i]= sc.nextInt();
		}
		for (int i=a.length-1;i>=0;i--) {
			System.out.print(a[i]);
		}
				
	}

}
