import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
// criando a matriz 3x3

    int [] [] mat = new int [n] [n];

    for(int i= 0; i<n; i++){
        //for(int i = 0; i< mat.length; i++)
        for(int j = 0; j<n; j++){
            //for(int j = 0; j< mat [i].length; j++)
            mat[i] [j] = sc.nextInt();
        }
    }
// imprimindo a diagonal principal
        System.out.print(" Main Diagonal: ");
     for(int i =0; i<n; i++){
         //for(int i = 0; i< mat.length; i++)
         System.out.print(mat [i] [i] + ", ");
     }
        System.out.println();

     //Contando a quantidade de numeros negativos
    int count = 0;
    for(int i =0; i<n; i++){
        //for(int i = 0; i< mat.length; i++)
        for(int j =0; j<n; j++){
            //for(int j = 0; j< mat [i] .length; j++)
            if(mat[i] [j] < 0){
                count = count + 1;
        }
        }
    }

    sc.close();
    }
}