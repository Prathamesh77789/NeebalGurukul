package day1;

public class Pattern2Day2Ass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//      Q2.Pattern-2
		
		
		for(int i =1;i<=5;i++) {
			for(int j=i*2-1;j>=i;j--) {
				System.out.print(" "+(char)(64+j));
				
			}System.out.println();
		}
		for (int i= 4;i>=1;i--) {
			for(int j=i*2-1;j>=i;j--) {
				System.out.print(" "+(char)(64+j));
				
			}System.out.println();
			
		}
	}

}
