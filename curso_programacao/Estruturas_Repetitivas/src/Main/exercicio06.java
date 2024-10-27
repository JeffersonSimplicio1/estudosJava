package Main;

import java.util.Scanner;

public class exercicio06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		for(int i=1; i<=N;i++) {
			
			double valorUm = sc.nextDouble();
			double valorDois = sc.nextDouble();
			double valorTres = sc.nextDouble();
			
			double media = ((valorUm *2)+(valorDois * 3)+(valorTres * 5))/10;
			
			System.out.printf("%.1f%n", media);
			
		}
	}

}
