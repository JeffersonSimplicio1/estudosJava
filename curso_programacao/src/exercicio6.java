import java.util.Locale;
import java.util.Scanner;

public class exercicio6 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner (System.in);
		
		double primeiroValor = scanner.nextDouble();
		double segundoValor = scanner.nextDouble();
		double terceiroValor = scanner.nextDouble();
		double valorDePi = 3.14159;
		
		double areaTriangulo = (primeiroValor * terceiroValor)/2;
		double areaCirculo = valorDePi * (terceiroValor * terceiroValor);
		double areaTrapezio = (primeiroValor + segundoValor)*terceiroValor/2;
		double areaQuadrado = segundoValor * segundoValor;
		double areaRetangulo = primeiroValor * segundoValor;
		
		System.out.printf("TRIANGULO: %.3f%n", areaTriangulo);
		System.out.printf("CIRCULO: %.3f%n", areaCirculo);
		System.out.printf("TRAPEZIO: %.3f%n", areaTrapezio);
		System.out.printf("QUADRADO: %.3f%n", areaQuadrado);
		System.out.printf("RETANGULO: %.3f%n", areaRetangulo);
		
		
	}

}
