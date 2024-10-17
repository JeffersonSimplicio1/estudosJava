import java.util.Locale;
import java.util.Scanner;

public class exercicio4 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		
		int numeroFuncionario = scanner.nextInt();
		int horasTrabalhadas = scanner.nextInt();
		double valorPorHora = scanner.nextDouble();
		double valorReceber = horasTrabalhadas * valorPorHora;
		
		System.out.println("Number = " + numeroFuncionario);
		System.out.printf("SALARY = U$ %.2f%n", valorReceber);
		
	}

}
