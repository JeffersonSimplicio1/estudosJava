import java.util.Scanner;

public class Exercicio_14 {

	public static void main(String[] args) {
		/*
		 * João, um pescador, comprou um microcomputador para controlar o rendimento
		 * diário de seu trabalho. Toda vez que ele traz um peso de peixes maior que o
		 * estabelecido pelo regulamento de pesca do estado de São Paulo (50 quilos)
		 * deve pagar uma multa de R$ 4,00 por quilo excedente. João precisa que você
		 * faça um programa que leia a variável peso (peso de peixes) e calcule o
		 * excesso. Gravar na variável excesso a quantidade de quilos além do limite e
		 * na variável multa o valor da multa que João deverá pagar. Imprima os dados do
		 * programa com as mensagens adequadas.
		 */

		Scanner sc = new Scanner(System.in);

		System.out.println("Qual o peso do peixe? ");
		double peso = sc.nextDouble();
		double pesoExcesso = peso - 50;

		if(pesoExcesso > 0) {
			double multa = pesoExcesso * 4.00;
			
			System.out.println(" O valor da multa é de: " + multa);
			System.out.println("O peso excedido foi de: " + pesoExcesso);
		} else {
			System.out.println("O peixe não excedeu o peso.");
		}

		sc.close();

	}

}
