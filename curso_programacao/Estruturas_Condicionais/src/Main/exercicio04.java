package Main;

import java.util.Scanner;

public class exercicio04 {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner (System.in);
		 
		 int inicioDoJogo = scanner.nextInt();
		 int fimDoJogo = scanner.nextInt();
		 
		 int duracao;
		 if(inicioDoJogo < fimDoJogo) {
			 duracao = fimDoJogo - inicioDoJogo ;
		 } else {
			 duracao = 24 - inicioDoJogo + fimDoJogo;
		 }
		 System.out.println("O jogo durou " + duracao + " hora(s)");
		 
		 scanner.close();
	}

}
