package Main;

import java.util.Scanner;

public class exercicio6 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		double valor = scanner.nextDouble();

		if (valor >= 0 && valor <= 25) {
			System.out.println("Intervalo [0,25]");
		} else if (valor > 25 && valor < 50) {
			System.out.println("Intervalor [25,50]");
		} else if (valor >= 50 && valor < 75) {
			System.out.println("Intervalor [50,75]");
		} else if (valor >= 75 && valor <= 100) {
			System.out.println("Intervalor [75,100]");
		} else {
			System.out.println("Fora do Intervalor");
		}
		
		scanner.close();
	}

}
