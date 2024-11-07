package aplicacao;

import java.util.Locale;
import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Dados dados = new Dados();
		
		System.out.print("Nome: ");
		dados.nome = sc.next();
		System.out.println("Notas: ");
		dados.notaUm =sc.nextDouble();
		dados.notaDois =sc.nextDouble();
		dados.notaTres =sc.nextDouble();
		
		System.out.println(dados.notaFinal());
		
	
	
	}

}
