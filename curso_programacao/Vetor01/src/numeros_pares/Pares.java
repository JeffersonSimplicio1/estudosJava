package numeros_pares;

import java.util.Scanner;

public class Pares {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

    System.out.print("Quantos numeros voce vai digitar? ");
        int n = sc.nextInt();
        int soma = 0;

        int [] vect = new int[n];

        for(int i =0; i<n;i++){
        System.out.print("Digite um numero: ");
        vect[i] = sc.nextInt();
        }
        System.out.println("NUMEROS PARES: ");
        for(int i=0;i<n;i++){
            if(vect[i]%2 ==0){
                soma = soma + 1;
                System.out.print(vect[i] + "    ");
            }
        }
        System.out.println();
        System.out.print("QUANTIDADE DE PARES = "+ soma);
    }
}
