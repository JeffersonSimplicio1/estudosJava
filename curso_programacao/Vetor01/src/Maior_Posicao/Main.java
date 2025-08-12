package Maior_Posicao;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.print("Quantos numeros voce vai digitar? ");
        int n = sc.nextInt();
        sc.nextLine();

        double [] vect = new double[n];

        for(int i =0; i<n; i++){
            System.out.print("Digite um numero: ");
            vect[i] = sc.nextDouble();

        }
        double maior = 0;
        int posMaior= 0;

        for(int i=0; i<n;i++){
            if(vect[i] > maior){
                maior = vect[i];
                posMaior = i;
            }
        }
        System.out.printf("MAIOR VALOR = %.1f%n", maior);
        System.out.printf("POSIÇÃO DO MAIOR VALOR = %d%n", posMaior);

        sc.close();
    }
}
