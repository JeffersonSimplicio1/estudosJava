import java.util.Scanner;

public class Exercicio_16 {

	public static void main(String[] args) {
		/*Faça um programa para uma loja de tintas. O programa deverá pedir 
		  o tamanho em metros quadrados da área a ser pintada. Considere que 
		  a cobertura da tinta é de 1 litro para cada 3 metros quadrados e que 
		  a tinta é vendida em latas de 18 litros, que custam R$ 80,00. Informe
		   ao usuário a quantidades de latas de tinta a serem compradas e o preço
	   		total.*/
		
					Scanner sc = new Scanner(System.in);
					
			        System.out.print ("Digite o tamanho em metros quadrados da área a ser pintada: ");
			        double area = sc.nextDouble();

			        double litrosNecessarios = area / 3;
			        int latasNecessarias = (int) Math.ceil(litrosNecessarios / 18);

			        double precoTotal = latasNecessarias * 80;

			        System.out.println("Quantidade de latas de tinta necessárias: " + latasNecessarias);
			        System.out.println("Preço total: R$ " + precoTotal);
			 

			
			sc.close();
			
			
			

	}

}
