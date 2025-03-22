import java.util.Scanner;

public class Exercicio_12 {

	public static void main(String[] args) {
		/*Tendo como dados de entrada um arquivo em Gigabytes, 
		  	construa um algoritmo que faça a conversão para Megabytes,
		   	usando a seguinte fórmula
		   	
		   	Gigabytes * 1024
:*/
		
		Scanner sc = new Scanner(System.in);
		
		int gb = sc.nextInt();
		int mb = gb * 1024;
		
		System.out.println(mb);
		
		sc.close();
		

	}

}
