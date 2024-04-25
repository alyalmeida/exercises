package Beginner;

import java.util.Scanner;

public class LogicalSequence1144 {

	public static void main(String[] args) {
		
		int numero, c1 = 0 , c2 = 0;
		int soma = 2;
		
		Scanner s = new Scanner(System.in);
		
		numero =  s.nextInt();
		

		for (int i = 1; i<=numero ;i++) {
			if (i==1) {
				System.out.printf("%d %d %d\n", i, i, i);
				c1 = i + 1;
				c2 = i + 1;
				System.out.printf("%d %d %d\n", i, c1, c2);
				//soma = soma + 2;
			} else {
				c1 = c1+soma;
				c2 = c1*i;
				System.out.printf("%d %d %d\n", i, c1, c2);
				System.out.printf("%d %d %d\n", i, c1+1, c2+1);
				c1 = c1+1;
				soma = soma + 2;
			}
		}		
	}

}
