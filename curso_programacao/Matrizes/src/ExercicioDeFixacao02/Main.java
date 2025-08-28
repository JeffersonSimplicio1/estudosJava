package ExercicioDeFixacao02;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /* Gere e imprima uma matriz 4x4 com valores aleatorios entre 0-9. após isso
        determine o maior numero da matriz e a posição(Linha, coluna)
        */

        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        int [] [] matriz = new int [4] [4];

        for(int i = 0; i< matriz.length; i++){
            for(int j =0; j< matriz[i].length; j++){
                matriz [i] [j] = random.nextInt(10);
            }
        }
        int maior = matriz[0] [0];

        for(int i =0; i< matriz.length; i++){
            for(int j =0; j< matriz[i].length; j++) {
                if (matriz[i][j] > maior) {
                    maior = matriz[i][j];
                }
            }
        }
        System.out.println(maior);
    }
}
