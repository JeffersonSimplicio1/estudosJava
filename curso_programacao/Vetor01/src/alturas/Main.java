package alturas;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.print("Quantas pessoas serao digitadas? ");
        int n = sc.nextInt();
        double somaAltura =0;
        int contador =0;

        Dados [] pessoa = new Dados[n];

        for(int i = 0; i<n; i++){
            System.out.printf("Dados da %da pessoa:\n", i + 1);
            sc.nextLine();
            System.out.print("Nome: ");
            String nome = sc.next();
            sc.nextLine();
            System.out.print("Idade: ");
            int idade = sc.nextInt();
            if(idade<16){
                contador = contador+1;
            }
            sc.nextLine();
            System.out.print("Altura: ");
            double altura = sc.nextDouble();
            somaAltura = somaAltura+  altura;

            pessoa[i] = new Dados(nome, idade, altura);
        }
        System.out.println();
        System.out.println("Altura média: " + somaAltura/n);
        double porcentagem= (contador*100)/n;
        System.out.printf("Pessoas com menos de 16 anos: %.1f%%%n ", porcentagem);
    }
}
