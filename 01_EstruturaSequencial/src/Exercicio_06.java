import java.util.Scanner;

public class Exercicio_06 {

	public static void main(String[] args) {
		// Faça um programa que peça o raio de um círculo, calcule e mostre sua área:
		
		Scanner sc = new Scanner (System.in);
				
		double  pi = 3.14;
		System.out.println("Qual o valor do raio da circunferencia? ");
		
		double raio = sc.nextDouble();
		
		double areaCirculo = pi * Math.pow(raio, 2);
		
		System.out.println("A area da circunferencia é de: " + areaCirculo);
		
		sc.close();
	}

}
