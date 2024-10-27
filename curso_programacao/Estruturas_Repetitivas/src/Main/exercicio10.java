package Main;

import java.util.Scanner;

public class exercicio10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// Programa destinado a solicitar um numero onde este numero sera destrinchado
		// formando linhas e cada valor das linhas seram acompanhados por seu dobro e
		// seu triplo, criando uma matriz

		// Interação com o usuario
		System.out.println("Olá, Seja Bem vindo ao cliador de matriz");
		System.out.println("Meu nome é matriX =D");
		System.out.println("Qual o seu nome? ");

		String nomeDoUsuario = sc.next();

		// Boas vindas ao usuario
		System.out.println("Olá, " + nomeDoUsuario + "!");
		System.out.println("Vamos começas, " + nomeDoUsuario);
		System.out.println("Digite o numero de linhas que voce quer na matriz, lembrando que ela tera apenas 3 colunas!");
		// solicitação do numero
		int numero = sc.nextInt();

		for (int contador = 1; contador <= numero; contador++) {

			int dobro = contador * contador;
			int triplo = dobro * contador;

			System.out.println(contador + " " + dobro + " " + triplo);

		}

		sc.close();
	}

}
