package Soma;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos numeros voce vai digitar? ");
        int n = sc.nextInt();
        double soma =0;

        double [] vect = new double[n];

        for(int i=0; i<n;i++){
            vect[i] = sc.nextDouble();
            soma = soma + vect[i];
        }
        System.out.printf("VALORES =");

        for(int i =0; i<n; i++){
            System.out.print(" " + vect[i] + " ");
        }
            System.out.println();
            System.out.printf("SOMA = %.2f%n", soma);
            System.out.printf("MEDIA = %.2f%n", soma/n);
    }
}
