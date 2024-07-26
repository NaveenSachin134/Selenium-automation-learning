package week1.assignment;

import java.util.Arrays;

public class MissingElement {
	
	public static void main(String[] args) {
		
		int a[]= {1,4,3,2,8,6,7};
		
	Arrays.sort(a);
		
	for(int i=0; i<a.length-1; i++) {
		
		int b = a[i] +1;
		
		if (b!=a[i+1]) {
			System.out.println(b);
			
		}
		
		
	}
	}

}
