import java.util.Scanner;

public class Exercicio_07 {

	public static void main(String[] args) {
		/* Faça um programa que calcule a área de um quadrado, em seguida mostre
		o dobro desta área para o usuário.*/
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Qual a medida do lado do quadrado? ");
		double ladoQuadrado = sc.nextDouble();
		double areaQuadrado = Math.pow(ladoQuadrado, 2);
		double dobroArea = areaQuadrado * 2;
		
		System.out.println("O dobro da area do quadrado é: "+ dobroArea);
		
		sc.close();

	}

}
