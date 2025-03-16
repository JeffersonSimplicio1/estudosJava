import java.util.Scanner;

public class Exercicio_04 {

	public static void main(String[] args) {
		// Faça um programa que peça as 4 notas bimestrais e mostre a média.
		
		Scanner sc = new Scanner(System.in);
		
	System.out.print("Digite a nota do primeiro semestre: ");
	double primeiraNota = sc.nextDouble();
	
	System.out.print("Digite a nota do Segundo semestre: ");
	double segundaNota = sc.nextDouble();
	
	System.out.print("Digite a nota do terceira semestre: ");
	double terceiraNota = sc.nextDouble();
	
	System.out.print("Digite a nota do quarta semestre: ");
	double quartaNota = sc.nextDouble();
	
	double media = (primeiraNota +segundaNota + terceiraNota + quartaNota) / 4;
	
	System.out.print("A media do seu bimestre é: " + media);
	
		
		
		sc.close();
	}

}
