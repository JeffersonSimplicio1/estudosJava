import java.util.Scanner;

public class exercicio3 {

	public static void main(String[] args) {
	
		Scanner scanner = new Scanner (System.in);
		
		int primeiroValor = scanner.nextInt();
		int segundoValor = scanner.nextInt();
		int terceiroValor = scanner.nextInt();
		int quartoValor = scanner.nextInt();
		
		int calculo = (primeiroValor * segundoValor - terceiroValor * quartoValor);
		
		System.out.println(calculo);
		
	}

}
