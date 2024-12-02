package atributos;

import java.util.Scanner;

public class Teste {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Quadrado quadrado = new Quadrado();
		Triangulo triangulo = new Triangulo("Azul",5,12);
		Circulo circulo = new Circulo("Verde", 12.5);
		Retangulo retangulo = new Retangulo("Rosa",32,12);
		
	quadrado.setCor(sc.next());
	quadrado.setLado1(sc.nextDouble());
	quadrado.setLado2(sc.nextDouble());
	
	System.out.println(quadrado);
	System.out.println(triangulo);
	System.out.println(circulo);
	System.out.println(retangulo);
	
	sc.close();
	
	
	
	}

}
