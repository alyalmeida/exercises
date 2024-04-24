package Beginner;

import java.util.Scanner;

public class ExtremelyBasic1001 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		int A, B, X;
		
		A = s.nextInt();
		B = s.nextInt();
		X = Math.addExact(A, B);
		
		System.out.printf("X = %d\n", X);
		
		s.close();
	}

}
