import java.util.Scanner;

public class Exercicio_09 {

	public static void main(String[] args) {
		/*Faça um programa que peça a temperatura em graus Fahrenheit,
			transforme e mostre a temperatura em graus Celsius. */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Qual a temperatura em Fahrenheit? ");
		double tempFahrenheit = sc.nextDouble();
		
		double convercaoCelcius = 5*((tempFahrenheit - 32 ) / 9);
		
		System.out.printf("A temperatura em graus Celcius é: %.3f%n", convercaoCelcius);
		
		sc.close();

	}

}
