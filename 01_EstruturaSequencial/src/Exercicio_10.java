import java.util.Scanner;

public class Exercicio_10 {

	public static void main(String[] args) {
		/* Faça um programa que peça a temperatura em graus Celsius, 
		  transforme e mostre em graus Fahrenheit.*/
		
	Scanner sc = new Scanner(System.in);
		
		System.out.println("Qual a temperatura em Celcius? ");
		double tempCelcius = sc.nextDouble();
		
		double convercaoFahrenheit = (tempCelcius *  9/5) + 32;
		
		System.out.printf("A temperatura em graus Fahrenheit é: %.3f%n", convercaoFahrenheit);
		
		sc.close();
		 

	}

}
