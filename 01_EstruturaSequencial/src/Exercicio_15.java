import java.util.Scanner;

public class Exercicio_15 {

	public static void main(String[] args) {
		/*Faça um programa que pergunte quanto você ganha por hora e o número 
		 de horas trabalhadas no mês. Calcule e mostre o total do seu salário no 
		 referido mês, sabendo-se que são descontados 11% para o Imposto de Renda, 
		 8% para o INSS e 5% para o sindicato, faça um programa que nos dê:

			* salário bruto.
			* imposto de renda.
			* quanto pagou ao INSS.
			* quanto pagou ao sindicato.
			* o salário líquido.
			* calcule os descontos e o salário líquido, conforme a tabela abaixo:*/
		
Scanner sc = new Scanner (System.in);
		
		System.out.println("Quanto o valor da hora trabalhada? ");
		double ganhosPorHora = sc.nextDouble();
		
		System.out.println("Quantas horas você trabalhou esse mês? ");
		double horasTrabalhadasMes = sc.nextDouble();
		
		double salarioBruto = ganhosPorHora * horasTrabalhadasMes;
		
		System.out.println("Salario Bruto: R$ " + salarioBruto);
		
		double ir = salarioBruto * 0.11;
		System.out.println("IR: R$ " + ir);
		
		double inss = salarioBruto * 0.08;
		System.out.println("INSS: R$ " + inss);
	
		double sindicato = salarioBruto * 0.05;
		System.out.println("Sindicato: R$" + sindicato);
		
		double salarioLiquido = salarioBruto - ir - inss - sindicato;
		System.out.println("Salario Liquido: R$ " + salarioLiquido);
		
		sc.close();

	}

}
