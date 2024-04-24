package Beginner;

import java.util.Scanner;

public class FuelSpent1017 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		double time, speed, fuel;
		int consumo = 12;
		
		time  = s.nextDouble();
		speed = s.nextDouble();
		fuel = time * speed / consumo;
		System.out.printf("%.3f", fuel);
	}

}
