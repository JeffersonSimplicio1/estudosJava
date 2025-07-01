import java.util.Locale;
import java.util.Scanner;

public class PositivoE_Media {
    public static void  main (String[]args){
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        double [] valor = new double [6];
        int contador = 0;
        double soma =0;

        for(int i =0; i<valor.length;i++){
            valor[i] = sc.nextDouble();

            if (valor[i] > 0) {
                soma = soma + valor[i];
                contador = contador+1;

            }

        }
        double calculo = soma/contador;
        System.out.println(contador + " valores positivos");
        System.out.printf("%.1f%n",  calculo);

        }
}
