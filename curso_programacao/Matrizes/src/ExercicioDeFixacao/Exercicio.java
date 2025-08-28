package ExercicioDeFixacao;

import java.util.Scanner;

public class Exercicio {
    public static void main(String[] args) {
        /*Faça um programa para ler dois numeros inteiros M e N. ------------OK
         *depois ler uma matriz de M linhas e N colunas contendo numeros inteiros
        podendo haver repetições. ------------- OK
         * Em seguida, ler um numero inteiro X que pertence a matriz. ----------------- OK
         * Para cada ocorrencia de X , mostras os valores a esquerda, acima, a direita e abaixo de X, quando houver.*/

        Scanner sc = new Scanner(System.in);

        System.out.print("Escreva a quantidade de linhas da matriz: ");
        int m = sc.nextInt();
        System.out.print("Escreva a quantidade de colunas da matriz: ");
        int n = sc.nextInt();

        int[][] mat = new int[m][n];

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                mat[i][j] = sc.nextInt();
            }
        }

        System.out.print("Escreva um numero que você quer verificar na matriz: ");
        int x = sc.nextInt();
        System.out.println("-----------------------------------------------");

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                if (mat[i][j] == x) {
                    System.out.println("Posição: " + i + ", " + j);
                     if (j > 0) {
                    System.out.println("À Esquerda: " + mat[i][j - 1]);
                }
                     if (i > 0) {
                    System.out.println("Acima: " + mat[i - 1][j]);
                }
                     if (j < mat[i].length - 1) {
                    System.out.println("À Direita: " + mat[i][j + 1]);
                }
                     if (i < mat.length - 1) {
                    System.out.println("Abaixo: " + mat[i + 1][j]);
                }
            }
        }
    }


        sc.close();
    }
}
