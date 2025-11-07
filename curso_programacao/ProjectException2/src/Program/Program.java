package Program;

import java.util.Locale;
import java.util.Scanner;
import entities.Account;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);


        System.out.println("Entre com o numero da conta: ");
        System.out.print("Numero: ");
        int numero = sc.nextInt();

        System.out.print("Titular: ");
        String titular = sc.next();
        sc.nextLine();

        System.out.print("Saldo inicial: ");
        double saldoInicial = sc.nextDouble();

        System.out.print("Limite de saque: ");
        double limiteSaque = sc.nextDouble();

        System.out.print("Insira o valor para saque: ");
        double valorSaque = sc.nextDouble();

       Account conta = new Account(numero, titular, saldoInicial, limiteSaque, valorSaque);


        System.out.printf(conta.toString()

        );

sc.close();


    }
}
