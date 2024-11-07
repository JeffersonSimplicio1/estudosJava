package aplicacao;

public class Dados {
	public String nome;
	public double notaUm;
	public double notaDois;
	public double notaTres;
	
	
	
	public String notaFinal() {
		double notaFinal = notaUm + notaDois + notaTres;
		if(notaFinal >=60) {
			System.out.println("NOTA FINAL: " + notaFinal);
			System.out.println("APROVADO"); 
		} else {
			System.out.println("NOTA FINAL: " + notaFinal);
			double falta = 60 - notaFinal;
			System.out.println("FALTAM " + falta + " PONTOS");
			System.out.println("REPROVADO"); 
	}
		return nome;
		
	}
	}
