import java.util.Scanner;

public class Exercicio_03 {

	public static void main(String[] args) {
		//Faça um programa que peça dois números e imprima a soma:
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite um numero: ");
		int numeroUm = sc.nextInt();
		System.out.print("Digite o segundo numero: ");
		int numeroDois = sc.nextInt();
		
		int soma = numeroUm +numeroDois;
		
		System.out.println(soma);
		
		sc.close();

	}

}
