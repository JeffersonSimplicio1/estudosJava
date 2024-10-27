package Main;

import java.util.Scanner;

public class exercicio09 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		// Programa para encontrar os divisores dados por um usuario.

		System.out.println("Olá, Seja bem vindo!");
		System.out.println("Digite um numero ao qual você deseja saber os seus divisores: ");

		int numeroSolicitado = sc.nextInt();

		// Metodo para encontrar e imprimir os divisores do numero ao qual foi
		// solicitado pelo usuario
		for (int contador = 1; contador <= numeroSolicitado; contador++) {

			int valor = numeroSolicitado % contador;

			if (valor == 0) {
				// Saida para o usuario
				System.out.println(contador);

			}

		}
		System.out.println("Obrigado por utilizar este programa!!");
		System.out.println("Fim do Programa!");
		sc.close();
	}

}
