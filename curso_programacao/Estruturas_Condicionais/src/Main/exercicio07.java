package Main;

import java.util.Locale;
import java.util.Scanner;

public class exercicio07 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);

		double valorX = scanner.nextDouble();
		double valorY = scanner.nextDouble();

		if (valorX == 0 && valorY == 0) {
			System.out.println("Origem");
		} else if (valorX > 0 && valorY == 0) {
			System.out.println("Eixo X");
		} else if (valorX == 0 && valorY > 0) {
			System.out.println("Eixo Y");
		} else if (valorX > 0 && valorY > 0) {
			System.out.println("Q1");
		} else if (valorX < 0 && valorY > 0) {
			System.out.println("Q2");
		} else if (valorX < 0 && valorY < 0) {
			System.out.println("Q3");
		} else if (valorX > 0 && valorY < 0) {
			System.out.println("Q4");
		}
		scanner.close();
	}

}
