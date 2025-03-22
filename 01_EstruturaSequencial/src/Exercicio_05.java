import java.util.Scanner;

public class Exercicio_05 {

	public static void main(String[] args) {
		// Faça um programa que converta metros para centímetros:
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite uma medida em metros: ");
		double medidaMetro = sc.nextDouble();
		
		double conversao = medidaMetro * 100;
		
		System.out.println("A medida em centimetros é: " + conversao);
		
		sc.close();
	}

}
