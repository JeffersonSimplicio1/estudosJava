package Main;

import java.util.Scanner;

public class exercicio02 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int numero = scanner.nextInt();
		
		if(numero%2 == 0) {
			System.out.println("PAR");
		} else {
			System.out.println("IMPAR");
		}
		scanner.close();

	}

}
