package ExercicioDeFixacao03;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        /*Gere e imprima uma matriz 10x10 com valores aleatorios entre 0-9.
        * Após isso determine qual é o maior e menor valor da linha 5 e
        * qual o maior e menor valor da linha 7 */

        Random random = new Random();
        int [] [] matriz = new int[10][10];

        for(int i = 0; i< matriz.length; i++){
            for(int j =0; j< matriz[i].length; j++){
                matriz [i] [j] = random.nextInt(9);
            }
        }

        for(int i = 0; i< matriz.length; i++){
            for(int j =0; j< matriz[i].length; j++){
                System.out.print( matriz [i] [j] + " ");
            }
            System.out.println();
        }

        int maiorCinco = matriz [0] [0];
        int menorCinco = matriz [0] [0];

        for(int i = 0; i < matriz[5]. length;i++ ){
                if(matriz[5] [i] > maiorCinco){
                    maiorCinco = matriz[5] [i];
                }
                if(matriz[5] [i] < menorCinco){
                    menorCinco = matriz[5] [i];
                }

        }
        System.out.println("Maior numero da linha 5: " + maiorCinco);
        System.out.println("Menor numero da linha 5: " + menorCinco);

        int maiorSete = matriz[0] [0];
        int menorSete = matriz[0] [0];

        for(int i = 0; i< matriz[7].length; i++){
            if(matriz[7] [i] > maiorSete){
                maiorSete = matriz [7] [i];
            }
            if (matriz [7] [i] < menorSete ){
                menorSete = matriz[7] [i];
            }
        }
        System.out.println("------------------------------------------------------------");
        System.out.println("Maior numero da linha 7: " + maiorSete);
        System.out.println("Menor numero da linha 7: " + menorSete);
    }
}
