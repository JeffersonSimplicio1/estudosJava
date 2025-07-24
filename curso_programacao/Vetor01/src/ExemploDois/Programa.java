package ExemploDois;

import java.util.Locale;
import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int quantidade = sc.nextInt();

        Produtos[] vect = new Produtos[quantidade];

        for(int i = 0; i<quantidade; i++){
            sc.nextLine();
            String nome = sc.nextLine();
            double valor = sc.nextDouble();
            vect [i] = new Produtos(nome, valor);
        }

        double soma = 0;
        for(int i = 0; i<quantidade; i++){
            soma = soma + vect[i].getValor();
        }
        double media = soma / quantidade;
        System.out.println(media);




    }
}
