package Main;

import java.util.Scanner;

public class exercicio03 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int primeiroNumero = scanner.nextInt();
		int segundoNumero = scanner.nextInt();
		
		if(primeiroNumero % segundoNumero == 0 || segundoNumero % primeiroNumero ==0) {
			System.out.println("Sao Multiplos");
		} else {
			System.out.println("Nao Sao Multiplo");
		}
		
		scanner.close();
	}

}
