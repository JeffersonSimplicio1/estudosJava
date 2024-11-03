package tratamento_de_execoes;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class tramentoDeExecoes {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		try {
			System.out.println("Digite o nome: ");
			String nomeUsuario = sc.next();
			System.out.println("Digite o sobrenome1: ");
			String sobrenome = sc.next();
			
			System.out.println("Digite a idade: ");
			int idade = sc.nextInt();
			System.out.println("Digite a altura: ");
			double altura = sc.nextDouble();
			
			System.out.println("Olá " + nomeUsuario + " " +sobrenome + ". A idade informada foi: " + idade + " e a Altura foi : " + altura );
				
		} catch(InputMismatchException e) {
			System.err.println("A idade e Altura devem ser informadas com caracters numericos");
			System.err.println("A Altura deve ser informada separada por ponto");
			main(args);
		}
		sc.close();

	}

}
