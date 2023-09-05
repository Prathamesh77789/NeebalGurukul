package day1;
import java.util.Scanner;

public class FibonacciDayTwoAss {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		
		
		 Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter the lower bound: ");
	        int lowerBound = scanner.nextInt();

	        System.out.print("Enter the upper bound: ");
	        int upperBound = scanner.nextInt();

	        int a = 0, b = 1;

	        System.out.println("Fibonacci numbers within the range: ");
	        for (int i = a; i <= upperBound; ) {
	            if (i >= lowerBound) {
	                System.out.print(i + " ");
	            }
	            int next = a + b;
	            a = b;
	            b = next;
	            i = a;  // Update the loop variable to the current Fibonacci number
	        }

	        scanner.close();
		
	}}
