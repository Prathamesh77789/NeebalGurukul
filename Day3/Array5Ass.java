package day1;
import java.util.Scanner;
public class Array5Ass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Index");
		int s= sc.nextInt();
		int a []= new int [s];
		
		for(int i=0;i<a.length;i++){
			
			a[i]=sc.nextInt();
		}
		int min = 0;
		for(int i =0 ;i<s ;i++) {
			if(a[i]<a[min]) {
				min=i;
			}
			
		}System.out.println("The min index is  "+min+".");
		
		
	}

}
