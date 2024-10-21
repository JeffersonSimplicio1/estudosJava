package Main;

import java.util.Scanner;

public class AprendendoWhile {

	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		
		int valor = scanner.nextInt();
		int soma = 0;
		
		while(valor !=0 ) {
			soma += valor;
			valor = scanner.nextInt();
		}
		System.out.println(soma);
		
		scanner.close();

	}

}
