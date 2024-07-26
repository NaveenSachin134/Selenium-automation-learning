package week1.assignment;

public class FibanocciSeries {
	
	public static void main(String[] args) {
		
		int a =0;
		int b=0;
		int c=25;
		for (int i=0; i<c; i++) {
			
			int n = a+b;
			
			if(n<=c) {
			System.out.println(n);
			}
			b=a;
			a=n;
			
			if(n==0) {
				b=+1;
			}
		}
		
	}

}
