import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int numero = sc.nextInt();
        double soma= 0;

        double[] vect = new double[numero];

        for (int i = 0; i<numero ; i++){
            vect[i] = sc.nextDouble();
            soma = soma + vect[i];
        }
        double media = soma / numero;
        System.out.println(media);


    }
}