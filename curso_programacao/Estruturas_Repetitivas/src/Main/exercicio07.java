package Main;

import java.util.Scanner;

public class exercicio07 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

		for (int i = 1; i <= N; i++) {

			double numeroUm = sc.nextDouble();
			double numeroDois = sc.nextDouble();
			double divisao;

			if (numeroDois != 0) {
				divisao = numeroUm / numeroDois;
				System.out.println(divisao);
			} else {
				System.out.println("divisao impossivel");
			}

		}

		sc.close();
	}

}
