package week1.assignment;

public class Primenumber {

	public static void main(String[] args) {
		int n =11;
		
		
			
			if((n%2 ==0 &&n==2) ||(n%3 ==0 && n==3 )|| (n%5==0 && n==5)) {
				
				System.out.println("Prime Number" +n);
			}
			else if((n%2 ==0 &&n/2 != 1) ||(n%3 ==0 && n/3 != 1) || (n%5==0 && n/5 !=1)) {
				
				System.out.println("Not a Prime Nuber"+n);
			}
			//else if((n%2 !=0 && n !=2 && n!=3 &&  n!=5)|| (n%3 !=0 && n !=2 && n!=3 &&  n!=5)||(n%5 !=0&& n !=2 && n!=3 &&  n!=5)){
			else {
			System.out.println("Prime Number"+n);
	}
			//}
		
	}
	
}
