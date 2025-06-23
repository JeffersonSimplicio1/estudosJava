import java.util.Locale;
import java.util.Scanner;
/*A empresa ABC resolveu conceder um aumento de salários a seus funcionários de
acordo com a tabela abaixo:

Salário	Percentual de Reajuste:

0 - 400.00 -------------------> 15%
400.01 - 800.00 --------------> 12%
800.01 - 1200.00 -------------> 10%
1200.01 - 2000.00 ------------> 7%
Acima de 2000.00 -------------> 4%

Leia o salário do funcionário e calcule e mostre o novo salário,
bem como o valor de reajuste ganho e o índice reajustado, em percentual.

Entrada:

A entrada contém apenas um valor de ponto flutuante, com duas casas decimais.

Saída
Imprima 3 linhas na saída: o novo salário, o valor ganho de reajuste (ambos devem
ser apresentados com 2 casas decimais) e o percentual de reajuste ganho*/


public class AumentoDeSalario {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.println("Qual o salario atual do funcionario?");
        double salarioAtual = sc.nextDouble();

        if(salarioAtual <= 400.00) {
            double taxa = 15;
            double novoSalario = (salarioAtual * (taxa/100)) + salarioAtual;
            double reajuste = novoSalario - salarioAtual;
            System.out.printf("Novo Salario: %.2f%n", novoSalario);
            System.out.printf("Reajuste ganho: %.2f%n", reajuste);
            System.out.printf("Em percentual: %.0f %%" , taxa);

        } else if (salarioAtual > 400.00 && salarioAtual<=800.00 ) {
            double taxa = 12;
            double novoSalario = (salarioAtual * (taxa/100)) + salarioAtual;
            double reajuste = novoSalario - salarioAtual;
            System.out.printf("Novo Salario: %.2f%n", novoSalario);
            System.out.printf("Reajuste ganho: %.2f%n", reajuste);
            System.out.printf("Em percentual: %.0f %%%n" , taxa);

        } else if (salarioAtual>800.00 && salarioAtual <= 1200.00) {
            double taxa = 10;
            double novoSalario = (salarioAtual * (taxa/100)) + salarioAtual;
            double reajuste = novoSalario - salarioAtual;
            System.out.printf("Novo Salario: %.2f%n", novoSalario);
            System.out.printf("Reajuste ganho: %.2f%n", reajuste);
            System.out.printf("Em percentual: %.0f %%" , taxa);

        } else if (salarioAtual > 1200.01 && salarioAtual <= 2000.00) {
            double taxa = 7;
            double novoSalario = (salarioAtual * (taxa/100)) + salarioAtual;
            double reajuste = novoSalario - salarioAtual;
            System.out.printf("Novo Salario: %.2f%n", novoSalario);
            System.out.printf("Reajuste ganho: %.2f%n", reajuste);
            System.out.printf("Em percentual: %.0f %%" , taxa);

        } else if (salarioAtual > 2000.00) {
            double taxa = 4;
            double novoSalario = (salarioAtual * 0.04) + salarioAtual;
            double reajuste = novoSalario - salarioAtual;
            System.out.printf("Novo Salario: %.2f%n", novoSalario);
            System.out.printf("Reajuste: %.2f%n", reajuste);
            System.out.printf("Em percentual: %.0f %%" , taxa);

        }


    }
}
