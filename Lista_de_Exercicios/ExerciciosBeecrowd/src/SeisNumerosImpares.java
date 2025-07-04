import java.util.Scanner;

public class SeisNumerosImpares {
    public static void main(String[]args) {
            Scanner scanner = new Scanner(System.in);

            int X = scanner.nextInt();

            // Se X for par, começa do próximo número ímpar
            if (X % 2 == 0) {
                X += 1;
            }

            // Imprime os 6 valores ímpares consecutivos
            for (int i = 0; i < 6; i++) {
                System.out.println(X + 2 * i);
            }

            scanner.close();
        }
    }

