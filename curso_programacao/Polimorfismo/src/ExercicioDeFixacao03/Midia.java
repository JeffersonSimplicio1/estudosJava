package ExercicioDeFixacao03;

import java.util.Scanner;

public class Midia {
    private int codigo;
    private double preco;
    private String nome;

    public Midia(){

    }

    public Midia(int codigo, double preco, String nome) {
        this.codigo = codigo;
        this.preco = preco;
        this.nome = nome;
    }
//SET: Metodos para inserir valores nos campos
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    //GET: Metodos que retornam os valores contidos nos campos
    public int getCodigo() {
        return codigo;
    }

    public double getPreco() {
        return preco;
    }

    public String getNome() {
        return nome;
    }

    public String getTipo() {
        return " Midia: ";
    }
    public String getDetalhes(){
        return "Codigo: " + getCodigo() + "\n" +
                "Nome: " + getNome() + "\n"  +
                " Preço: " + getPreco() + "\n";

    }
    public void printDados(){
        String s = getTipo() + "\n" + getDetalhes() + "\n";
        System.out.println(s);
    }
    public void inserirDados(){
        Scanner sc = new Scanner(System.in);

        System.out.println("\n Entre com o código: ");
        int cod = sc.nextInt();
        System.out.println("\n Entre com o preço: ");
        double pre = sc.nextDouble();
        System.out.println("\n Entre com o nome: ");
        String nome = sc.nextLine();

        //enviando dados lidos para as funçoes SET.
        setCodigo(cod);
        setPreco(pre);
        setNome(nome);

    }
}
