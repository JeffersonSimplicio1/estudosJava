package application;

import entities.Contract;
import entities.Installment;
import services.ContractService;
import services.PaypalService;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.println("Entre com o numero do contrato: ");
        System.out.println("Numero: ");
        int numero = sc.nextInt();
        System.out.println("Data (dd/MM/yyyy): ");
        LocalDate date = LocalDate.parse(sc.next(),fmt);
        System.out.println("Valor do contrato: ");
        double totalValue = sc.nextDouble();

        Contract obj = new Contract(numero, date, totalValue);

        System.out.print("Entre com o numero de parcelas: ");
        int n = sc.nextInt();

        ContractService contractService = new ContractService(new PaypalService());
        contractService.processContract(obj,n);

        System.out.println("Parcelas: ");

        for(Installment installment : obj.getInstallments()){
            System.out.println(installment);
        }


        sc.close();


    }
}
