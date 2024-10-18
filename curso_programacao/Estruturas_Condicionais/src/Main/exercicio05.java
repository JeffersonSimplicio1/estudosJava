package Main;

import java.util.Scanner;

public class exercicio05 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int codigoUm = scanner.nextInt();
		int quantidade = scanner.nextInt();
		double valorUm = 0;
		
		
		if(codigoUm == 1) {
			valorUm = 4.00;
		} else if (codigoUm == 2) {
			valorUm = 4.50;
		} else if (codigoUm == 3) {
			valorUm = 5.00;
		} else if (codigoUm == 4) {
			valorUm = 2.00;
		} else if (codigoUm == 5) {
			valorUm = 1.50;
		}
		
		double total = valorUm * quantidade;
		System.out.println("Total: R$ " + total);
	}

}
