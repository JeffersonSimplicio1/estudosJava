package Aplicacao;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Dados dados = new Dados();
		
		System.out.println("Digite o nome do funcionario, seu salario e os impostos pagos pelo funcionario: ");
		System.out.print("Nome: ");
		dados.nome = sc.next();
		
		System.out.print("Salario Bruto: ");
		dados.salarioBruto = sc.nextDouble();
		
		System.out.print("Imposto: ");
		dados.impostos = sc.nextDouble();
		
		
		System.out.println("Funcionario "+ dados.nome+ ", $ "+ dados.salarioLiquido());
		System.out.println("Qual a porcentagem de aumento salarial? ");
		dados.porcetagemDeAumento = sc.nextDouble();
		System.out.println("Atualização do salario: "+ "Funcionario "+ dados.nome + ", $ "+ dados.AumentoDeSalario());

		System.out.println("Fim do Programa!");		
		
		sc.close();
	}

}
