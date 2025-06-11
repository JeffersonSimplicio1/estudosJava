import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc =  new Scanner(System.in);
        Locale.setDefault(Locale.US);
//A dona de um pensionato possui dez quartos para alugar
// para estudantes, sendo esses quartos identificados pelo numero de 0 a 9

//Faça um programa que inicie com todos os dez quartos vazios, e depois
// leia uma quantidade N representando o numero de estudantes que vao alugar
// quartos (N pode ser de 1 a 10). Em seguida, registre o aluguel dos N estudantes.
// Para cada registro de aluguel, informar o nome e email do estudante, bem como qual dos quartos
// ele escolheu (de 0 a 9). Suponha que seja escolhido um quarto vago. Ao final, seu programa deve
// imprimir um relatorio de todas as ocupações do pensionato, por ordem de quarto.

        Aluguel [] vect = new Aluguel[10];

        System.out.println("Quantos quartos serão alugados?");
        int n = sc.nextInt();

        for(int i =0;i<n;i++){
            System.out.println("Aluguel #" +i+ ":");
            System.out.print("Nome: ");
            sc.nextLine();
            String nome = sc.nextLine();
            System.out.print("Email: ");
            String email = sc.next();
            System.out.print("Quarto: ");
            int numeroQuarto = sc.nextInt();

            vect[numeroQuarto] = new Aluguel(nome,email);
        }
        System.out.println();
        System.out.println("Quartos alugados: ");
        for(int i =0;i<10;i++){
            if(vect[i] != null){
                System.out.println(i + ": " + vect[i]);
            }
        }
    }
}
