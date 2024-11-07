package Aplicacao;

public class Dados {
	public String nome;
	public double salarioBruto;
	public double impostos;
	public double porcetagemDeAumento;
	
	public double salarioLiquido() {
		double salarioLiquido = salarioBruto-impostos;
		return salarioLiquido;
	}
	
	public double AumentoDeSalario() {
		double salarioAtualizado = (salarioBruto * porcetagemDeAumento)/100;
		salarioAtualizado = salarioAtualizado + salarioLiquido();
		return salarioAtualizado;
		
	}
	
	
	
	
	
	
	
}
