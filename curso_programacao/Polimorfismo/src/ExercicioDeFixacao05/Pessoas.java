package ExercicioDeFixacao05;

public abstract class Pessoas {
    private String nome;
    private double rendaAnual;
    private double impostoPago;

    public Pessoas() {

    }

    public Pessoas(String nome, double rendaAnual) {
        this.nome = nome;
        this.rendaAnual = rendaAnual;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getRendaAnual() {
        return rendaAnual;
    }

    public void setRendaAnual(double rendaAnual) {
        this.rendaAnual = rendaAnual;
    }

    public double impostoPago(){

        return 0;
    }

    public String toString() {
        return nome + ": $ " + impostoPago  +  "\n";
    }
}
