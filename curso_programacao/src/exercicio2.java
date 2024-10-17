import java.util.Locale;
import java.util.Scanner;

public class exercicio2 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		
		double raioDoCirculo = scanner.nextDouble();
		double valorDePi = 3.14159;
		double areaDoCirculo = valorDePi * (raioDoCirculo * raioDoCirculo);
		
		System.out.printf("A = %.4f%n" , areaDoCirculo);
		
		
	}

}
