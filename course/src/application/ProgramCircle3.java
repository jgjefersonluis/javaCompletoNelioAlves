package application;

import java.util.Locale;
import java.util.Scanner;

import util.CalculatorCircle3;

public class ProgramCircle3 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter radius: ");

		double radius = sc.nextDouble();

		double c = CalculatorCircle3.circumference(radius);

		double v = CalculatorCircle3.volume(radius);

		System.out.printf("Circumference: %.2f%n", c);
		System.out.printf("Volume: %.2f%n", v);
		System.out.printf("PI: %.2f%n", CalculatorCircle3.PI);

		sc.close();
	}

}
