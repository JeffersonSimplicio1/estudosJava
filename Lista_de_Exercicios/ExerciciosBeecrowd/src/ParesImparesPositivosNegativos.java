import java.util.Scanner;

public class ParesImparesPositivosNegativos {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        int [] valor = new int[5];
        int contPar = 0;
        int contImpar =0;
        int contPositivo = 0;
        int contNegativo =0;

        for(int i = 0; i < valor.length; i++){
            valor[i] = sc.nextInt();

                if(valor[i] > 0){
                    contPositivo ++;
                } else if(valor[i]<0){
                    contNegativo++;
                }

                if(valor[i]%2 ==0){
                    contPar++;
                } else{
                    contImpar++;
                }

        }
        System.out.println(contPar + " valor(es) par(es)");
        System.out.println(contImpar + " valor(es) impar(es)");
        System.out.println(contPositivo + " valor(es) positivo(s)");
        System.out.println(contNegativo + " valor(es) negativo(s)");

    }
}
