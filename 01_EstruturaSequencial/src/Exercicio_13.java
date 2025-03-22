import java.util.Scanner;

public class Exercicio_13 {

	public static void main(String[] args) {
		/*Tendo como dados de entrada um arquivo em Gigabytes,
		  	construa um algoritmo que faça a conversão para Megabytes e Kilobytes, 
		 	usando as seguintes fórmulas:

			* Para Megabytes: Gigabytes * 1024
			* Para Kilobytes: Gigabytes * 1024 * 1024
			* Responda o tamanho do arquivo em Megabytes e o tamanho em Kilobytes.*/
			
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Qual o tamanho em Gigabytes? ");
		int gb = sc.nextInt();
		int mb = gb * 1024;
		int kb = mb*1024;
		
		System.out.println("O valor em mb é de: "+ mb);
		System.out.println("O valor em kb é de: "+ kb) ;
		
		sc.close();
	}
	
}
