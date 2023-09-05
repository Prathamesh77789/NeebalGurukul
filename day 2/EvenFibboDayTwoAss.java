package day1;

public class EvenFibboDayTwoAss {

	public static void main(String[] args) {
//		 TODO Auto-generated method stub
//		  0 1 1 2 3 5
		
//		Q4. Print first 10 even fibonacii numbers ?
		
		System.out.println("Enter first 10 fibbonaci no:");
		 int n1 = 0;
		 int n2 = 1;
		 int count = 0;
//		  nn = nextnum 
		 
		 for (int i = 1; count <10;i++) {
			 int nn= n1+n2;
			 n1= n2;
			 n2= nn;
//			 to find our even no 
			 if (nn%2==0) {
				 System.out.print(" "+nn+" ");
				 count++;
			 }
			 
		 }
		}
		
		

}
