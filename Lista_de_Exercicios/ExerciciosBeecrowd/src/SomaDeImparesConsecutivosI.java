import java.util.Scanner;

public class SomaDeImparesConsecutivosI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int y = sc.nextInt();
        int soma = 0;

        // Garantir que x seja o menor e y o maior
        int inicio = Math.min(x, y);
        int fim = Math.max(x, y);

        // Percorre os números entre x e y (excluindo x e y)
        for (int i = inicio + 1; i < fim; i++) {
            if (i % 2 != 0) { // Se for ímpar
                soma += i;
            }
        }

        System.out.println(soma);

        sc.close();
    }
}
