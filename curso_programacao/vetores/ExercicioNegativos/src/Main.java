import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

       System.out.println("Quantos numeros você vai adicionar? ");
       int n =  sc.nextInt();

       int [] itens = new int[n];

       for(int i =0;i<n;i++){
           System.out.print("Digite um numero: ");
           itens[i] = sc.nextInt();

       }

       System.out.println("NUMEROS NEGATIVOS: ");
       for(int i =0;i<n;i++){
           if(itens[i]<0){
               System.out.println (itens[i]);
           }
       }


    sc.close();





    }
}