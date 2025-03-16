import java.util.Scanner;

public class Exercicio_02 {

	public static void main(String[] args) {
		/* Faça um programa que peça um número e então mostre a mensagem 
		"O número informado foi [número]":*/
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite um numero qualquer: ");
		int numero = sc.nextInt();
		
		System.out.println("O numero informado foi: " + numero);
		
		sc.close();

	}

}
