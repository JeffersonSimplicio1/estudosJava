package Main;

import java.util.Scanner;

public class exercicio09 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		
		int valor = scanner.nextInt();
		String dia = null;
		
		switch (valor) {
		case 1:
			dia = "Domingo";
			break;
		case 2:
			dia = "Segunda";
			break;
		case 3:
			dia = "Terça";
			break;
		case 4:
			dia = "Quarta";
			break;
		case 5:
			dia = "Quinta";
			break;
		case 6:
			dia = "Sexta";
			break;
		case 7:
			dia = "Sabado";
			break;
		} 
		System.out.println(dia);
	}

}
