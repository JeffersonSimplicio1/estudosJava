import java.util.Locale;
import java.util.Scanner;

public class DesafioLanche {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		int codigo = sc.nextInt();
		int quantidade = sc.nextInt();
		double valor, total;
		
		switch(codigo) {
		case 1: 
			valor = 4.00;
			total = valor * quantidade;
			System.out.printf("Total: R$ %.2f%n", total);
			break;
		case 2:
			valor = 4.50;
			total = valor * quantidade;
			System.out.printf("Total: R$ %.2f%n", total);
			break;
		case 3:
			valor = 5.00;
			total = valor * quantidade;
			System.out.printf("Total: R$ %.2f%n", total);
			break;
		case 4:
			valor = 2.00;
			total = valor * quantidade;
			System.out.printf("Total: R$ %.2f%n", total);
			break;
		case 5:
			valor = 1.50;
			total = valor * quantidade;
			System.out.printf("Total: R$ %.2f%n", total);
			break;
		}
		
		
	
		
		sc.close();
	}

}
