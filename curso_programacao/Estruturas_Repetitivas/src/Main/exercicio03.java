package Main;

import java.util.Scanner;

public class exercicio03 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int valor = scanner.nextInt();
		int alcool = 0;
		int gasolina = 0;
		int diesel = 0;
		int i = 0;
		
		while(valor > 0) {
			if(valor == 1) {
				alcool ++;
				valor = scanner.nextInt();
			} else if (valor == 2) {
				gasolina++;
				valor = scanner.nextInt();
			} else if (valor == 3) {
				diesel++;
				valor = scanner.nextInt();
			} else if (valor > 4) {
				i++;
				valor = scanner.nextInt();
			} else {
				break;
			}
		}	
			System.out.println("MUITO OBRIGADO!!");
			System.out.println("Alcool: " + alcool);
			System.out.println("Gasolina: " + gasolina);
			System.out.println("Diesel: " + diesel );
	}

}
