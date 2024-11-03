import java.util.Locale;
import java.util.Scanner;

public class DesafioBascara {

	public static void main(String[] args) {

		// Leia 3 valores de ponto flutuante e efetue o cálculo das raízes da equação de
		// Bhaskara. Se não for possível calcular as raízes, mostre a mensagem
		// correspondente “Impossivel calcular”, caso haja uma divisão por 0 ou raiz de
		// numero negativo.

		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);

		double a = sc.nextDouble();
		double b = sc.nextDouble();
		double c = sc.nextDouble();
		double x1, x2;
		double delta = Math.pow(b, 2) - (4 * a * c);
		System.out.println("Delta: " + delta);

		if (delta > 0 && a > 0) {
			x1 = ((-1 * b) + Math.sqrt(delta)) / (2 * a);
			x2 = ((-1 * b) - Math.sqrt(delta)) / (2 * a);
			System.out.printf("R1 = %.5f%n", x1);
			System.out.printf("R2 = %.5f%n", x2);

		} else {
			System.out.println("Impossivel calcular");
		}

		sc.close();
	}

}
