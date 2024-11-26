import java.io.IOException;
 
import java.util.Locale;
import java.util.Scanner;

public class TiposDeTriangulos {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double a, b, c, aux;

		a = sc.nextDouble();
		b = sc.nextDouble();
		c = sc.nextDouble();
		
		if (b > a && b > c) {
			aux = a;
			a = b;
			b = aux;
		} else if (c > a) {
			aux = a;
			a = c;
			c = aux;
		}
		
		if (a >= b + c) {
			
			System.out.println("NAO FORMA TRIANGULO");
			
		} else{
		
		if ((a * a) == ((b * b) + (c * c))) {

			System.out.println("TRIANGULO RETANGULO");

		} else if ((a * a) > ((b * b) + (c * c))) {
			
			System.out.println("TRIANGULO OBTUSANGULO");
			
		} else if ((a * a) < ((b * b) + (c * c))) {
			
			System.out.println("TRIANGULO ACUTANGULO");
		} 
		
		if (a == b && b == c) {
			System.out.println("TRIANGULO EQUILATERO");
		} else {
			System.out.println("TRIANGULO ISOSCELES");
		}
		}

	}

}