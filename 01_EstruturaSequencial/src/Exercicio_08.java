import java.util.Scanner;

public class Exercicio_08 {

	public static void main(String[] args) {
		/* Faça um programa que pergunte quanto você ganha por hora
		e o número de horas trabalhadas no mês. Calcule e mostre o total
		do seu salário no referido mês . */
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Quanto o valor da hora trabalhada? ");
		double ganhosPorHora = sc.nextDouble();
		
		System.out.println("Quantas horas você trabalhou esse mês? ");
		double horasTrabalhadasMes = sc.nextDouble();
		
		double salarioMes = ganhosPorHora * horasTrabalhadasMes;
		
		System.out.println("Seu salario do mês é de: " + salarioMes);
	
		sc.close();
		
		
		

	}

}
