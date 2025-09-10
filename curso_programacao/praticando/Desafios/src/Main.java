import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double valorCompra = sc.nextDouble();

        if(valorCompra < 50.00){
            System.out.println("Desconto de 0%");
        } else if(valorCompra >50.00 && valorCompra <= 100.00){
            System.out.println("Desconto de 10%");
        } else if( valorCompra > 100.00){
            System.out.println("Desconto de 20%");
        }

        sc.close();

    }

}