package Main;

import java.util.Scanner;

public class AprendendoDoWhile {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char resp;
		
		do {
			System.out.print("Digite a temperatura: ");
			double temperatura = sc.nextDouble();
			double converterTemperatura = 9.0*temperatura / 5.0+32.0;
			System.out.printf("A temperatura em fahrenheit: %.2f%n", converterTemperatura);
			System.out.println("Você deseja converter novamente? ");
			resp = sc.next().charAt(0);
		} while (resp != 'n');
	}

}
