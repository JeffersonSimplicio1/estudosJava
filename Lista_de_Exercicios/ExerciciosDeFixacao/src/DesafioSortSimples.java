import java.util.Scanner;

public class DesafioSortSimples {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int valorUm = sc.nextInt();
		int valorDois = sc.nextInt();
		int valorTres = sc.nextInt();

		if (valorUm < valorDois && valorUm < valorTres) {
			System.out.println(valorUm);
			if (valorDois < valorTres) {
				System.out.println(valorDois);
				System.out.println(valorTres);
			} else {
				System.out.println(valorTres);
				System.out.println(valorDois);
			}
		} else if (valorDois < valorUm && valorDois < valorTres) {
			System.out.println(valorDois);
			if (valorUm < valorTres) {
				System.out.println(valorUm);
				System.out.println(valorTres);
			} else {
				System.out.println(valorTres);
				System.out.println(valorUm);
			}
		} else if (valorTres < valorUm && valorTres < valorDois) {
			System.out.println(valorTres);
			if (valorUm < valorDois) {
				System.out.println(valorUm);
				System.out.println(valorDois);
			} else {
				System.out.println(valorDois);
				System.out.println(valorUm);
			}
		}
		System.out.println();
		System.out.println(valorUm);
		System.out.println(valorDois);
		System.out.println(valorTres);

		sc.close();
	}

}
