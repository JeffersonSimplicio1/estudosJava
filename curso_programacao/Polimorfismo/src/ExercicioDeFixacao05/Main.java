package ExercicioDeFixacao05;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        List<Pessoas> list = new ArrayList<>();

        System.out.print("Insira o numero de contribuintes: ");
        int n = sc.nextInt();

        for(int i =0; i<n; i++ ){
            System.out.println("Dados do Contribuinte #" + (i+1) );
            System.out.print("Pessoa Fisica ou Juridica (f/j)? ");
            char ch = sc.next().charAt(0);
            sc.nextLine();

            if(ch == 'f'){
                System.out.print("Nome: ");
                String nome = sc.nextLine();
                System.out.print("Renda Anual: ");
                double rendaAnual = sc.nextDouble();
                System.out.print("Gastos com Saúde: ");
                double gastosSaude = sc.nextDouble();

                list.add(new PessoaFisica(nome,rendaAnual,gastosSaude));
            } else if (ch == 'j'){
                System.out.print("Nome: ");
                String nome = sc.nextLine();
                System.out.print("Renda Anual: ");
                double rendaAnual = sc.nextDouble();
                System.out.print("Numeros  de funcionarios: ");
                int numeroFuncionarios = sc.nextInt();

                list.add(new PessoaJuridica(nome,rendaAnual,numeroFuncionarios));
            }

        }
        System.out.println();
        double sum = 0;
        System.out.println("Impostos Pagos: ");
        for(Pessoas pessoas : list ){
            System.out.printf(pessoas.toString());
            sum += pessoas.impostoPago();
        }

        System.out.println();
        System.out.println("Total de Impostos: $ " + String.format("%.2f", sum));



        sc.close();
    }
}
