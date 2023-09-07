package day1;

public class Array2Ass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {1,1,1,0,1,1,1,1,1,1,0,0,1,1,1,0,1,1,1,0,1};
		int box=0;
		
	for(int att:a ){
		if (att==1) {
			box++;
		}	
		}
//	System.out.print(box);
	int per = box*100/a.length;
	
	System.out.println("Total percentage "+per+"%");
		
		
	}

}
