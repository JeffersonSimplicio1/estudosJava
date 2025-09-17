package ExercicioDeFixacao03;

import java.util.Scanner;

public class CD extends Midia {
    private int nMusicas;

    public CD() {

    }

    public CD(int codigo, double preco, String nome, int nMusicas) {
        super(codigo, preco, nome);
        this.nMusicas = nMusicas;
    }

    @Override
    public String getTipo() {
        return " CD: ";
    }

    @Override
    public String getDetalhes() {
        return super.getDetalhes() + "\n" +
                "Numero de musicas: " + nMusicas + "\n";

    }


    public void setMusica(int nmus) {
        nMusicas = (nmus > 0) ? nmus : 0;
    }

    @Override
    public void inserirDados() {
        super.inserirDados();
        Scanner sc = new Scanner(System.in);

        System.out.println("\n Entre com o numero de musicas: ");
        int nmus = sc.nextInt();

        setMusica(nmus);
    }
}