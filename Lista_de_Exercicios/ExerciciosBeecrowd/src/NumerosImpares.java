import java.util.Scanner;

public class NumerosImpares {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero = sc.nextInt();
        int [] valor = new int [numero];

        for(int i = 0 ; i < valor.length; i++) {
            valor[i] = i + 1;
        }

        for(int i = 0; i<valor.length; i++){
            if(valor[i]%2!=0) {
                System.out.println(valor[i]);
            }
          }
        }
    }

//        for (int i = 0; i < numero; i++) {
//            if (i % 2 != 0) {
//                System.out.println(i);
//            }
//        }
//    }
//}




