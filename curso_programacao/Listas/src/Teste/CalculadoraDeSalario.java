package Teste;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;


public class CalculadoraDeSalario {
    public static void main(String[] args) {
                Locale.setDefault(Locale.US);
                Scanner sc = new Scanner(System.in);

        System.out.println("Quantos colaboradores você vai adicionar? ");
        int n = sc.nextInt();
        double faturamentoCalculo = 0;
        double salarioBruto = 0;
        double salarioComercio = 1800.00;




        List<RegraJr> list = new ArrayList<>();

        for(int i=0; i<n; i++){
            System.out.println();
            System.out.print("Qual o nome do colaborador #" + (i+1)+ ": ");
            sc.nextLine();
            String nome = sc.nextLine();
            System.out.print("Matricula: ");
            int matricula = sc.nextInt();
            System.out.print("Faturamento: ");
            double faturamento = sc.nextDouble();

            if(faturamento > 40000){
                faturamentoCalculo = faturamento * 0.01;
                double descansoRemunerado = faturamento * 0.005;
                double nPs = salarioComercio * 0.25;
                double fFv = salarioComercio*0.25;

                salarioBruto = faturamentoCalculo + salarioComercio+ nPs + fFv;
            } else {
                double descansoRemunerado = faturamento * 0.0025;
                double nPs = 200;
                double fFv = 200;
                salarioBruto = salarioComercio + descansoRemunerado;
            }

            RegraJr junior = new RegraJr(nome,matricula,faturamento);
            list.add(junior);

        }

        for(RegraJr e : list){
            System.out.println(e);
            System.out.println("SalarioBruto: " + salarioBruto);

        }





    }
}
