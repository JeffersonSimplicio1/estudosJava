import java.util.Scanner;

public class NumerosPsitivos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double [] valores = new double [6];
        int contador = 0;
        for(int i =0; i< valores.length; i++){
            valores[i] = sc.nextDouble();

            if(valores[i] > 0){
                contador = contador + 1;

            }

        }
        System.out.println(contador + "valores positivos");
     }
}
