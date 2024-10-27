package Main;

import java.util.Scanner;

public class exercicio08 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int numero = sc.nextInt();
		int fatorial = numero;

		for (int i = numero - 1; i > 0; i--) {
			if (numero > 0) {
				
				fatorial = fatorial * i;
				
			}
			
		}
		if(numero > 0) {
		System.out.println(fatorial);
		}
		else if(numero == 0) {
			System.out.println("1");
		}
		sc.close();
	}

}
