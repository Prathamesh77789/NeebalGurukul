package day1;
import java.util.Scanner;
public class CosineDayTwoAss {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Q1 Write a program to cal Cosine series
		
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Number : ");
		int a=sc.nextInt();
		double sum=1;
		double n=Math.toRadians(a);
		int fact=1;
		double num=1;
		for(int i=1;i<=19;i++)
		{
//			//factorial with each iteration
			fact=fact*i;
			if(i%2==0)
			{
				num=-num*n*n;//updating num for every itr
				sum=sum+num/fact;//find sum with each itr
			}
			
			
		}
		System.out.println("Answer = "+sum);
		
		
		sc.close(); 
	}

}
