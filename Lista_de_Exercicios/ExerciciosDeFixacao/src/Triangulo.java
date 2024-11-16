import java.util.Locale;
import java.util.Scanner;

public class Triangulo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
	double a,b,c;
	
	 a = sc.nextDouble();
	 b = sc.nextDouble();
	 c = sc.nextDouble();
	 
	 if(a < b + c && b < a + c && c < a + b) {
		  
		 double perimetro = a + b + c;
		 System.out.printf("Perimetro = %.1f%n", perimetro);
	 } else {
		 double area = ((a+b) * c)/2;
		 System.out.printf("Area = %.1f%n", area );
	 }
	 sc.close();
	}

}
