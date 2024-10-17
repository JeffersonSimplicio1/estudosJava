import java.util.Locale;
import java.util.Scanner;

public class exercicio5 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner (System.in);
		
		int codigoPrimeiraPeca = scanner.nextInt();
		int numeroPrimeiraPeca = scanner.nextInt();
		double valorPrimeiraPeca = scanner.nextDouble();
		double valorTotalPrimeiraPeca = numeroPrimeiraPeca * valorPrimeiraPeca;
		
		int codigoSegundaPeca = scanner.nextInt();
		int numeroSegundaPeca = scanner.nextInt();
		double valorSegundaPeca = scanner.nextDouble();
		double valorTotalSegundaPeca = numeroSegundaPeca * valorSegundaPeca;
		
		double valorTotal = valorTotalPrimeiraPeca + valorTotalSegundaPeca;
		
		System.out.printf("VALOR A PAGAR: R$ %.2f%n", valorTotal );
		
		
		
		
		
		
	}

}
