import java.util.Scanner;

public class ParesEntreCincoNumeros {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int contador = 0;
        int [] valor = new int [5];

        for (int i = 0; i < valor.length; i++){
            valor[i] = sc.nextInt();
                if(valor[i]%2 == 0){
                    contador ++;
                }

        }
        System.out.println(contador + " valores pares");
        sc.close();;
    }

}
