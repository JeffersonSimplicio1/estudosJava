package application;

public class Retangulo {

	public double altura;
	public double largura;

	public double calculoDeArea() {
		double area = altura * largura;
		return area;

	}

	public double perimetro() {
		double perimetro = 2*(altura+largura);
		return perimetro;
	}

	public double diagonal() {
		double diagonal = Math.sqrt(Math.pow(altura, 2) + Math.pow(largura, 2));
		return diagonal;

	}
}
