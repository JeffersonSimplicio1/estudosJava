package ExercicioDeFixacao05;

public class PessoaJuridica extends Pessoas{
    private int numeroFuncionarios;

    public PessoaJuridica(){
        super();
    }

    public PessoaJuridica(String nome, double rendaAnual, int numeroFuncionarios) {
        super(nome, rendaAnual);
        this.numeroFuncionarios = numeroFuncionarios;
    }

    public int getNumeroFuncionarios() {
        return numeroFuncionarios;
    }

    public void setNumeroFuncionarios(int numeroFuncionarios) {
        this.numeroFuncionarios = numeroFuncionarios;
    }
    @Override
    public double impostoPago(){
        double imposto = 0;
        if(numeroFuncionarios >  10){
            imposto = getRendaAnual() * 0.14;
        } else {
            imposto = getRendaAnual() * 0.16;
        }
        return imposto;
    }
    public String toString() {
        return getNome() + ": $ " + String.format("%.2f", impostoPago()) + "\n";
    }
}
