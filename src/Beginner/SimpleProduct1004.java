package Beginner;

import java.util.Scanner;

public class SimpleProduct1004 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		int a, b, PROD;
		
		a = s.nextInt();
		b = s.nextInt();
		PROD = a * b;
		
		System.out.printf("PROD = %d\n", PROD);
		
		s.close();
	}

}
