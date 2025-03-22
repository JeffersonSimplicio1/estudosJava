import java.util.Scanner;

public class Exercicio_11 {

	public static void main(String[] args) {
		/* Faça um programa que peça 2 números inteiros e um número real. 
		 	Calcule e mostre:

			O produto do dobro do primeiro com metade do segundo .
			A soma do triplo do primeiro com o terceiro.
			O terceiro elevado ao cubo.*/
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Escreva dois numero inteiros: ");
		int numeroUm = sc.nextInt();
		int numeroDois = sc.nextInt();
		
		System.out.println("Escreva um numero real: ");
		double numeroTres = sc.nextFloat();
		
		double calculoUm = (numeroUm * 2) * (numeroDois / 2);
		System.out.printf("O produto do dobro do primeiro com metade do segundo é: %.2f%n", calculoUm);
		 
		
		double calculoDois = (numeroUm * 3) + numeroTres;
		System.out.printf("A soma do triplo do primeiro com o terceiro é: %.2f%n", calculoDois );
		
		double calculoTres = Math.pow(numeroTres, 3);
		System.out.printf("O terceiro elevado ao cubo: %.2f%n", calculoTres );
		
		sc.close();
		
		
		

	}

}
