import java.util.Locale;
import java.util.Scanner;

public class Cadastramento {
    public static void main(String[] args) {
                    Scanner sc = new Scanner(System.in);
                    Locale.setDefault(Locale.US);

        Colaborador colaborador = new Colaborador();
        System.out.print("Insira o nome do colaborador: ");
        colaborador.nome =sc.nextLine();
        System.out.print("insira o email do colaborador: ");
        colaborador.email = sc.nextLine();
        System.out.print("Insira a idade do colaborador: ");
        colaborador.idade = sc.nextInt();

        System.out.println(colaborador.toString());





    }
}
